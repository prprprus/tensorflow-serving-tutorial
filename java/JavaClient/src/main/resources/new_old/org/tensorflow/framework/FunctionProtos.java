// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/function.proto

package org.tensorflow.framework;

public final class FunctionProtos {
  private FunctionProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDefLibrary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDefLibrary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDef_AttrEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDef_AttrEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDef_ArgAttrs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDef_ArgAttrs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDef_ArgAttrs_AttrEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDef_ArgAttrs_AttrEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDef_ArgAttrEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDef_ArgAttrEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDef_ResourceArgUniqueIdEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDef_ResourceArgUniqueIdEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDef_RetEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDef_RetEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FunctionDef_ControlRetEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_FunctionDef_ControlRetEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GradientDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GradientDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(tensorflow/core/framework/function.pro" +
      "to\022\ntensorflow\032*tensorflow/core/framewor" +
      "k/attr_value.proto\032(tensorflow/core/fram" +
      "ework/node_def.proto\032&tensorflow/core/fr" +
      "amework/op_def.proto\"j\n\022FunctionDefLibra" +
      "ry\022)\n\010function\030\001 \003(\0132\027.tensorflow.Functi" +
      "onDef\022)\n\010gradient\030\002 \003(\0132\027.tensorflow.Gra" +
      "dientDef\"\304\006\n\013FunctionDef\022$\n\tsignature\030\001 " +
      "\001(\0132\021.tensorflow.OpDef\022/\n\004attr\030\005 \003(\0132!.t" +
      "ensorflow.FunctionDef.AttrEntry\0226\n\010arg_a" +
      "ttr\030\007 \003(\0132$.tensorflow.FunctionDef.ArgAt" +
      "trEntry\022P\n\026resource_arg_unique_id\030\010 \003(\0132" +
      "0.tensorflow.FunctionDef.ResourceArgUniq" +
      "ueIdEntry\022%\n\010node_def\030\003 \003(\0132\023.tensorflow" +
      ".NodeDef\022-\n\003ret\030\004 \003(\0132 .tensorflow.Funct" +
      "ionDef.RetEntry\022<\n\013control_ret\030\006 \003(\0132\'.t" +
      "ensorflow.FunctionDef.ControlRetEntry\032B\n" +
      "\tAttrEntry\022\013\n\003key\030\001 \001(\t\022$\n\005value\030\002 \001(\0132\025" +
      ".tensorflow.AttrValue:\0028\001\032\210\001\n\010ArgAttrs\0228" +
      "\n\004attr\030\001 \003(\0132*.tensorflow.FunctionDef.Ar" +
      "gAttrs.AttrEntry\032B\n\tAttrEntry\022\013\n\003key\030\001 \001" +
      "(\t\022$\n\005value\030\002 \001(\0132\025.tensorflow.AttrValue" +
      ":\0028\001\032P\n\014ArgAttrEntry\022\013\n\003key\030\001 \001(\r\022/\n\005val" +
      "ue\030\002 \001(\0132 .tensorflow.FunctionDef.ArgAtt" +
      "rs:\0028\001\032:\n\030ResourceArgUniqueIdEntry\022\013\n\003ke" +
      "y\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001\032*\n\010RetEntry\022\013" +
      "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0321\n\017Contro" +
      "lRetEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028" +
      "\001J\004\010\002\020\003\";\n\013GradientDef\022\025\n\rfunction_name\030" +
      "\001 \001(\t\022\025\n\rgradient_func\030\002 \001(\tB\200\001\n\030org.ten" +
      "sorflow.frameworkB\016FunctionProtosP\001ZOgit" +
      "hub.com/tensorflow/tensorflow/tensorflow" +
      "/go/core/framework/function_go_proto\370\001\001b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.AttrValueProtos.getDescriptor(),
          org.tensorflow.framework.NodeProto.getDescriptor(),
          org.tensorflow.framework.OpDefProtos.getDescriptor(),
        });
    internal_static_tensorflow_FunctionDefLibrary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_FunctionDefLibrary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDefLibrary_descriptor,
        new java.lang.String[] { "Function", "Gradient", });
    internal_static_tensorflow_FunctionDef_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_FunctionDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDef_descriptor,
        new java.lang.String[] { "Signature", "Attr", "ArgAttr", "ResourceArgUniqueId", "NodeDef", "Ret", "ControlRet", });
    internal_static_tensorflow_FunctionDef_AttrEntry_descriptor =
      internal_static_tensorflow_FunctionDef_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_FunctionDef_AttrEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDef_AttrEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_FunctionDef_ArgAttrs_descriptor =
      internal_static_tensorflow_FunctionDef_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_FunctionDef_ArgAttrs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDef_ArgAttrs_descriptor,
        new java.lang.String[] { "Attr", });
    internal_static_tensorflow_FunctionDef_ArgAttrs_AttrEntry_descriptor =
      internal_static_tensorflow_FunctionDef_ArgAttrs_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_FunctionDef_ArgAttrs_AttrEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDef_ArgAttrs_AttrEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_FunctionDef_ArgAttrEntry_descriptor =
      internal_static_tensorflow_FunctionDef_descriptor.getNestedTypes().get(2);
    internal_static_tensorflow_FunctionDef_ArgAttrEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDef_ArgAttrEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_FunctionDef_ResourceArgUniqueIdEntry_descriptor =
      internal_static_tensorflow_FunctionDef_descriptor.getNestedTypes().get(3);
    internal_static_tensorflow_FunctionDef_ResourceArgUniqueIdEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDef_ResourceArgUniqueIdEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_FunctionDef_RetEntry_descriptor =
      internal_static_tensorflow_FunctionDef_descriptor.getNestedTypes().get(4);
    internal_static_tensorflow_FunctionDef_RetEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDef_RetEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_FunctionDef_ControlRetEntry_descriptor =
      internal_static_tensorflow_FunctionDef_descriptor.getNestedTypes().get(5);
    internal_static_tensorflow_FunctionDef_ControlRetEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_FunctionDef_ControlRetEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_GradientDef_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_GradientDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GradientDef_descriptor,
        new java.lang.String[] { "FunctionName", "GradientFunc", });
    org.tensorflow.framework.AttrValueProtos.getDescriptor();
    org.tensorflow.framework.NodeProto.getDescriptor();
    org.tensorflow.framework.OpDefProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
