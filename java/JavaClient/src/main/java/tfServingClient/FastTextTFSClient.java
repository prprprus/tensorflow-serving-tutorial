package tfServingClient;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import tensorflow.serving.Model;
import org.tensorflow.framework.DataType;
import org.tensorflow.framework.TensorProto;
import org.tensorflow.framework.TensorShapeProto;

import tensorflow.serving.Predict;
import tensorflow.serving.PredictionServiceGrpc;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement the Java client of Tensorflow Serving
 *
 * @author  Wang Xiao
 */
public class FastTextTFSClient {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String host = "127.0.0.1";
        int port = 8500;
        // the model's name.
        String modelName = "fastText";
        int seqLen = 50;

        // assume this model takes input of free text, and make some sentiment prediction.
        List<Integer> intData = new ArrayList<Integer>();
        for(int i=0; i<seqLen; i++){
            intData.add(i);
        }

        // create a channel for gRPC
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        PredictionServiceGrpc.PredictionServiceBlockingStub stub = PredictionServiceGrpc.newBlockingStub(channel);

        // create a modelspec
        Model.ModelSpec.Builder modelSpecBuilder = Model.ModelSpec.newBuilder();
        modelSpecBuilder.setName(modelName);
        modelSpecBuilder.setSignatureName("fastText_sig_def");

        Predict.PredictRequest.Builder builder = Predict.PredictRequest.newBuilder();
        builder.setModelSpec(modelSpecBuilder);

        // create the TensorProto and request
        TensorProto.Builder tensorProtoBuilder = TensorProto.newBuilder();
        tensorProtoBuilder.setDtype(DataType.DT_INT32);
        for (Integer intDatum : intData) {
            tensorProtoBuilder.addIntVal(intDatum);
        }

        TensorShapeProto.Builder tensorShapeBuilder = TensorShapeProto.newBuilder();
        tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(1));
        tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(seqLen));

        tensorProtoBuilder.setTensorShape(tensorShapeBuilder.build());
        TensorProto tp = tensorProtoBuilder.build();
        builder.putInputs("input_x", tp);
        Predict.PredictRequest request = builder.build();

        // get response
        Predict.PredictResponse response = stub.predict(request);
        System.out.println(response);
    }
}
