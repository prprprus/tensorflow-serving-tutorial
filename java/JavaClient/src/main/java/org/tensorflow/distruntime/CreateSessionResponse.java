// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/master.proto

package org.tensorflow.distruntime;

/**
 * Protobuf type {@code tensorflow.CreateSessionResponse}
 */
public  final class CreateSessionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.CreateSessionResponse)
    CreateSessionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSessionResponse.newBuilder() to construct.
  private CreateSessionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSessionResponse() {
    sessionHandle_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSessionResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateSessionResponse(
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
          case 16: {

            graphVersion_ = input.readInt64();
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
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CreateSessionResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CreateSessionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.CreateSessionResponse.class, org.tensorflow.distruntime.CreateSessionResponse.Builder.class);
  }

  public static final int SESSION_HANDLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object sessionHandle_;
  /**
   * <pre>
   * The session handle to be used in subsequent calls for the created session.
   * The client must arrange to call CloseSession with this returned
   * session handle to close the session.
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
   * The session handle to be used in subsequent calls for the created session.
   * The client must arrange to call CloseSession with this returned
   * session handle to close the session.
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

  public static final int GRAPH_VERSION_FIELD_NUMBER = 2;
  private long graphVersion_;
  /**
   * <pre>
   * The initial version number for the graph, to be used in the next call
   * to ExtendSession.
   * </pre>
   *
   * <code>int64 graph_version = 2;</code>
   * @return The graphVersion.
   */
  public long getGraphVersion() {
    return graphVersion_;
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
    if (graphVersion_ != 0L) {
      output.writeInt64(2, graphVersion_);
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
    if (graphVersion_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, graphVersion_);
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
    if (!(obj instanceof org.tensorflow.distruntime.CreateSessionResponse)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.CreateSessionResponse other = (org.tensorflow.distruntime.CreateSessionResponse) obj;

    if (!getSessionHandle()
        .equals(other.getSessionHandle())) return false;
    if (getGraphVersion()
        != other.getGraphVersion()) return false;
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
    hash = (37 * hash) + GRAPH_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGraphVersion());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.CreateSessionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CreateSessionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateSessionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CreateSessionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateSessionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.CreateSessionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateSessionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CreateSessionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateSessionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CreateSessionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.CreateSessionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.CreateSessionResponse parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.CreateSessionResponse prototype) {
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
   * Protobuf type {@code tensorflow.CreateSessionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.CreateSessionResponse)
      org.tensorflow.distruntime.CreateSessionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CreateSessionResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CreateSessionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.CreateSessionResponse.class, org.tensorflow.distruntime.CreateSessionResponse.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.CreateSessionResponse.newBuilder()
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

      graphVersion_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_CreateSessionResponse_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CreateSessionResponse getDefaultInstanceForType() {
      return org.tensorflow.distruntime.CreateSessionResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CreateSessionResponse build() {
      org.tensorflow.distruntime.CreateSessionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.CreateSessionResponse buildPartial() {
      org.tensorflow.distruntime.CreateSessionResponse result = new org.tensorflow.distruntime.CreateSessionResponse(this);
      result.sessionHandle_ = sessionHandle_;
      result.graphVersion_ = graphVersion_;
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
      if (other instanceof org.tensorflow.distruntime.CreateSessionResponse) {
        return mergeFrom((org.tensorflow.distruntime.CreateSessionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.CreateSessionResponse other) {
      if (other == org.tensorflow.distruntime.CreateSessionResponse.getDefaultInstance()) return this;
      if (!other.getSessionHandle().isEmpty()) {
        sessionHandle_ = other.sessionHandle_;
        onChanged();
      }
      if (other.getGraphVersion() != 0L) {
        setGraphVersion(other.getGraphVersion());
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
      org.tensorflow.distruntime.CreateSessionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.CreateSessionResponse) e.getUnfinishedMessage();
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
     * The session handle to be used in subsequent calls for the created session.
     * The client must arrange to call CloseSession with this returned
     * session handle to close the session.
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
     * The session handle to be used in subsequent calls for the created session.
     * The client must arrange to call CloseSession with this returned
     * session handle to close the session.
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
     * The session handle to be used in subsequent calls for the created session.
     * The client must arrange to call CloseSession with this returned
     * session handle to close the session.
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
     * The session handle to be used in subsequent calls for the created session.
     * The client must arrange to call CloseSession with this returned
     * session handle to close the session.
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
     * The session handle to be used in subsequent calls for the created session.
     * The client must arrange to call CloseSession with this returned
     * session handle to close the session.
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

    private long graphVersion_ ;
    /**
     * <pre>
     * The initial version number for the graph, to be used in the next call
     * to ExtendSession.
     * </pre>
     *
     * <code>int64 graph_version = 2;</code>
     * @return The graphVersion.
     */
    public long getGraphVersion() {
      return graphVersion_;
    }
    /**
     * <pre>
     * The initial version number for the graph, to be used in the next call
     * to ExtendSession.
     * </pre>
     *
     * <code>int64 graph_version = 2;</code>
     * @param value The graphVersion to set.
     * @return This builder for chaining.
     */
    public Builder setGraphVersion(long value) {
      
      graphVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The initial version number for the graph, to be used in the next call
     * to ExtendSession.
     * </pre>
     *
     * <code>int64 graph_version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGraphVersion() {
      
      graphVersion_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:tensorflow.CreateSessionResponse)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.CreateSessionResponse)
  private static final org.tensorflow.distruntime.CreateSessionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.CreateSessionResponse();
  }

  public static org.tensorflow.distruntime.CreateSessionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSessionResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateSessionResponse>() {
    @java.lang.Override
    public CreateSessionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateSessionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateSessionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSessionResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.CreateSessionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

