// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/remote_fused_graph_execute_info.proto

package org.tensorflow.framework;

public final class RemoteFusedGraphExecuteInfoProto {
  private RemoteFusedGraphExecuteInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RemoteFusedGraphExecuteInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_TensorShapeTypeProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RemoteFusedGraphExecuteInfo_TensorShapeTypeProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?tensorflow/core/framework/remote_fused" +
      "_graph_execute_info.proto\022\ntensorflow\032%t" +
      "ensorflow/core/framework/graph.proto\032,te" +
      "nsorflow/core/framework/tensor_shape.pro" +
      "to\032%tensorflow/core/framework/types.prot" +
      "o\"\202\004\n\033RemoteFusedGraphExecuteInfo\022*\n\014rem" +
      "ote_graph\030\001 \001(\0132\024.tensorflow.GraphDef\022\035\n" +
      "\025graph_input_node_name\030\002 \003(\t\022\036\n\026graph_ou" +
      "tput_node_name\030\003 \003(\t\022\025\n\rexecutor_name\030\004 " +
      "\001(\t\022&\n\036serialized_executor_parameters\030\005 " +
      "\001(\014\022f\n default_graph_input_tensor_shape\030" +
      "\006 \003(\0132<.tensorflow.RemoteFusedGraphExecu" +
      "teInfo.TensorShapeTypeProto\022g\n!default_g" +
      "raph_output_tensor_shape\030\007 \003(\0132<.tensorf" +
      "low.RemoteFusedGraphExecuteInfo.TensorSh" +
      "apeTypeProto\032h\n\024TensorShapeTypeProto\022#\n\005" +
      "dtype\030\001 \001(\0162\024.tensorflow.DataType\022+\n\005sha" +
      "pe\030\002 \001(\0132\034.tensorflow.TensorShapeProtoB\251" +
      "\001\n\030org.tensorflow.frameworkB RemoteFused" +
      "GraphExecuteInfoProtoP\001Zfgithub.com/tens" +
      "orflow/tensorflow/tensorflow/go/core/fra" +
      "mework/remote_fused_graph_execute_info_g" +
      "o_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.GraphProtos.getDescriptor(),
          org.tensorflow.framework.TensorShapeProtos.getDescriptor(),
          org.tensorflow.framework.TypesProtos.getDescriptor(),
        });
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RemoteFusedGraphExecuteInfo_descriptor,
        new java.lang.String[] { "RemoteGraph", "GraphInputNodeName", "GraphOutputNodeName", "ExecutorName", "SerializedExecutorParameters", "DefaultGraphInputTensorShape", "DefaultGraphOutputTensorShape", });
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_TensorShapeTypeProto_descriptor =
      internal_static_tensorflow_RemoteFusedGraphExecuteInfo_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_RemoteFusedGraphExecuteInfo_TensorShapeTypeProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RemoteFusedGraphExecuteInfo_TensorShapeTypeProto_descriptor,
        new java.lang.String[] { "Dtype", "Shape", });
    org.tensorflow.framework.GraphProtos.getDescriptor();
    org.tensorflow.framework.TensorShapeProtos.getDescriptor();
    org.tensorflow.framework.TypesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
