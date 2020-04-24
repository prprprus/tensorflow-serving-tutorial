// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/master.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.MakeCallableRequest}
 */
public  final class MakeCallableRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.MakeCallableRequest)
    MakeCallableRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MakeCallableRequest.newBuilder() to construct.
  private MakeCallableRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MakeCallableRequest() {
    sessionHandle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MakeCallableRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MakeCallableRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            sessionHandle_ = s;
            break;
          }
          case 18: {
            org.tensorflow.framework.CallableOptions.Builder subBuilder = null;
            if (options_ != null) {
              subBuilder = options_.toBuilder();
            }
            options_ = input.readMessage(org.tensorflow.framework.CallableOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(options_);
              options_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            requestId_ = input.readInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_MakeCallableRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_MakeCallableRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.MakeCallableRequest.class, org.tensorflow.distruntime.MakeCallableRequest.Builder.class);
  }

  public static final int SESSION_HANDLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object sessionHandle_;
  /**
   * <pre>
   * REQUIRED: session_handle must be returned by a CreateSession call
   * to the same master service.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   * @return The sessionHandle.
   */
  public java.lang.String getSessionHandle() {
    java.lang.Object ref = sessionHandle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionHandle_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * REQUIRED: session_handle must be returned by a CreateSession call
   * to the same master service.
   * </pre>
   *
   * <code>string session_handle = 1;</code>
   * @return The bytes for sessionHandle.
   */
  public com.google.protobuf.ByteString
      getSessionHandleBytes() {
    java.lang.Object ref = sessionHandle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionHandle_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  private org.tensorflow.framework.CallableOptions options_;
  /**
   * <pre>
   * Options that define the behavior of the created callable.
   * </pre>
   *
   * <code>.tensorflow.CallableOptions options = 2;</code>
   * @return Whether the options field is set.
   */
  public boolean hasOptions() {
    return options_ != null;
  }
  /**
   * <pre>
   * Options that define the behavior of the created callable.
   * </pre>
   *
   * <code>.tensorflow.CallableOptions options = 2;</code>
   * @return The options.
   */
  public org.tensorflow.framework.CallableOptions getOptions() {
    return options_ == null ? org.tensorflow.framework.CallableOptions.getDefaultInstance() : options_;
  }
  /**
   * <pre>
   * Options that define the behavior of the created callable.
   * </pre>
   *
   * <code>.tensorflow.CallableOptions options = 2;</code>
   */
  public org.tensorflow.framework.CallableOptionsOrBuilder getOptionsOrBuilder() {
    return getOptions();
  }

  public static final int REQUEST_ID_FIELD_NUMBER = 3;
  private long requestId_;
  /**
   * <pre>
   * Unique identifier for this request. Every MakeCallableRequest must
   * have a unique request_id, and retried MakeCallableRequest must have
   * the same request_id. If request_id is zero, retry detection is disabled.
   * </pre>
   *
   * <code>int64 request_id = 3;</code>
   * @return The requestId.
   */
  public long getRequestId() {
    return requestId_;
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
    if (!getSessionHandleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sessionHandle_);
    }
    if (options_ != null) {
      output.writeMessage(2, getOptions());
    }
    if (requestId_ != 0L) {
      output.writeInt64(3, requestId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSessionHandleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sessionHandle_);
    }
    if (options_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOptions());
    }
    if (requestId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, requestId_);
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
    if (!(obj instanceof org.tensorflow.distruntime.MakeCallableRequest)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.MakeCallableRequest other = (org.tensorflow.distruntime.MakeCallableRequest) obj;

    if (!getSessionHandle()
        .equals(other.getSessionHandle())) return false;
    if (hasOptions() != other.hasOptions()) return false;
    if (hasOptions()) {
      if (!getOptions()
          .equals(other.getOptions())) return false;
    }
    if (getRequestId()
        != other.getRequestId()) return false;
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
    hash = (37 * hash) + SESSION_HANDLE_FIELD_NUMBER;
    hash = (53 * hash) + getSessionHandle().hashCode();
    if (hasOptions()) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptions().hashCode();
    }
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getRequestId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.MakeCallableRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.MakeCallableRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.MakeCallableRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.MakeCallableRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.MakeCallableRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.MakeCallableRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.MakeCallableRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.MakeCallableRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.MakeCallableRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.MakeCallableRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.MakeCallableRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.MakeCallableRequest parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.MakeCallableRequest prototype) {
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
   * Protobuf type {@code tensorflow.MakeCallableRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.MakeCallableRequest)
      org.tensorflow.distruntime.MakeCallableRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_MakeCallableRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_MakeCallableRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.MakeCallableRequest.class, org.tensorflow.distruntime.MakeCallableRequest.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.MakeCallableRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sessionHandle_ = "";

      if (optionsBuilder_ == null) {
        options_ = null;
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }
      requestId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_MakeCallableRequest_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.MakeCallableRequest getDefaultInstanceForType() {
      return org.tensorflow.distruntime.MakeCallableRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.MakeCallableRequest build() {
      org.tensorflow.distruntime.MakeCallableRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.MakeCallableRequest buildPartial() {
      org.tensorflow.distruntime.MakeCallableRequest result = new org.tensorflow.distruntime.MakeCallableRequest(this);
      result.sessionHandle_ = sessionHandle_;
      if (optionsBuilder_ == null) {
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
      }
      result.requestId_ = requestId_;
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
      if (other instanceof org.tensorflow.distruntime.MakeCallableRequest) {
        return mergeFrom((org.tensorflow.distruntime.MakeCallableRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.MakeCallableRequest other) {
      if (other == org.tensorflow.distruntime.MakeCallableRequest.getDefaultInstance()) return this;
      if (!other.getSessionHandle().isEmpty()) {
        sessionHandle_ = other.sessionHandle_;
        onChanged();
      }
      if (other.hasOptions()) {
        mergeOptions(other.getOptions());
      }
      if (other.getRequestId() != 0L) {
        setRequestId(other.getRequestId());
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
      org.tensorflow.distruntime.MakeCallableRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.MakeCallableRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sessionHandle_ = "";
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     * @return The sessionHandle.
     */
    public java.lang.String getSessionHandle() {
      java.lang.Object ref = sessionHandle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionHandle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     * @return The bytes for sessionHandle.
     */
    public com.google.protobuf.ByteString
        getSessionHandleBytes() {
      java.lang.Object ref = sessionHandle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionHandle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     * @param value The sessionHandle to set.
     * @return This builder for chaining.
     */
    public Builder setSessionHandle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionHandle_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionHandle() {
      
      sessionHandle_ = getDefaultInstance().getSessionHandle();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * REQUIRED: session_handle must be returned by a CreateSession call
     * to the same master service.
     * </pre>
     *
     * <code>string session_handle = 1;</code>
     * @param value The bytes for sessionHandle to set.
     * @return This builder for chaining.
     */
    public Builder setSessionHandleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionHandle_ = value;
      onChanged();
      return this;
    }

    private org.tensorflow.framework.CallableOptions options_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.CallableOptions, org.tensorflow.framework.CallableOptions.Builder, org.tensorflow.framework.CallableOptionsOrBuilder> optionsBuilder_;
    /**
     * <pre>
     * Options that define the behavior of the created callable.
     * </pre>
     *
     * <code>.tensorflow.CallableOptions options = 2;</code>
     * @return Whether the options field is set.
     */
    public boolean hasOptions() {
      return optionsBuilder_ != null || options_ != null;
    }
    /**
     * <pre>
     * Options that define the behavior of the created callable.
     * </pre>
     *
     * <code>.tensorflow.CallableOptions options = 2;</code>
     * @return The options.
     */
    public org.tensorflow.framework.CallableOptions getOptions() {
      if (optionsBuilder_ == null) {
        return options_ == null ? org.tensorflow.framework.CallableOptions.getDefaultInstance() : options_;
      } else {
        return optionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Options that define the behavior of the created callable.
     * </pre>
     *
     * <code>.tensorflow.CallableOptions options = 2;</code>
     */
    public Builder setOptions(org.tensorflow.framework.CallableOptions value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        options_ = value;
        onChanged();
      } else {
        optionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Options that define the behavior of the created callable.
     * </pre>
     *
     * <code>.tensorflow.CallableOptions options = 2;</code>
     */
    public Builder setOptions(
        org.tensorflow.framework.CallableOptions.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        options_ = builderForValue.build();
        onChanged();
      } else {
        optionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Options that define the behavior of the created callable.
     * </pre>
     *
     * <code>.tensorflow.CallableOptions options = 2;</code>
     */
    public Builder mergeOptions(org.tensorflow.framework.CallableOptions value) {
      if (optionsBuilder_ == null) {
        if (options_ != null) {
          options_ =
            org.tensorflow.framework.CallableOptions.newBuilder(options_).mergeFrom(value).buildPartial();
        } else {
          options_ = value;
        }
        onChanged();
      } else {
        optionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Options that define the behavior of the created callable.
     * </pre>
     *
     * <code>.tensorflow.CallableOptions options = 2;</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = null;
        onChanged();
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Options that define the behavior of the created callable.
     * </pre>
     *
     * <code>.tensorflow.CallableOptions options = 2;</code>
     */
    public org.tensorflow.framework.CallableOptions.Builder getOptionsBuilder() {
      
      onChanged();
      return getOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Options that define the behavior of the created callable.
     * </pre>
     *
     * <code>.tensorflow.CallableOptions options = 2;</code>
     */
    public org.tensorflow.framework.CallableOptionsOrBuilder getOptionsOrBuilder() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilder();
      } else {
        return options_ == null ?
            org.tensorflow.framework.CallableOptions.getDefaultInstance() : options_;
      }
    }
    /**
     * <pre>
     * Options that define the behavior of the created callable.
     * </pre>
     *
     * <code>.tensorflow.CallableOptions options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.tensorflow.framework.CallableOptions, org.tensorflow.framework.CallableOptions.Builder, org.tensorflow.framework.CallableOptionsOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.tensorflow.framework.CallableOptions, org.tensorflow.framework.CallableOptions.Builder, org.tensorflow.framework.CallableOptionsOrBuilder>(
                getOptions(),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
    }

    private long requestId_ ;
    /**
     * <pre>
     * Unique identifier for this request. Every MakeCallableRequest must
     * have a unique request_id, and retried MakeCallableRequest must have
     * the same request_id. If request_id is zero, retry detection is disabled.
     * </pre>
     *
     * <code>int64 request_id = 3;</code>
     * @return The requestId.
     */
    public long getRequestId() {
      return requestId_;
    }
    /**
     * <pre>
     * Unique identifier for this request. Every MakeCallableRequest must
     * have a unique request_id, and retried MakeCallableRequest must have
     * the same request_id. If request_id is zero, retry detection is disabled.
     * </pre>
     *
     * <code>int64 request_id = 3;</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(long value) {
      
      requestId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique identifier for this request. Every MakeCallableRequest must
     * have a unique request_id, and retried MakeCallableRequest must have
     * the same request_id. If request_id is zero, retry detection is disabled.
     * </pre>
     *
     * <code>int64 request_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      
      requestId_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.MakeCallableRequest)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.MakeCallableRequest)
  private static final org.tensorflow.distruntime.MakeCallableRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.MakeCallableRequest();
  }

  public static org.tensorflow.distruntime.MakeCallableRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MakeCallableRequest>
      PARSER = new com.google.protobuf.AbstractParser<MakeCallableRequest>() {
    @java.lang.Override
    public MakeCallableRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MakeCallableRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MakeCallableRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MakeCallableRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.MakeCallableRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

