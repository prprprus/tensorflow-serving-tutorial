// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/debug_event.proto

package org.tensorflow.util;

public interface SourceFileOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.SourceFile)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Path to the file.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   * @return The filePath.
   */
  java.lang.String getFilePath();
  /**
   * <pre>
   * Path to the file.
   * </pre>
   *
   * <code>string file_path = 1;</code>
   * @return The bytes for filePath.
   */
  com.google.protobuf.ByteString
      getFilePathBytes();

  /**
   * <pre>
   * Name of the host on which the file is located.
   * </pre>
   *
   * <code>string host_name = 2;</code>
   * @return The hostName.
   */
  java.lang.String getHostName();
  /**
   * <pre>
   * Name of the host on which the file is located.
   * </pre>
   *
   * <code>string host_name = 2;</code>
   * @return The bytes for hostName.
   */
  com.google.protobuf.ByteString
      getHostNameBytes();

  /**
   * <pre>
   * Line-by-line content of the file.
   * </pre>
   *
   * <code>repeated string lines = 3;</code>
   * @return A list containing the lines.
   */
  java.util.List<java.lang.String>
      getLinesList();
  /**
   * <pre>
   * Line-by-line content of the file.
   * </pre>
   *
   * <code>repeated string lines = 3;</code>
   * @return The count of lines.
   */
  int getLinesCount();
  /**
   * <pre>
   * Line-by-line content of the file.
   * </pre>
   *
   * <code>repeated string lines = 3;</code>
   * @param index The index of the element to return.
   * @return The lines at the given index.
   */
  java.lang.String getLines(int index);
  /**
   * <pre>
   * Line-by-line content of the file.
   * </pre>
   *
   * <code>repeated string lines = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the lines at the given index.
   */
  com.google.protobuf.ByteString
      getLinesBytes(int index);
}
