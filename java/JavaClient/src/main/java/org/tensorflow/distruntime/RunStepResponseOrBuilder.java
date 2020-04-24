// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/master.proto

package org.tensorflow.distruntime;

public interface RunStepResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.RunStepResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * NOTE: The order of the returned tensors may or may not match
   * the fetch order specified in RunStepRequest.
   * </pre>
   *
   * <code>repeated .tensorflow.NamedTensorProto tensor = 1;</code>
   */
  java.util.List<org.tensorflow.framework.NamedTensorProto> 
      getTensorList();
  /**
   * <pre>
   * NOTE: The order of the returned tensors may or may not match
   * the fetch order specified in RunStepRequest.
   * </pre>
   *
   * <code>repeated .tensorflow.NamedTensorProto tensor = 1;</code>
   */
  org.tensorflow.framework.NamedTensorProto getTensor(int index);
  /**
   * <pre>
   * NOTE: The order of the returned tensors may or may not match
   * the fetch order specified in RunStepRequest.
   * </pre>
   *
   * <code>repeated .tensorflow.NamedTensorProto tensor = 1;</code>
   */
  int getTensorCount();
  /**
   * <pre>
   * NOTE: The order of the returned tensors may or may not match
   * the fetch order specified in RunStepRequest.
   * </pre>
   *
   * <code>repeated .tensorflow.NamedTensorProto tensor = 1;</code>
   */
  java.util.List<? extends org.tensorflow.framework.NamedTensorProtoOrBuilder> 
      getTensorOrBuilderList();
  /**
   * <pre>
   * NOTE: The order of the returned tensors may or may not match
   * the fetch order specified in RunStepRequest.
   * </pre>
   *
   * <code>repeated .tensorflow.NamedTensorProto tensor = 1;</code>
   */
  org.tensorflow.framework.NamedTensorProtoOrBuilder getTensorOrBuilder(
      int index);

  /**
   * <pre>
   * Returned metadata if requested in the options.
   * </pre>
   *
   * <code>.tensorflow.RunMetadata metadata = 2;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * Returned metadata if requested in the options.
   * </pre>
   *
   * <code>.tensorflow.RunMetadata metadata = 2;</code>
   * @return The metadata.
   */
  org.tensorflow.framework.RunMetadata getMetadata();
  /**
   * <pre>
   * Returned metadata if requested in the options.
   * </pre>
   *
   * <code>.tensorflow.RunMetadata metadata = 2;</code>
   */
  org.tensorflow.framework.RunMetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * If store_errors_in_response_body is true in the request, then
   * optionally the server may return an OK status for the RPC and
   * fill the true status into the fields below, to allow for messages
   * that are too long to fit in metadata.
   * </pre>
   *
   * <code>.tensorflow.error.Code status_code = 3;</code>
   * @return The enum numeric value on the wire for statusCode.
   */
  int getStatusCodeValue();
  /**
   * <pre>
   * If store_errors_in_response_body is true in the request, then
   * optionally the server may return an OK status for the RPC and
   * fill the true status into the fields below, to allow for messages
   * that are too long to fit in metadata.
   * </pre>
   *
   * <code>.tensorflow.error.Code status_code = 3;</code>
   * @return The statusCode.
   */
  org.tensorflow.framework.Code getStatusCode();

  /**
   * <code>string status_error_message = 4;</code>
   * @return The statusErrorMessage.
   */
  java.lang.String getStatusErrorMessage();
  /**
   * <code>string status_error_message = 4;</code>
   * @return The bytes for statusErrorMessage.
   */
  com.google.protobuf.ByteString
      getStatusErrorMessageBytes();
}
