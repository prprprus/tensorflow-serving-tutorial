// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/graph_debug_info.proto

package org.tensorflow.framework;

public interface GraphDebugInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.GraphDebugInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This stores all the source code file names and can be indexed by the
   * `file_index`.
   * </pre>
   *
   * <code>repeated string files = 1;</code>
   * @return A list containing the files.
   */
  java.util.List<java.lang.String>
      getFilesList();
  /**
   * <pre>
   * This stores all the source code file names and can be indexed by the
   * `file_index`.
   * </pre>
   *
   * <code>repeated string files = 1;</code>
   * @return The count of files.
   */
  int getFilesCount();
  /**
   * <pre>
   * This stores all the source code file names and can be indexed by the
   * `file_index`.
   * </pre>
   *
   * <code>repeated string files = 1;</code>
   * @param index The index of the element to return.
   * @return The files at the given index.
   */
  java.lang.String getFiles(int index);
  /**
   * <pre>
   * This stores all the source code file names and can be indexed by the
   * `file_index`.
   * </pre>
   *
   * <code>repeated string files = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the files at the given index.
   */
  com.google.protobuf.ByteString
      getFilesBytes(int index);

  /**
   * <pre>
   * This maps a node name to a stack trace in the source code.
   * The map key is a mangling of the containing function and op name with
   * syntax:
   *   op.name '&#64;' func_name
   * For ops in the top-level graph, the func_name is the empty string.
   * Note that op names are restricted to a small number of characters which
   * exclude '&#64;', making it impossible to collide keys of this form. Function
   * names accept a much wider set of characters.
   * It would be preferable to avoid mangling and use a tuple key of (op.name,
   * func_name), but this is not supported with protocol buffers.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.GraphDebugInfo.StackTrace&gt; traces = 2;</code>
   */
  int getTracesCount();
  /**
   * <pre>
   * This maps a node name to a stack trace in the source code.
   * The map key is a mangling of the containing function and op name with
   * syntax:
   *   op.name '&#64;' func_name
   * For ops in the top-level graph, the func_name is the empty string.
   * Note that op names are restricted to a small number of characters which
   * exclude '&#64;', making it impossible to collide keys of this form. Function
   * names accept a much wider set of characters.
   * It would be preferable to avoid mangling and use a tuple key of (op.name,
   * func_name), but this is not supported with protocol buffers.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.GraphDebugInfo.StackTrace&gt; traces = 2;</code>
   */
  boolean containsTraces(
      java.lang.String key);
  /**
   * Use {@link #getTracesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.tensorflow.framework.GraphDebugInfo.StackTrace>
  getTraces();
  /**
   * <pre>
   * This maps a node name to a stack trace in the source code.
   * The map key is a mangling of the containing function and op name with
   * syntax:
   *   op.name '&#64;' func_name
   * For ops in the top-level graph, the func_name is the empty string.
   * Note that op names are restricted to a small number of characters which
   * exclude '&#64;', making it impossible to collide keys of this form. Function
   * names accept a much wider set of characters.
   * It would be preferable to avoid mangling and use a tuple key of (op.name,
   * func_name), but this is not supported with protocol buffers.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.GraphDebugInfo.StackTrace&gt; traces = 2;</code>
   */
  java.util.Map<java.lang.String, org.tensorflow.framework.GraphDebugInfo.StackTrace>
  getTracesMap();
  /**
   * <pre>
   * This maps a node name to a stack trace in the source code.
   * The map key is a mangling of the containing function and op name with
   * syntax:
   *   op.name '&#64;' func_name
   * For ops in the top-level graph, the func_name is the empty string.
   * Note that op names are restricted to a small number of characters which
   * exclude '&#64;', making it impossible to collide keys of this form. Function
   * names accept a much wider set of characters.
   * It would be preferable to avoid mangling and use a tuple key of (op.name,
   * func_name), but this is not supported with protocol buffers.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.GraphDebugInfo.StackTrace&gt; traces = 2;</code>
   */

  org.tensorflow.framework.GraphDebugInfo.StackTrace getTracesOrDefault(
      java.lang.String key,
      org.tensorflow.framework.GraphDebugInfo.StackTrace defaultValue);
  /**
   * <pre>
   * This maps a node name to a stack trace in the source code.
   * The map key is a mangling of the containing function and op name with
   * syntax:
   *   op.name '&#64;' func_name
   * For ops in the top-level graph, the func_name is the empty string.
   * Note that op names are restricted to a small number of characters which
   * exclude '&#64;', making it impossible to collide keys of this form. Function
   * names accept a much wider set of characters.
   * It would be preferable to avoid mangling and use a tuple key of (op.name,
   * func_name), but this is not supported with protocol buffers.
   * </pre>
   *
   * <code>map&lt;string, .tensorflow.GraphDebugInfo.StackTrace&gt; traces = 2;</code>
   */

  org.tensorflow.framework.GraphDebugInfo.StackTrace getTracesOrThrow(
      java.lang.String key);
}
