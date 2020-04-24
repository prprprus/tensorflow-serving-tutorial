// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/master.proto

package org.tensorflow.distruntime;

/**
 * <pre>
 * Reset() allows misbehaving or slow sessions to be aborted and closed, and
 * causes their resources eventually to be released.  Reset() does not wait
 * for the computations in old sessions to cease; it merely starts the
 * process of tearing them down.  However, if a new session is started after
 * a Reset(), the new session is isolated from changes that old sessions
 * (started prior to the Reset()) may continue to make to resources, provided
 * all those resources are in containers listed in "containers".
 * Old sessions may continue to have side-effects on resources not in
 * containers listed in "containers", and thus may affect future
 * sessions' results in ways that are hard to predict.  Thus, if well-defined
 * behavior is desired, is it recommended that all containers be listed in
 * "containers".  Similarly, if a device_filter is specified, results may be
 * hard to predict.
 * </pre>
 *
 * Protobuf type {@code tensorflow.ResetRequest}
 */
public  final class ResetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.ResetRequest)
    ResetRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResetRequest.newBuilder() to construct.
  private ResetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResetRequest() {
    container_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    deviceFilters_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResetRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResetRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              container_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            container_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              deviceFilters_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            deviceFilters_.add(s);
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
        container_ = container_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        deviceFilters_ = deviceFilters_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ResetRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ResetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.distruntime.ResetRequest.class, org.tensorflow.distruntime.ResetRequest.Builder.class);
  }

  public static final int CONTAINER_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList container_;
  /**
   * <pre>
   * A list of container names, which may be empty.
   * If 'container' is not empty, releases resources in the given
   * containers in all devices.
   * If 'container' is empty, releases resources in the default
   * container in all devices.
   * </pre>
   *
   * <code>repeated string container = 1;</code>
   * @return A list containing the container.
   */
  public com.google.protobuf.ProtocolStringList
      getContainerList() {
    return container_;
  }
  /**
   * <pre>
   * A list of container names, which may be empty.
   * If 'container' is not empty, releases resources in the given
   * containers in all devices.
   * If 'container' is empty, releases resources in the default
   * container in all devices.
   * </pre>
   *
   * <code>repeated string container = 1;</code>
   * @return The count of container.
   */
  public int getContainerCount() {
    return container_.size();
  }
  /**
   * <pre>
   * A list of container names, which may be empty.
   * If 'container' is not empty, releases resources in the given
   * containers in all devices.
   * If 'container' is empty, releases resources in the default
   * container in all devices.
   * </pre>
   *
   * <code>repeated string container = 1;</code>
   * @param index The index of the element to return.
   * @return The container at the given index.
   */
  public java.lang.String getContainer(int index) {
    return container_.get(index);
  }
  /**
   * <pre>
   * A list of container names, which may be empty.
   * If 'container' is not empty, releases resources in the given
   * containers in all devices.
   * If 'container' is empty, releases resources in the default
   * container in all devices.
   * </pre>
   *
   * <code>repeated string container = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the container at the given index.
   */
  public com.google.protobuf.ByteString
      getContainerBytes(int index) {
    return container_.getByteString(index);
  }

  public static final int DEVICE_FILTERS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList deviceFilters_;
  /**
   * <pre>
   * When any filters are present, only devices that match the filters
   * will be reset. Each filter can be partially specified,
   * e.g. "/job:ps" "/job:worker/replica:3", etc.
   * </pre>
   *
   * <code>repeated string device_filters = 2;</code>
   * @return A list containing the deviceFilters.
   */
  public com.google.protobuf.ProtocolStringList
      getDeviceFiltersList() {
    return deviceFilters_;
  }
  /**
   * <pre>
   * When any filters are present, only devices that match the filters
   * will be reset. Each filter can be partially specified,
   * e.g. "/job:ps" "/job:worker/replica:3", etc.
   * </pre>
   *
   * <code>repeated string device_filters = 2;</code>
   * @return The count of deviceFilters.
   */
  public int getDeviceFiltersCount() {
    return deviceFilters_.size();
  }
  /**
   * <pre>
   * When any filters are present, only devices that match the filters
   * will be reset. Each filter can be partially specified,
   * e.g. "/job:ps" "/job:worker/replica:3", etc.
   * </pre>
   *
   * <code>repeated string device_filters = 2;</code>
   * @param index The index of the element to return.
   * @return The deviceFilters at the given index.
   */
  public java.lang.String getDeviceFilters(int index) {
    return deviceFilters_.get(index);
  }
  /**
   * <pre>
   * When any filters are present, only devices that match the filters
   * will be reset. Each filter can be partially specified,
   * e.g. "/job:ps" "/job:worker/replica:3", etc.
   * </pre>
   *
   * <code>repeated string device_filters = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the deviceFilters at the given index.
   */
  public com.google.protobuf.ByteString
      getDeviceFiltersBytes(int index) {
    return deviceFilters_.getByteString(index);
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
    for (int i = 0; i < container_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, container_.getRaw(i));
    }
    for (int i = 0; i < deviceFilters_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deviceFilters_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < container_.size(); i++) {
        dataSize += computeStringSizeNoTag(container_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getContainerList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < deviceFilters_.size(); i++) {
        dataSize += computeStringSizeNoTag(deviceFilters_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDeviceFiltersList().size();
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
    if (!(obj instanceof org.tensorflow.distruntime.ResetRequest)) {
      return super.equals(obj);
    }
    org.tensorflow.distruntime.ResetRequest other = (org.tensorflow.distruntime.ResetRequest) obj;

    if (!getContainerList()
        .equals(other.getContainerList())) return false;
    if (!getDeviceFiltersList()
        .equals(other.getDeviceFiltersList())) return false;
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
    if (getContainerCount() > 0) {
      hash = (37 * hash) + CONTAINER_FIELD_NUMBER;
      hash = (53 * hash) + getContainerList().hashCode();
    }
    if (getDeviceFiltersCount() > 0) {
      hash = (37 * hash) + DEVICE_FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceFiltersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.distruntime.ResetRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ResetRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ResetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ResetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ResetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.distruntime.ResetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ResetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ResetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ResetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ResetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.distruntime.ResetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.distruntime.ResetRequest parseFrom(
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
  public static Builder newBuilder(org.tensorflow.distruntime.ResetRequest prototype) {
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
   * Reset() allows misbehaving or slow sessions to be aborted and closed, and
   * causes their resources eventually to be released.  Reset() does not wait
   * for the computations in old sessions to cease; it merely starts the
   * process of tearing them down.  However, if a new session is started after
   * a Reset(), the new session is isolated from changes that old sessions
   * (started prior to the Reset()) may continue to make to resources, provided
   * all those resources are in containers listed in "containers".
   * Old sessions may continue to have side-effects on resources not in
   * containers listed in "containers", and thus may affect future
   * sessions' results in ways that are hard to predict.  Thus, if well-defined
   * behavior is desired, is it recommended that all containers be listed in
   * "containers".  Similarly, if a device_filter is specified, results may be
   * hard to predict.
   * </pre>
   *
   * Protobuf type {@code tensorflow.ResetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.ResetRequest)
      org.tensorflow.distruntime.ResetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ResetRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ResetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.distruntime.ResetRequest.class, org.tensorflow.distruntime.ResetRequest.Builder.class);
    }

    // Construct using org.tensorflow.distruntime.ResetRequest.newBuilder()
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
      container_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      deviceFilters_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.distruntime.DistributedRuntimeProtos.internal_static_tensorflow_ResetRequest_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.ResetRequest getDefaultInstanceForType() {
      return org.tensorflow.distruntime.ResetRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.distruntime.ResetRequest build() {
      org.tensorflow.distruntime.ResetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.distruntime.ResetRequest buildPartial() {
      org.tensorflow.distruntime.ResetRequest result = new org.tensorflow.distruntime.ResetRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        container_ = container_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.container_ = container_;
      if (((bitField0_ & 0x00000002) != 0)) {
        deviceFilters_ = deviceFilters_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.deviceFilters_ = deviceFilters_;
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
      if (other instanceof org.tensorflow.distruntime.ResetRequest) {
        return mergeFrom((org.tensorflow.distruntime.ResetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.distruntime.ResetRequest other) {
      if (other == org.tensorflow.distruntime.ResetRequest.getDefaultInstance()) return this;
      if (!other.container_.isEmpty()) {
        if (container_.isEmpty()) {
          container_ = other.container_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureContainerIsMutable();
          container_.addAll(other.container_);
        }
        onChanged();
      }
      if (!other.deviceFilters_.isEmpty()) {
        if (deviceFilters_.isEmpty()) {
          deviceFilters_ = other.deviceFilters_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureDeviceFiltersIsMutable();
          deviceFilters_.addAll(other.deviceFilters_);
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
      org.tensorflow.distruntime.ResetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.distruntime.ResetRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList container_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureContainerIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        container_ = new com.google.protobuf.LazyStringArrayList(container_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * A list of container names, which may be empty.
     * If 'container' is not empty, releases resources in the given
     * containers in all devices.
     * If 'container' is empty, releases resources in the default
     * container in all devices.
     * </pre>
     *
     * <code>repeated string container = 1;</code>
     * @return A list containing the container.
     */
    public com.google.protobuf.ProtocolStringList
        getContainerList() {
      return container_.getUnmodifiableView();
    }
    /**
     * <pre>
     * A list of container names, which may be empty.
     * If 'container' is not empty, releases resources in the given
     * containers in all devices.
     * If 'container' is empty, releases resources in the default
     * container in all devices.
     * </pre>
     *
     * <code>repeated string container = 1;</code>
     * @return The count of container.
     */
    public int getContainerCount() {
      return container_.size();
    }
    /**
     * <pre>
     * A list of container names, which may be empty.
     * If 'container' is not empty, releases resources in the given
     * containers in all devices.
     * If 'container' is empty, releases resources in the default
     * container in all devices.
     * </pre>
     *
     * <code>repeated string container = 1;</code>
     * @param index The index of the element to return.
     * @return The container at the given index.
     */
    public java.lang.String getContainer(int index) {
      return container_.get(index);
    }
    /**
     * <pre>
     * A list of container names, which may be empty.
     * If 'container' is not empty, releases resources in the given
     * containers in all devices.
     * If 'container' is empty, releases resources in the default
     * container in all devices.
     * </pre>
     *
     * <code>repeated string container = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the container at the given index.
     */
    public com.google.protobuf.ByteString
        getContainerBytes(int index) {
      return container_.getByteString(index);
    }
    /**
     * <pre>
     * A list of container names, which may be empty.
     * If 'container' is not empty, releases resources in the given
     * containers in all devices.
     * If 'container' is empty, releases resources in the default
     * container in all devices.
     * </pre>
     *
     * <code>repeated string container = 1;</code>
     * @param index The index to set the value at.
     * @param value The container to set.
     * @return This builder for chaining.
     */
    public Builder setContainer(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureContainerIsMutable();
      container_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of container names, which may be empty.
     * If 'container' is not empty, releases resources in the given
     * containers in all devices.
     * If 'container' is empty, releases resources in the default
     * container in all devices.
     * </pre>
     *
     * <code>repeated string container = 1;</code>
     * @param value The container to add.
     * @return This builder for chaining.
     */
    public Builder addContainer(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureContainerIsMutable();
      container_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of container names, which may be empty.
     * If 'container' is not empty, releases resources in the given
     * containers in all devices.
     * If 'container' is empty, releases resources in the default
     * container in all devices.
     * </pre>
     *
     * <code>repeated string container = 1;</code>
     * @param values The container to add.
     * @return This builder for chaining.
     */
    public Builder addAllContainer(
        java.lang.Iterable<java.lang.String> values) {
      ensureContainerIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, container_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of container names, which may be empty.
     * If 'container' is not empty, releases resources in the given
     * containers in all devices.
     * If 'container' is empty, releases resources in the default
     * container in all devices.
     * </pre>
     *
     * <code>repeated string container = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearContainer() {
      container_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A list of container names, which may be empty.
     * If 'container' is not empty, releases resources in the given
     * containers in all devices.
     * If 'container' is empty, releases resources in the default
     * container in all devices.
     * </pre>
     *
     * <code>repeated string container = 1;</code>
     * @param value The bytes of the container to add.
     * @return This builder for chaining.
     */
    public Builder addContainerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureContainerIsMutable();
      container_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList deviceFilters_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDeviceFiltersIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        deviceFilters_ = new com.google.protobuf.LazyStringArrayList(deviceFilters_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * When any filters are present, only devices that match the filters
     * will be reset. Each filter can be partially specified,
     * e.g. "/job:ps" "/job:worker/replica:3", etc.
     * </pre>
     *
     * <code>repeated string device_filters = 2;</code>
     * @return A list containing the deviceFilters.
     */
    public com.google.protobuf.ProtocolStringList
        getDeviceFiltersList() {
      return deviceFilters_.getUnmodifiableView();
    }
    /**
     * <pre>
     * When any filters are present, only devices that match the filters
     * will be reset. Each filter can be partially specified,
     * e.g. "/job:ps" "/job:worker/replica:3", etc.
     * </pre>
     *
     * <code>repeated string device_filters = 2;</code>
     * @return The count of deviceFilters.
     */
    public int getDeviceFiltersCount() {
      return deviceFilters_.size();
    }
    /**
     * <pre>
     * When any filters are present, only devices that match the filters
     * will be reset. Each filter can be partially specified,
     * e.g. "/job:ps" "/job:worker/replica:3", etc.
     * </pre>
     *
     * <code>repeated string device_filters = 2;</code>
     * @param index The index of the element to return.
     * @return The deviceFilters at the given index.
     */
    public java.lang.String getDeviceFilters(int index) {
      return deviceFilters_.get(index);
    }
    /**
     * <pre>
     * When any filters are present, only devices that match the filters
     * will be reset. Each filter can be partially specified,
     * e.g. "/job:ps" "/job:worker/replica:3", etc.
     * </pre>
     *
     * <code>repeated string device_filters = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the deviceFilters at the given index.
     */
    public com.google.protobuf.ByteString
        getDeviceFiltersBytes(int index) {
      return deviceFilters_.getByteString(index);
    }
    /**
     * <pre>
     * When any filters are present, only devices that match the filters
     * will be reset. Each filter can be partially specified,
     * e.g. "/job:ps" "/job:worker/replica:3", etc.
     * </pre>
     *
     * <code>repeated string device_filters = 2;</code>
     * @param index The index to set the value at.
     * @param value The deviceFilters to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceFilters(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDeviceFiltersIsMutable();
      deviceFilters_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When any filters are present, only devices that match the filters
     * will be reset. Each filter can be partially specified,
     * e.g. "/job:ps" "/job:worker/replica:3", etc.
     * </pre>
     *
     * <code>repeated string device_filters = 2;</code>
     * @param value The deviceFilters to add.
     * @return This builder for chaining.
     */
    public Builder addDeviceFilters(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDeviceFiltersIsMutable();
      deviceFilters_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When any filters are present, only devices that match the filters
     * will be reset. Each filter can be partially specified,
     * e.g. "/job:ps" "/job:worker/replica:3", etc.
     * </pre>
     *
     * <code>repeated string device_filters = 2;</code>
     * @param values The deviceFilters to add.
     * @return This builder for chaining.
     */
    public Builder addAllDeviceFilters(
        java.lang.Iterable<java.lang.String> values) {
      ensureDeviceFiltersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, deviceFilters_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When any filters are present, only devices that match the filters
     * will be reset. Each filter can be partially specified,
     * e.g. "/job:ps" "/job:worker/replica:3", etc.
     * </pre>
     *
     * <code>repeated string device_filters = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceFilters() {
      deviceFilters_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * When any filters are present, only devices that match the filters
     * will be reset. Each filter can be partially specified,
     * e.g. "/job:ps" "/job:worker/replica:3", etc.
     * </pre>
     *
     * <code>repeated string device_filters = 2;</code>
     * @param value The bytes of the deviceFilters to add.
     * @return This builder for chaining.
     */
    public Builder addDeviceFiltersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDeviceFiltersIsMutable();
      deviceFilters_.add(value);
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


    // @@protoc_insertion_point(builder_scope:tensorflow.ResetRequest)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.ResetRequest)
  private static final org.tensorflow.distruntime.ResetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.distruntime.ResetRequest();
  }

  public static org.tensorflow.distruntime.ResetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResetRequest>
      PARSER = new com.google.protobuf.AbstractParser<ResetRequest>() {
    @java.lang.Override
    public ResetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResetRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.distruntime.ResetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

