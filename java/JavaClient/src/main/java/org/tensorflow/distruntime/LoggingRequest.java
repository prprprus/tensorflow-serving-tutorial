// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

/**
 * <pre>
 * Out-of-band request to begin or end logging, or
 * to retrieve logs for particular steps.
 * </pre>
 *
 * Protobuf type {@code tensorflow.LoggingRequest}
 */
public  final class LoggingRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.LoggingRequest)
    LoggingRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoggingRequest.newBuilder() to construct.
  private LoggingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoggingRequest() {
    fetchStepId_ = emptyLongList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LoggingRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoggingRequest(
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
          case 8: {

            enableRpcLogging_ = input.readBool();
            break;
          }
          case 16: {

            clear_ = input.readBool();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              fetchStepId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            fetchStepId_.addLong(input.readInt64());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              fetchStepId_ = newLongList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              fetchStepId_.addLong(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {

            disableRpcLogging_ = input.readBool();
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
        fetchStepId_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LoggingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LoggingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.LoggingRequest.class, org.tensorflow.distruntime.LoggingRequest.Builder.class);
  }

  public static final int ENABLE_RPC_LOGGING_FIELD_NUMBER = 1;
  private boolean enableRpcLogging_;
  /**
   * <pre>
   * If true, RPC logging will be enabled.
   * </pre>
   *
   * <code>bool enable_rpc_logging = 1;</code>
   * @return The enableRpcLogging.
   */
  public boolean getEnableRpcLogging() {
    return enableRpcLogging_;
  }

  public static final int DISABLE_RPC_LOGGING_FIELD_NUMBER = 4;
  private boolean disableRpcLogging_;
  /**
   * <pre>
   * If true, RPC logging will be disabled.
   * </pre>
   *
   * <code>bool disable_rpc_logging = 4;</code>
   * @return The disableRpcLogging.
   */
  public boolean getDisableRpcLogging() {
    return disableRpcLogging_;
  }

  public static final int CLEAR_FIELD_NUMBER = 2;
  private boolean clear_;
  /**
   * <pre>
   * If true, discard any saved logging data (for all steps).
   * </pre>
   *
   * <code>bool clear = 2;</code>
   * @return The clear.
   */
  public boolean getClear() {
    return clear_;
  }

  public static final int FETCH_STEP_ID_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.LongList fetchStepId_;
  /**
   * <pre>
   * When set, requests all saved log data pertaining to the step.
   * Any log data retrieved is eliminated from the store and cannot be
   * retrieved again.
   * </pre>
   *
   * <code>repeated int64 fetch_step_id = 3;</code>
   * @return A list containing the fetchStepId.
   */
  public java.util.List<java.lang.Long>
      getFetchStepIdList() {
    return fetchStepId_;
  }
  /**
   * <pre>
   * When set, requests all saved log data pertaining to the step.
   * Any log data retrieved is eliminated from the store and cannot be
   * retrieved again.
   * </pre>
   *
   * <code>repeated int64 fetch_step_id = 3;</code>
   * @return The count of fetchStepId.
   */
  public int getFetchStepIdCount() {
    return fetchStepId_.size();
  }
  /**
   * <pre>
   * When set, requests all saved log data pertaining to the step.
   * Any log data retrieved is eliminated from the store and cannot be
   * retrieved again.
   * </pre>
   *
   * <code>repeated int64 fetch_step_id = 3;</code>
   * @param index The index of the element to return.
   * @return The fetchStepId at the given index.
   */
  public long getFetchStepId(int index) {
    return fetchStepId_.getLong(index);
  }
  private int fetchStepIdMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (enableRpcLogging_ != false) {
      output.writeBool(1, enableRpcLogging_);
    }
    if (clear_ != false) {
      output.writeBool(2, clear_);
    }
    if (getFetchStepIdList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(fetchStepIdMemoizedSerializedSize);
    }
    for (int i = 0; i < fetchStepId_.size(); i++) {
      output.writeInt64NoTag(fetchStepId_.getLong(i));
    }
    if (disableRpcLogging_ != false) {
      output.writeBool(4, disableRpcLogging_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableRpcLogging_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableRpcLogging_);
    }
    if (clear_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, clear_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < fetchStepId_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(fetchStepId_.getLong(i));
      }
      size += dataSize;
      if (!getFetchStepIdList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      fetchStepIdMemoizedSerializedSize = dataSize;
    }
    if (disableRpcLogging_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, disableRpcLogging_);
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
    if (!(obj instanceof org.tensorflow.distruntime.LoggingRequest)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.LoggingRequest other = (org.tensorflow.distruntime.LoggingRequest) obj;

    if (getEnableRpcLogging()
        != other.getEnableRpcLogging()) return false;
    if (getDisableRpcLogging()
        != other.getDisableRpcLogging()) return false;
    if (getClear()
        != other.getClear()) return false;
    if (!getFetchStepIdList()
        .equals(other.getFetchStepIdList())) return false;
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
    hash = (37 * hash) + ENABLE_RPC_LOGGING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableRpcLogging());
    hash = (37 * hash) + DISABLE_RPC_LOGGING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisableRpcLogging());
    hash = (37 * hash) + CLEAR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getClear());
    if (getFetchStepIdCount() > 0) {
      hash = (37 * hash) + FETCH_STEP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFetchStepIdList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.LoggingRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.LoggingRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LoggingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.LoggingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LoggingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.LoggingRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LoggingRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.LoggingRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LoggingRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.LoggingRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.LoggingRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.LoggingRequest parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.LoggingRequest prototype) {
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
   * Out-of-band request to begin or end logging, or
   * to retrieve logs for particular steps.
   * </pre>
   *
   * Protobuf type {@code tensorflow.LoggingRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.LoggingRequest)
      org.tensorflow.distruntime.LoggingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LoggingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LoggingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.LoggingRequest.class, org.tensorflow.distruntime.LoggingRequest.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.LoggingRequest.newBuilder()
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
      enableRpcLogging_ = false;

      disableRpcLogging_ = false;

      clear_ = false;

      fetchStepId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.WorkerProtos.internal_static_tensorflow_LoggingRequest_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.LoggingRequest getDefaultInstanceForType() {
      return org.tensorflow.distruntime.LoggingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.LoggingRequest build() {
      org.tensorflow.distruntime.LoggingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.LoggingRequest buildPartial() {
      org.tensorflow.distruntime.LoggingRequest result = new org.tensorflow.distruntime.LoggingRequest(this);
      int from_bitField0_ = bitField0_;
      result.enableRpcLogging_ = enableRpcLogging_;
      result.disableRpcLogging_ = disableRpcLogging_;
      result.clear_ = clear_;
      if (((bitField0_ & 0x00000001) != 0)) {
        fetchStepId_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.fetchStepId_ = fetchStepId_;
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
      if (other instanceof org.tensorflow.distruntime.LoggingRequest) {
        return mergeFrom((org.tensorflow.distruntime.LoggingRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.LoggingRequest other) {
      if (other == org.tensorflow.distruntime.LoggingRequest.getDefaultInstance()) return this;
      if (other.getEnableRpcLogging() != false) {
        setEnableRpcLogging(other.getEnableRpcLogging());
      }
      if (other.getDisableRpcLogging() != false) {
        setDisableRpcLogging(other.getDisableRpcLogging());
      }
      if (other.getClear() != false) {
        setClear(other.getClear());
      }
      if (!other.fetchStepId_.isEmpty()) {
        if (fetchStepId_.isEmpty()) {
          fetchStepId_ = other.fetchStepId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureFetchStepIdIsMutable();
          fetchStepId_.addAll(other.fetchStepId_);
        }
        onChanged();
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
      org.tensorflow.distruntime.LoggingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.LoggingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean enableRpcLogging_ ;
    /**
     * <pre>
     * If true, RPC logging will be enabled.
     * </pre>
     *
     * <code>bool enable_rpc_logging = 1;</code>
     * @return The enableRpcLogging.
     */
    public boolean getEnableRpcLogging() {
      return enableRpcLogging_;
    }
    /**
     * <pre>
     * If true, RPC logging will be enabled.
     * </pre>
     *
     * <code>bool enable_rpc_logging = 1;</code>
     * @param value The enableRpcLogging to set.
     * @return This builder for chaining.
     */
    public Builder setEnableRpcLogging(boolean value) {
      
      enableRpcLogging_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, RPC logging will be enabled.
     * </pre>
     *
     * <code>bool enable_rpc_logging = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableRpcLogging() {
      
      enableRpcLogging_ = false;
      onChanged();
      return this;
    }

    private boolean disableRpcLogging_ ;
    /**
     * <pre>
     * If true, RPC logging will be disabled.
     * </pre>
     *
     * <code>bool disable_rpc_logging = 4;</code>
     * @return The disableRpcLogging.
     */
    public boolean getDisableRpcLogging() {
      return disableRpcLogging_;
    }
    /**
     * <pre>
     * If true, RPC logging will be disabled.
     * </pre>
     *
     * <code>bool disable_rpc_logging = 4;</code>
     * @param value The disableRpcLogging to set.
     * @return This builder for chaining.
     */
    public Builder setDisableRpcLogging(boolean value) {
      
      disableRpcLogging_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, RPC logging will be disabled.
     * </pre>
     *
     * <code>bool disable_rpc_logging = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisableRpcLogging() {
      
      disableRpcLogging_ = false;
      onChanged();
      return this;
    }

    private boolean clear_ ;
    /**
     * <pre>
     * If true, discard any saved logging data (for all steps).
     * </pre>
     *
     * <code>bool clear = 2;</code>
     * @return The clear.
     */
    public boolean getClear() {
      return clear_;
    }
    /**
     * <pre>
     * If true, discard any saved logging data (for all steps).
     * </pre>
     *
     * <code>bool clear = 2;</code>
     * @param value The clear to set.
     * @return This builder for chaining.
     */
    public Builder setClear(boolean value) {
      
      clear_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, discard any saved logging data (for all steps).
     * </pre>
     *
     * <code>bool clear = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearClear() {
      
      clear_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.LongList fetchStepId_ = emptyLongList();
    private void ensureFetchStepIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        fetchStepId_ = mutableCopy(fetchStepId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * When set, requests all saved log data pertaining to the step.
     * Any log data retrieved is eliminated from the store and cannot be
     * retrieved again.
     * </pre>
     *
     * <code>repeated int64 fetch_step_id = 3;</code>
     * @return A list containing the fetchStepId.
     */
    public java.util.List<java.lang.Long>
        getFetchStepIdList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(fetchStepId_) : fetchStepId_;
    }
    /**
     * <pre>
     * When set, requests all saved log data pertaining to the step.
     * Any log data retrieved is eliminated from the store and cannot be
     * retrieved again.
     * </pre>
     *
     * <code>repeated int64 fetch_step_id = 3;</code>
     * @return The count of fetchStepId.
     */
    public int getFetchStepIdCount() {
      return fetchStepId_.size();
    }
    /**
     * <pre>
     * When set, requests all saved log data pertaining to the step.
     * Any log data retrieved is eliminated from the store and cannot be
     * retrieved again.
     * </pre>
     *
     * <code>repeated int64 fetch_step_id = 3;</code>
     * @param index The index of the element to return.
     * @return The fetchStepId at the given index.
     */
    public long getFetchStepId(int index) {
      return fetchStepId_.getLong(index);
    }
    /**
     * <pre>
     * When set, requests all saved log data pertaining to the step.
     * Any log data retrieved is eliminated from the store and cannot be
     * retrieved again.
     * </pre>
     *
     * <code>repeated int64 fetch_step_id = 3;</code>
     * @param index The index to set the value at.
     * @param value The fetchStepId to set.
     * @return This builder for chaining.
     */
    public Builder setFetchStepId(
        int index, long value) {
      ensureFetchStepIdIsMutable();
      fetchStepId_.setLong(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When set, requests all saved log data pertaining to the step.
     * Any log data retrieved is eliminated from the store and cannot be
     * retrieved again.
     * </pre>
     *
     * <code>repeated int64 fetch_step_id = 3;</code>
     * @param value The fetchStepId to add.
     * @return This builder for chaining.
     */
    public Builder addFetchStepId(long value) {
      ensureFetchStepIdIsMutable();
      fetchStepId_.addLong(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When set, requests all saved log data pertaining to the step.
     * Any log data retrieved is eliminated from the store and cannot be
     * retrieved again.
     * </pre>
     *
     * <code>repeated int64 fetch_step_id = 3;</code>
     * @param values The fetchStepId to add.
     * @return This builder for chaining.
     */
    public Builder addAllFetchStepId(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureFetchStepIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, fetchStepId_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When set, requests all saved log data pertaining to the step.
     * Any log data retrieved is eliminated from the store and cannot be
     * retrieved again.
     * </pre>
     *
     * <code>repeated int64 fetch_step_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFetchStepId() {
      fetchStepId_ = emptyLongList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.LoggingRequest)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.LoggingRequest)
  private static final org.tensorflow.distruntime.LoggingRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.LoggingRequest();
  }

  public static org.tensorflow.distruntime.LoggingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoggingRequest>
      PARSER = new com.google.protobuf.AbstractParser<LoggingRequest>() {
    @java.lang.Override
    public LoggingRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoggingRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoggingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoggingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.LoggingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

