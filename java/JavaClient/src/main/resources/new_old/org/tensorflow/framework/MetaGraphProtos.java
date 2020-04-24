// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/meta_graph.proto

package org.tensorflow.framework;

public final class MetaGraphProtos {
  private MetaGraphProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MetaGraphDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MetaGraphDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MetaGraphDef_MetaInfoDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MetaGraphDef_MetaInfoDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MetaGraphDef_MetaInfoDef_FunctionAliasesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MetaGraphDef_MetaInfoDef_FunctionAliasesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MetaGraphDef_CollectionDefEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MetaGraphDef_CollectionDefEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_MetaGraphDef_SignatureDefEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_MetaGraphDef_SignatureDefEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CollectionDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CollectionDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CollectionDef_NodeList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CollectionDef_NodeList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CollectionDef_BytesList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CollectionDef_BytesList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CollectionDef_Int64List_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CollectionDef_Int64List_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CollectionDef_FloatList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CollectionDef_FloatList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CollectionDef_AnyList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_CollectionDef_AnyList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TensorInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TensorInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TensorInfo_CooSparse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TensorInfo_CooSparse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TensorInfo_CompositeTensor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TensorInfo_CompositeTensor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SignatureDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SignatureDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SignatureDef_InputsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SignatureDef_InputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SignatureDef_OutputsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SignatureDef_OutputsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_AssetFileDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_AssetFileDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)tensorflow/core/protobuf/meta_graph.pr" +
      "oto\022\ntensorflow\032\031google/protobuf/any.pro" +
      "to\032%tensorflow/core/framework/graph.prot" +
      "o\032&tensorflow/core/framework/op_def.prot" +
      "o\032,tensorflow/core/framework/tensor_shap" +
      "e.proto\032%tensorflow/core/framework/types" +
      ".proto\0321tensorflow/core/protobuf/saved_o" +
      "bject_graph.proto\032$tensorflow/core/proto" +
      "buf/saver.proto\032%tensorflow/core/protobu" +
      "f/struct.proto\"\250\007\n\014MetaGraphDef\022;\n\rmeta_" +
      "info_def\030\001 \001(\0132$.tensorflow.MetaGraphDef" +
      ".MetaInfoDef\022\'\n\tgraph_def\030\002 \001(\0132\024.tensor" +
      "flow.GraphDef\022\'\n\tsaver_def\030\003 \001(\0132\024.tenso" +
      "rflow.SaverDef\022C\n\016collection_def\030\004 \003(\0132+" +
      ".tensorflow.MetaGraphDef.CollectionDefEn" +
      "try\022A\n\rsignature_def\030\005 \003(\0132*.tensorflow." +
      "MetaGraphDef.SignatureDefEntry\0220\n\016asset_" +
      "file_def\030\006 \003(\0132\030.tensorflow.AssetFileDef" +
      "\0226\n\020object_graph_def\030\007 \001(\0132\034.tensorflow." +
      "SavedObjectGraph\032\366\002\n\013MetaInfoDef\022\032\n\022meta" +
      "_graph_version\030\001 \001(\t\022,\n\020stripped_op_list" +
      "\030\002 \001(\0132\022.tensorflow.OpList\022&\n\010any_info\030\003" +
      " \001(\0132\024.google.protobuf.Any\022\014\n\004tags\030\004 \003(\t" +
      "\022\032\n\022tensorflow_version\030\005 \001(\t\022\036\n\026tensorfl" +
      "ow_git_version\030\006 \001(\t\022\036\n\026stripped_default" +
      "_attrs\030\007 \001(\010\022S\n\020function_aliases\030\010 \003(\01329" +
      ".tensorflow.MetaGraphDef.MetaInfoDef.Fun" +
      "ctionAliasesEntry\0326\n\024FunctionAliasesEntr" +
      "y\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032O\n\022Col" +
      "lectionDefEntry\022\013\n\003key\030\001 \001(\t\022(\n\005value\030\002 " +
      "\001(\0132\031.tensorflow.CollectionDef:\0028\001\032M\n\021Si" +
      "gnatureDefEntry\022\013\n\003key\030\001 \001(\t\022\'\n\005value\030\002 " +
      "\001(\0132\030.tensorflow.SignatureDef:\0028\001\"\337\003\n\rCo" +
      "llectionDef\0227\n\tnode_list\030\001 \001(\0132\".tensorf" +
      "low.CollectionDef.NodeListH\000\0229\n\nbytes_li" +
      "st\030\002 \001(\0132#.tensorflow.CollectionDef.Byte" +
      "sListH\000\0229\n\nint64_list\030\003 \001(\0132#.tensorflow" +
      ".CollectionDef.Int64ListH\000\0229\n\nfloat_list" +
      "\030\004 \001(\0132#.tensorflow.CollectionDef.FloatL" +
      "istH\000\0225\n\010any_list\030\005 \001(\0132!.tensorflow.Col" +
      "lectionDef.AnyListH\000\032\031\n\010NodeList\022\r\n\005valu" +
      "e\030\001 \003(\t\032\032\n\tBytesList\022\r\n\005value\030\001 \003(\014\032\036\n\tI" +
      "nt64List\022\021\n\005value\030\001 \003(\003B\002\020\001\032\036\n\tFloatList" +
      "\022\021\n\005value\030\001 \003(\002B\002\020\001\032.\n\007AnyList\022#\n\005value\030" +
      "\001 \003(\0132\024.google.protobuf.AnyB\006\n\004kind\"\321\003\n\n" +
      "TensorInfo\022\016\n\004name\030\001 \001(\tH\000\0226\n\ncoo_sparse" +
      "\030\004 \001(\0132 .tensorflow.TensorInfo.CooSparse" +
      "H\000\022B\n\020composite_tensor\030\005 \001(\0132&.tensorflo" +
      "w.TensorInfo.CompositeTensorH\000\022#\n\005dtype\030" +
      "\002 \001(\0162\024.tensorflow.DataType\0222\n\014tensor_sh" +
      "ape\030\003 \001(\0132\034.tensorflow.TensorShapeProto\032" +
      "e\n\tCooSparse\022\032\n\022values_tensor_name\030\001 \001(\t" +
      "\022\033\n\023indices_tensor_name\030\002 \001(\t\022\037\n\027dense_s" +
      "hape_tensor_name\030\003 \001(\t\032k\n\017CompositeTenso" +
      "r\022,\n\ttype_spec\030\001 \001(\0132\031.tensorflow.TypeSp" +
      "ecProto\022*\n\ncomponents\030\002 \003(\0132\026.tensorflow" +
      ".TensorInfoB\n\n\010encoding\"\240\002\n\014SignatureDef" +
      "\0224\n\006inputs\030\001 \003(\0132$.tensorflow.SignatureD" +
      "ef.InputsEntry\0226\n\007outputs\030\002 \003(\0132%.tensor" +
      "flow.SignatureDef.OutputsEntry\022\023\n\013method" +
      "_name\030\003 \001(\t\032E\n\013InputsEntry\022\013\n\003key\030\001 \001(\t\022" +
      "%\n\005value\030\002 \001(\0132\026.tensorflow.TensorInfo:\002" +
      "8\001\032F\n\014OutputsEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value" +
      "\030\002 \001(\0132\026.tensorflow.TensorInfo:\0028\001\"M\n\014As" +
      "setFileDef\022+\n\013tensor_info\030\001 \001(\0132\026.tensor" +
      "flow.TensorInfo\022\020\n\010filename\030\002 \001(\tBz\n\030org" +
      ".tensorflow.frameworkB\017MetaGraphProtosP\001" +
      "ZHgithub.com/tensorflow/tensorflow/tenso" +
      "rflow/go/core/core_protos_go_proto\370\001\001b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          org.tensorflow.framework.GraphProtos.getDescriptor(),
          org.tensorflow.framework.OpDefProtos.getDescriptor(),
          org.tensorflow.framework.TensorShapeProtos.getDescriptor(),
          org.tensorflow.framework.TypesProtos.getDescriptor(),
          tensorflow.SavedObjectGraphOuterClass.getDescriptor(),
          org.tensorflow.util.SaverProtos.getDescriptor(),
          tensorflow.Struct.getDescriptor(),
        });
    internal_static_tensorflow_MetaGraphDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_MetaGraphDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MetaGraphDef_descriptor,
        new java.lang.String[] { "MetaInfoDef", "GraphDef", "SaverDef", "CollectionDef", "SignatureDef", "AssetFileDef", "ObjectGraphDef", });
    internal_static_tensorflow_MetaGraphDef_MetaInfoDef_descriptor =
      internal_static_tensorflow_MetaGraphDef_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_MetaGraphDef_MetaInfoDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MetaGraphDef_MetaInfoDef_descriptor,
        new java.lang.String[] { "MetaGraphVersion", "StrippedOpList", "AnyInfo", "Tags", "TensorflowVersion", "TensorflowGitVersion", "StrippedDefaultAttrs", "FunctionAliases", });
    internal_static_tensorflow_MetaGraphDef_MetaInfoDef_FunctionAliasesEntry_descriptor =
      internal_static_tensorflow_MetaGraphDef_MetaInfoDef_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_MetaGraphDef_MetaInfoDef_FunctionAliasesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MetaGraphDef_MetaInfoDef_FunctionAliasesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_MetaGraphDef_CollectionDefEntry_descriptor =
      internal_static_tensorflow_MetaGraphDef_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_MetaGraphDef_CollectionDefEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MetaGraphDef_CollectionDefEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_MetaGraphDef_SignatureDefEntry_descriptor =
      internal_static_tensorflow_MetaGraphDef_descriptor.getNestedTypes().get(2);
    internal_static_tensorflow_MetaGraphDef_SignatureDefEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_MetaGraphDef_SignatureDefEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_CollectionDef_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_CollectionDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CollectionDef_descriptor,
        new java.lang.String[] { "NodeList", "BytesList", "Int64List", "FloatList", "AnyList", "Kind", });
    internal_static_tensorflow_CollectionDef_NodeList_descriptor =
      internal_static_tensorflow_CollectionDef_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_CollectionDef_NodeList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CollectionDef_NodeList_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_CollectionDef_BytesList_descriptor =
      internal_static_tensorflow_CollectionDef_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_CollectionDef_BytesList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CollectionDef_BytesList_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_CollectionDef_Int64List_descriptor =
      internal_static_tensorflow_CollectionDef_descriptor.getNestedTypes().get(2);
    internal_static_tensorflow_CollectionDef_Int64List_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CollectionDef_Int64List_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_CollectionDef_FloatList_descriptor =
      internal_static_tensorflow_CollectionDef_descriptor.getNestedTypes().get(3);
    internal_static_tensorflow_CollectionDef_FloatList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CollectionDef_FloatList_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_CollectionDef_AnyList_descriptor =
      internal_static_tensorflow_CollectionDef_descriptor.getNestedTypes().get(4);
    internal_static_tensorflow_CollectionDef_AnyList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_CollectionDef_AnyList_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_TensorInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_TensorInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TensorInfo_descriptor,
        new java.lang.String[] { "Name", "CooSparse", "CompositeTensor", "Dtype", "TensorShape", "Encoding", });
    internal_static_tensorflow_TensorInfo_CooSparse_descriptor =
      internal_static_tensorflow_TensorInfo_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_TensorInfo_CooSparse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TensorInfo_CooSparse_descriptor,
        new java.lang.String[] { "ValuesTensorName", "IndicesTensorName", "DenseShapeTensorName", });
    internal_static_tensorflow_TensorInfo_CompositeTensor_descriptor =
      internal_static_tensorflow_TensorInfo_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_TensorInfo_CompositeTensor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TensorInfo_CompositeTensor_descriptor,
        new java.lang.String[] { "TypeSpec", "Components", });
    internal_static_tensorflow_SignatureDef_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_SignatureDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SignatureDef_descriptor,
        new java.lang.String[] { "Inputs", "Outputs", "MethodName", });
    internal_static_tensorflow_SignatureDef_InputsEntry_descriptor =
      internal_static_tensorflow_SignatureDef_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_SignatureDef_InputsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SignatureDef_InputsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_SignatureDef_OutputsEntry_descriptor =
      internal_static_tensorflow_SignatureDef_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_SignatureDef_OutputsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SignatureDef_OutputsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_AssetFileDef_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_AssetFileDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_AssetFileDef_descriptor,
        new java.lang.String[] { "TensorInfo", "Filename", });
    com.google.protobuf.AnyProto.getDescriptor();
    org.tensorflow.framework.GraphProtos.getDescriptor();
    org.tensorflow.framework.OpDefProtos.getDescriptor();
    org.tensorflow.framework.TensorShapeProtos.getDescriptor();
    org.tensorflow.framework.TypesProtos.getDescriptor();
    tensorflow.SavedObjectGraphOuterClass.getDescriptor();
    org.tensorflow.util.SaverProtos.getDescriptor();
    tensorflow.Struct.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
