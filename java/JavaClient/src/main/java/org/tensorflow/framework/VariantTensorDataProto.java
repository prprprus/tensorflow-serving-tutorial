// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/tensor.proto

package org.tensorflow.framework;

/**
 * <pre>
 * Protocol buffer representing the serialization format of DT_VARIANT tensors.
 * </pre>
 *
 * Protobuf type {@code tensorflow.VariantTensorDataProto}
 */
public  final class VariantTensorDataProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.VariantTensorDataProto)
    VariantTensorDataProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VariantTensorDataProto.newBuilder() to construct.
  private VariantTensorDataProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VariantTensorDataProto() {
    typeName_ = "";
    metadata_ = com.google.protobuf.ByteString.EMPTY;
    tensors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VariantTensorDataProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VariantTensorDataProto(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            typeName_ = s;
            break;
          }
          case 18: {

            metadata_ = input.readBytes();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              tensors_ = new java.util.ArrayList<org.tensorflow.framework.TensorProto>();
              mutable_bitField0_ |= 0x00000001;
            }
            tensors_.add(
                input.readMessage(org.tensorflow.framework.TensorProto.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        tensors_ = java.util.Collections.unmodifiableList(tensors_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.TensorProtos.internal_static_tensorflow_VariantTensorDataProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.TensorProtos.internal_static_tensorflow_VariantTensorDataProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.VariantTensorDataProto.class, org.tensorflow.framework.VariantTensorDataProto.Builder.class);
  }

  public static final int TYPE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object typeName_;
  /**
   * <pre>
   * Name of the type of objects being serialized.
   * </pre>
   *
   * <code>string type_name = 1;</code>
   * @return The typeName.
   */
  public java.lang.String getTypeName() {
    java.lang.Object ref = typeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      typeName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the type of objects being serialized.
   * </pre>
   *
   * <code>string type_name = 1;</code>
   * @return The bytes for typeName.
   */
  public com.google.protobuf.ByteString
      getTypeNameBytes() {
    java.lang.Object ref = typeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      typeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString metadata_;
  /**
   * <pre>
   * Portions of the object that are not Tensors.
   * </pre>
   *
   * <code>bytes metadata = 2;</code>
   * @return The metadata.
   */
  public com.google.protobuf.ByteString getMetadata() {
    return metadata_;
  }

  public static final int TENSORS_FIELD_NUMBER = 3;
  private java.util.List<org.tensorflow.framework.TensorProto> tensors_;
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
   */
  public java.util.List<org.tensorflow.framework.TensorProto> getTensorsList() {
    return tensors_;
  }
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
   */
  public java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder> 
      getTensorsOrBuilderList() {
    return tensors_;
  }
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
   */
  public int getTensorsCount() {
    return tensors_.size();
  }
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
   */
  public org.tensorflow.framework.TensorProto getTensors(int index) {
    return tensors_.get(index);
  }
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
   */
  public org.tensorflow.framework.TensorProtoOrBuilder getTensorsOrBuilder(
      int index) {
    return tensors_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getTypeNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, typeName_);
    }
    if (!metadata_.isEmpty()) {
      output.writeBytes(2, metadata_);
    }
    for (int i = 0; i < tensors_.size(); i++) {
      output.writeMessage(3, tensors_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTypeNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, typeName_);
    }
    if (!metadata_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, metadata_);
    }
    for (int i = 0; i < tensors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, tensors_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.framework.VariantTensorDataProto)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.VariantTensorDataProto other = (org.tensorflow.framework.VariantTensorDataProto) obj;

    if (!getTypeName()
        .equals(other.getTypeName())) return false;
    if (!getMetadata()
        .equals(other.getMetadata())) return false;
    if (!getTensorsList()
        .equals(other.getTensorsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTypeName().hashCode();
    hash = (37 * hash) + METADATA_FIELD_NUMBER;
    hash = (53 * hash) + getMetadata().hashCode();
    if (getTensorsCount() > 0) {
      hash = (37 * hash) + TENSORS_FIELD_NUMBER;
      hash = (53 * hash) + getTensorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.VariantTensorDataProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.VariantTensorDataProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.VariantTensorDataProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.VariantTensorDataProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.VariantTensorDataProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.VariantTensorDataProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.VariantTensorDataProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.VariantTensorDataProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.VariantTensorDataProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.VariantTensorDataProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.VariantTensorDataProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.VariantTensorDataProto parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.VariantTensorDataProto prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Protocol buffer representing the serialization format of DT_VARIANT tensors.
   * </pre>
   *
   * Protobuf type {@code tensorflow.VariantTensorDataProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.VariantTensorDataProto)
      org.tensorflow.framework.VariantTensorDataProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.TensorProtos.internal_static_tensorflow_VariantTensorDataProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.TensorProtos.internal_static_tensorflow_VariantTensorDataProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.VariantTensorDataProto.class, org.tensorflow.framework.VariantTensorDataProto.Builder.class);
    }

    // Construct using org.tensorflow.framework.VariantTensorDataProto.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTensorsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      typeName_ = "";

      metadata_ = com.google.protobuf.ByteString.EMPTY;

      if (tensorsBuilder_ == null) {
        tensors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tensorsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.TensorProtos.internal_static_tensorflow_VariantTensorDataProto_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.VariantTensorDataProto getDefaultInstanceForType() {
      return org.tensorflow.framework.VariantTensorDataProto.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.VariantTensorDataProto build() {
      org.tensorflow.framework.VariantTensorDataProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.VariantTensorDataProto buildPartial() {
      org.tensorflow.framework.VariantTensorDataProto result = new org.tensorflow.framework.VariantTensorDataProto(this);
      int from_bitField0_ = bitField0_;
      result.typeName_ = typeName_;
      result.metadata_ = metadata_;
      if (tensorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          tensors_ = java.util.Collections.unmodifiableList(tensors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.tensors_ = tensors_;
      } else {
        result.tensors_ = tensorsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.VariantTensorDataProto) {
        return mergeFrom((org.tensorflow.framework.VariantTensorDataProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.VariantTensorDataProto other) {
      if (other == org.tensorflow.framework.VariantTensorDataProto.getDefaultInstance()) return this;
      if (!other.getTypeName().isEmpty()) {
        typeName_ = other.typeName_;
        onChanged();
      }
      if (other.getMetadata() != com.google.protobuf.ByteString.EMPTY) {
        setMetadata(other.getMetadata());
      }
      if (tensorsBuilder_ == null) {
        if (!other.tensors_.isEmpty()) {
          if (tensors_.isEmpty()) {
            tensors_ = other.tensors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTensorsIsMutable();
            tensors_.addAll(other.tensors_);
          }
          onChanged();
        }
      } else {
        if (!other.tensors_.isEmpty()) {
          if (tensorsBuilder_.isEmpty()) {
            tensorsBuilder_.dispose();
            tensorsBuilder_ = null;
            tensors_ = other.tensors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tensorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTensorsFieldBuilder() : null;
          } else {
            tensorsBuilder_.addAllMessages(other.tensors_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.framework.VariantTensorDataProto parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.VariantTensorDataProto) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object typeName_ = "";
    /**
     * <pre>
     * Name of the type of objects being serialized.
     * </pre>
     *
     * <code>string type_name = 1;</code>
     * @return The typeName.
     */
    public java.lang.String getTypeName() {
      java.lang.Object ref = typeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        typeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the type of objects being serialized.
     * </pre>
     *
     * <code>string type_name = 1;</code>
     * @return The bytes for typeName.
     */
    public com.google.protobuf.ByteString
        getTypeNameBytes() {
      java.lang.Object ref = typeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        typeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the type of objects being serialized.
     * </pre>
     *
     * <code>string type_name = 1;</code>
     * @param value The typeName to set.
     * @return This builder for chaining.
     */
    public Builder setTypeName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      typeName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the type of objects being serialized.
     * </pre>
     *
     * <code>string type_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTypeName() {
      
      typeName_ = getDefaultInstance().getTypeName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the type of objects being serialized.
     * </pre>
     *
     * <code>string type_name = 1;</code>
     * @param value The bytes for typeName to set.
     * @return This builder for chaining.
     */
    public Builder setTypeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      typeName_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString metadata_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Portions of the object that are not Tensors.
     * </pre>
     *
     * <code>bytes metadata = 2;</code>
     * @return The metadata.
     */
    public com.google.protobuf.ByteString getMetadata() {
      return metadata_;
    }
    /**
     * <pre>
     * Portions of the object that are not Tensors.
     * </pre>
     *
     * <code>bytes metadata = 2;</code>
     * @param value The metadata to set.
     * @return This builder for chaining.
     */
    public Builder setMetadata(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      metadata_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Portions of the object that are not Tensors.
     * </pre>
     *
     * <code>bytes metadata = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetadata() {
      
      metadata_ = getDefaultInstance().getMetadata();
      onChanged();
      return this;
    }

    private java.util.List<org.tensorflow.framework.TensorProto> tensors_ =
      java.util.Collections.emptyList();
    private void ensureTensorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        tensors_ = new java.util.ArrayList<org.tensorflow.framework.TensorProto>(tensors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> tensorsBuilder_;

    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public java.util.List<org.tensorflow.framework.TensorProto> getTensorsList() {
      if (tensorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tensors_);
      } else {
        return tensorsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public int getTensorsCount() {
      if (tensorsBuilder_ == null) {
        return tensors_.size();
      } else {
        return tensorsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public org.tensorflow.framework.TensorProto getTensors(int index) {
      if (tensorsBuilder_ == null) {
        return tensors_.get(index);
      } else {
        return tensorsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public Builder setTensors(
        int index, org.tensorflow.framework.TensorProto value) {
      if (tensorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorsIsMutable();
        tensors_.set(index, value);
        onChanged();
      } else {
        tensorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public Builder setTensors(
        int index, org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (tensorsBuilder_ == null) {
        ensureTensorsIsMutable();
        tensors_.set(index, builderForValue.build());
        onChanged();
      } else {
        tensorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public Builder addTensors(org.tensorflow.framework.TensorProto value) {
      if (tensorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorsIsMutable();
        tensors_.add(value);
        onChanged();
      } else {
        tensorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public Builder addTensors(
        int index, org.tensorflow.framework.TensorProto value) {
      if (tensorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorsIsMutable();
        tensors_.add(index, value);
        onChanged();
      } else {
        tensorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public Builder addTensors(
        org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (tensorsBuilder_ == null) {
        ensureTensorsIsMutable();
        tensors_.add(builderForValue.build());
        onChanged();
      } else {
        tensorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public Builder addTensors(
        int index, org.tensorflow.framework.TensorProto.Builder builderForValue) {
      if (tensorsBuilder_ == null) {
        ensureTensorsIsMutable();
        tensors_.add(index, builderForValue.build());
        onChanged();
      } else {
        tensorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public Builder addAllTensors(
        java.lang.Iterable<? extends org.tensorflow.framework.TensorProto> values) {
      if (tensorsBuilder_ == null) {
        ensureTensorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tensors_);
        onChanged();
      } else {
        tensorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public Builder clearTensors() {
      if (tensorsBuilder_ == null) {
        tensors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tensorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public Builder removeTensors(int index) {
      if (tensorsBuilder_ == null) {
        ensureTensorsIsMutable();
        tensors_.remove(index);
        onChanged();
      } else {
        tensorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder getTensorsBuilder(
        int index) {
      return getTensorsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public org.tensorflow.framework.TensorProtoOrBuilder getTensorsOrBuilder(
        int index) {
      if (tensorsBuilder_ == null) {
        return tensors_.get(index);  } else {
        return tensorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder> 
         getTensorsOrBuilderList() {
      if (tensorsBuilder_ != null) {
        return tensorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tensors_);
      }
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder addTensorsBuilder() {
      return getTensorsFieldBuilder().addBuilder(
          org.tensorflow.framework.TensorProto.getDefaultInstance());
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public org.tensorflow.framework.TensorProto.Builder addTensorsBuilder(
        int index) {
      return getTensorsFieldBuilder().addBuilder(
          index, org.tensorflow.framework.TensorProto.getDefaultInstance());
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
     */
    public java.util.List<org.tensorflow.framework.TensorProto.Builder> 
         getTensorsBuilderList() {
      return getTensorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder> 
        getTensorsFieldBuilder() {
      if (tensorsBuilder_ == null) {
        tensorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.framework.TensorProto, org.tensorflow.framework.TensorProto.Builder, org.tensorflow.framework.TensorProtoOrBuilder>(
                tensors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        tensors_ = null;
      }
      return tensorsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.VariantTensorDataProto)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.VariantTensorDataProto)
  private static final org.tensorflow.framework.VariantTensorDataProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.VariantTensorDataProto();
  }

  public static org.tensorflow.framework.VariantTensorDataProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VariantTensorDataProto>
      PARSER = new com.google.protobuf.AbstractParser<VariantTensorDataProto>() {
    @java.lang.Override
    public VariantTensorDataProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VariantTensorDataProto(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VariantTensorDataProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VariantTensorDataProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.VariantTensorDataProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

