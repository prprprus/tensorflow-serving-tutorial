#!/usr/bin/python
#coding=utf8


import os
from datetime import datetime
import tensorflow

from util.cnews_loader import *

os.environ["CUDA_VISIBLE_DEVICES"] = "-1"
pb_dir = "./model/fastText/pb/"
log_file = "./model/fastText/pb/log.txt"

tf = tensorflow.compat.v1
saved_model = tf.saved_model

epochs = 3
seq_length = 50
num_classes = 10
vocab_size = 5000

# verify the consistence of training and tf serving
test_data = np.array([range(seq_length)])


class FastText():
    """
    文本分类，FastText模型
    """

    def __init__(self, seq_length, num_classes, vocab_size):
        """

        :param config:
        """
        self.seq_length = seq_length
        self.num_classes = num_classes
        self.vocab_size = vocab_size
        self.embedding_dim = 128

        self.input_x = tf.placeholder(tf.int32, [None, self.seq_length], name='input_x')
        self.input_y = tf.placeholder(tf.float32, [None, self.num_classes], name='input_y')
        self.learning_rate = tf.placeholder(tf.float32, name='learn_rate')
        self.inference()

    def inference(self):
        """

        :return:
        """
        # 词向量映射
        with tf.name_scope("embedding"):
            embedding = tf.get_variable("embedding", [self.vocab_size, self.embedding_dim])
            embedding_inputs = tf.nn.embedding_lookup(embedding, self.input_x)

        # average vectors, to get representation of the sentence
        with tf.name_scope("average"):
            mean_sentence = tf.reduce_mean(embedding_inputs, axis=1)

        # # tf 1.0
        # l2 = tf.contrib.layers.l2_regularizer(0.001)
        # tf 2.0
        l2 = tensorflow.keras.regularizers.l2(l=0.01)
        # linear classifier
        with tf.name_scope("score"):
            # 分类器
            self.logits = tf.layers.dense(mean_sentence, self.num_classes,
                                          kernel_regularizer=l2,
                                          name='fc2')
            self.y_pred_cls = tf.argmax(tf.nn.softmax(self.logits), 1, name="pred")

        with tf.name_scope("loss"):
            # 损失函数，交叉熵
            cross_entropy = tf.nn.softmax_cross_entropy_with_logits(
                logits=self.logits, labels=self.input_y)

            l2_loss = tf.losses.get_regularization_loss()
            self.loss = tf.reduce_mean(cross_entropy, name="loss")
            self.loss += l2_loss

            # optim
            self.optim = tf.train.AdamOptimizer(
                learning_rate=self.learning_rate).minimize(self.loss)
        with tf.name_scope("accuracy"):
            # 准确率
            correct_pred = tf.equal(tf.argmax(self.input_y, 1), self.y_pred_cls)
            self.acc = tf.reduce_mean(tf.cast(correct_pred, tf.float32), name="acc")


def evaluate(sess, model, x_, y_):
    """
    评估 val data 的准确率和损失
    """
    data_len = len(x_)
    batch_eval = batch_iter(x_, y_, 64)
    total_loss = 0.0
    total_acc = 0.0
    for x_batch, y_batch in batch_eval:
        batch_len = len(x_batch)
        feed_dict = {model.input_x: x_batch, model.input_y: y_batch}
        loss, acc = sess.run([model.loss, model.acc], feed_dict=feed_dict)
        total_loss += loss * batch_len
        total_acc += acc * batch_len

    return total_loss / data_len, total_acc / data_len


def test_model(sess, graph, x_, y_):
    """

    :param sess:
    :param graph:
    :param x_:
    :param y_:
    :return:
    """
    data_len = len(x_)
    batch_eval = batch_iter(x_, y_, 64)
    total_loss = 0.0
    total_acc = 0.0

    input_x = graph.get_operation_by_name('input_x').outputs[0]
    input_y = graph.get_operation_by_name('input_y').outputs[0]
    loss = graph.get_operation_by_name('loss/loss').outputs[0]
    acc = graph.get_operation_by_name('accuracy/acc').outputs[0]

    for x_batch, y_batch in batch_eval:
        batch_len = len(x_batch)
        feed_dict = {input_x: x_batch, input_y: y_batch}
        test_loss, test_acc = sess.run([loss, acc], feed_dict=feed_dict)
        total_loss += test_loss * batch_len
        total_acc += test_acc * batch_len

    return total_loss / data_len, total_acc / data_len


def main():
    word_to_id, id_to_word = word_2_id(vocab_dir)
    cat_to_id, id_to_cat = cat_2_id()

    x_train, y_train = process_file(train_dir, word_to_id, cat_to_id, seq_length)
    x_val, y_val = process_file(val_dir, word_to_id, cat_to_id, seq_length)

    best_acc_val = 0.0  # 最佳验证集准确率
    train_steps = 0

    if not os.path.exists(os.path.split(log_file)[0]):
        os.makedirs(os.path.split(log_file)[0])
    log_f = open(log_file, "w+")
    log_f.write("Input length is {0}\n".format(seq_length))
    log_f.write("Input tensor is {0}\n\n".format(test_data))

    with tf.Graph().as_default():
        fast_model = FastText(seq_length, num_classes, vocab_size)
        sess = tf.Session()
        with sess.as_default():
            sess.run(tf.global_variables_initializer())
            for epoch in range(epochs):
                print('Epoch:', epoch + 1)
                batch_train = batch_iter(x_train, y_train, 32)
                for x_batch, y_batch in batch_train:
                    train_steps += 1
                    learn_rate = 0.001
                    # learning rate vary
                    feed_dict = {fast_model.input_x: x_batch, fast_model.input_y: y_batch,
                                 fast_model.learning_rate: learn_rate}

                    _, train_loss, train_acc = sess.run([fast_model.optim, fast_model.loss,
                                                         fast_model.acc], feed_dict=feed_dict)

                val_loss, val_acc = evaluate(sess, fast_model, x_val, y_val)

                # test data
                feed_dict = {fast_model.input_x: np.array([range(seq_length)])}
                rst = sess.run([fast_model.logits, fast_model.y_pred_cls], feed_dict=feed_dict)
                log = "{0} Epoch predict rst score is {1}, rst cls is {2}\n".format(epoch, rst[0], rst[1])
                print(log)
                log_f.write(log)

                # export pb file
                builder = tf.saved_model.builder.SavedModelBuilder(pb_dir + "{0}".format(epoch))

                if epoch < 1:
                    predict_sig_def = (saved_model.signature_def_utils.build_signature_def(
                        inputs={"input_x": saved_model.build_tensor_info(fast_model.input_x)},
                        outputs={"out_y": saved_model.build_tensor_info(fast_model.y_pred_cls),
                                 "score": saved_model.build_tensor_info(fast_model.logits)},
                        method_name=saved_model.signature_constants.PREDICT_METHOD_NAME
                    ))
                    builder.add_meta_graph_and_variables(sess, ["serve"],
                                                         signature_def_map={"fastText_sig_def": predict_sig_def},
                                                         main_op=tf.tables_initializer(),
                                                         strip_default_attrs=True
                                                         )
                builder.save()
                improved_str = ''
                now_time = datetime.now()
                msg = 'Iter: {0:>6}, Train Loss: {1:>6.2}, Train Acc: {2:>7.2%},' \
                      + ' Val Loss: {3:>6.2}, Val Acc: {4:>7.2%}, Time: {5} {6}'
                print(msg.format(train_steps, train_loss, train_acc, val_loss, val_acc, now_time, improved_str))
    log_f.close()


def test():
    word_to_id, id_to_word = word_2_id(vocab_dir)
    cat_to_id, id_to_cat = cat_2_id()
    x_test, y_test = process_file(test_dir, word_to_id, cat_to_id, seq_length)
    graph_path = "./model_old/fast/ckpt/-846.meta"
    model_path = "./model_old/fast/ckpt/"
    graph = tf.Graph()
    saver = tf.train.import_meta_graph(graph_path, graph=graph)
    sess = tf.Session(graph=graph)
    saver.restore(sess, tf.train.latest_checkpoint(model_path))
    test_loss, test_acc = test_model(sess, graph, x_test, y_test)
    print("Test loss: %f, Test acc: %f" %(test_loss, test_acc))


def valid_cor():
    # load model_old
    graph_path = "./model_old/fast/ckpt/-846.meta"
    model_path = "./model_old/fast/ckpt/"
    graph = tf.Graph()
    saver = tf.train.import_meta_graph(graph_path, graph=graph)
    sess = tf.Session(graph=graph)
    saver.restore(sess, tf.train.latest_checkpoint(model_path))
    # get node reference
    input_x = graph.get_operation_by_name('input_x').outputs[0]
    score = graph.get_operation_by_name('score/Softmax').outputs[0]
    # get output
    input = np.array([range(seq_length)])
    feed_dict = {input_x: input}

    out = sess.run([score], feed_dict=feed_dict)
    print out


if __name__ == "__main__":
    base_dir = os.path.join(os.getcwd(), "./data/cnews")
    train_dir = os.path.join(base_dir, 'cnews.train.txt')
    test_dir = os.path.join(base_dir, 'cnews.test.txt')
    val_dir = os.path.join(base_dir, 'cnews.val.txt')
    vocab_dir = os.path.join(base_dir, 'cnews.vocab.txt')

    if not os.path.exists(vocab_dir):
        build_vocab(train_dir, vocab_dir, vocab_size)

    main()
    # valid_cor()
    # test()
