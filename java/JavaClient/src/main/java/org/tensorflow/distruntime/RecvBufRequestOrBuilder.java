// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/worker.proto

package org.tensorflow.distruntime;

public interface RecvBufRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RecvBufRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Used at server side to find the correct BufRendezvous.
   * </pre>
   *
   * <code>int64 step_id = 1;</code>
   * @return The stepId.
   */
  long getStepId();

  /**
   * <pre>
   * Arbitrary string identifying a BufRendezvous entry.
   * </pre>
   *
   * <code>string buf_rendezvous_key = 2;</code>
   * @return The bufRendezvousKey.
   */
  java.lang.String getBufRendezvousKey();
  /**
   * <pre>
   * Arbitrary string identifying a BufRendezvous entry.
   * </pre>
   *
   * <code>string buf_rendezvous_key = 2;</code>
   * @return The bytes for bufRendezvousKey.
   */
  com.google.protobuf.ByteString
      getBufRendezvousKeyBytes();

  /**
   * <pre>
   * Size of value expected, must agree with BufRendezvous entry.
   * </pre>
   *
   * <code>int64 num_bytes = 3;</code>
   * @return The numBytes.
   */
  long getNumBytes();

  /**
   * <pre>
   * When RDMA is in use, address of destination field on client.
   * </pre>
   *
   * <code>fixed64 buf_ptr = 4;</code>
   * @return The bufPtr.
   */
  long getBufPtr();

  /**
   * <pre>
   * Optional information on client-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality client_locality = 5;</code>
   * @return Whether the clientLocality field is set.
   */
  boolean hasClientLocality();
  /**
   * <pre>
   * Optional information on client-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality client_locality = 5;</code>
   * @return The clientLocality.
   */
  org.tensorflow.framework.DeviceLocality getClientLocality();
  /**
   * <pre>
   * Optional information on client-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality client_locality = 5;</code>
   */
  org.tensorflow.framework.DeviceLocalityOrBuilder getClientLocalityOrBuilder();

  /**
   * <pre>
   * Optional information on server-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality server_locality = 6;</code>
   * @return Whether the serverLocality field is set.
   */
  boolean hasServerLocality();
  /**
   * <pre>
   * Optional information on server-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality server_locality = 6;</code>
   * @return The serverLocality.
   */
  org.tensorflow.framework.DeviceLocality getServerLocality();
  /**
   * <pre>
   * Optional information on server-side device locality.
   * </pre>
   *
   * <code>.tensorflow.DeviceLocality server_locality = 6;</code>
   */
  org.tensorflow.framework.DeviceLocalityOrBuilder getServerLocalityOrBuilder();

  /**
   * <pre>
   * Optional, implementation-specific data.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 7;</code>
   * @return Whether the transportOptions field is set.
   */
  boolean hasTransportOptions();
  /**
   * <pre>
   * Optional, implementation-specific data.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 7;</code>
   * @return The transportOptions.
   */
  com.google.protobuf.Any getTransportOptions();
  /**
   * <pre>
   * Optional, implementation-specific data.
   * </pre>
   *
   * <code>.google.protobuf.Any transport_options = 7;</code>
   */
  com.google.protobuf.AnyOrBuilder getTransportOptionsOrBuilder();

  /**
   * <pre>
   * For annotating timeline and device incarnation check.
   * </pre>
   *
   * <code>string src_device = 8;</code>
   * @return The srcDevice.
   */
  java.lang.String getSrcDevice();
  /**
   * <pre>
   * For annotating timeline and device incarnation check.
   * </pre>
   *
   * <code>string src_device = 8;</code>
   * @return The bytes for srcDevice.
   */
  com.google.protobuf.ByteString
      getSrcDeviceBytes();

  /**
   * <pre>
   * Optional, for annotating the timeline.
   * </pre>
   *
   * <code>string dst_device = 9;</code>
   * @return The dstDevice.
   */
  java.lang.String getDstDevice();
  /**
   * <pre>
   * Optional, for annotating the timeline.
   * </pre>
   *
   * <code>string dst_device = 9;</code>
   * @return The bytes for dstDevice.
   */
  com.google.protobuf.ByteString
      getDstDeviceBytes();

  /**
   * <pre>
   * Depending on the RPC system in use, it may be necessary to set this
   * id to detect resends of RPCs where the server is not aware that
   * the prior RPC failed.
   * </pre>
   *
   * <code>int64 request_id = 10;</code>
   * @return The requestId.
   */
  long getRequestId();

  /**
   * <pre>
   * Incarnation number of the source device, used to detect worker failures.
   * </pre>
   *
   * <code>uint64 src_incarnation = 11;</code>
   * @return The srcIncarnation.
   */
  long getSrcIncarnation();
}