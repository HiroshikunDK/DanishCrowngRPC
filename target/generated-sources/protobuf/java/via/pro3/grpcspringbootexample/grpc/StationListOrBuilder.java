// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TextConverter.proto

package via.pro3.grpcspringbootexample.grpc;

public interface StationListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:StationList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Station result_list = 1;</code>
   */
  java.util.List<via.pro3.grpcspringbootexample.grpc.Station> 
      getResultListList();
  /**
   * <code>repeated .Station result_list = 1;</code>
   */
  via.pro3.grpcspringbootexample.grpc.Station getResultList(int index);
  /**
   * <code>repeated .Station result_list = 1;</code>
   */
  int getResultListCount();
  /**
   * <code>repeated .Station result_list = 1;</code>
   */
  java.util.List<? extends via.pro3.grpcspringbootexample.grpc.StationOrBuilder> 
      getResultListOrBuilderList();
  /**
   * <code>repeated .Station result_list = 1;</code>
   */
  via.pro3.grpcspringbootexample.grpc.StationOrBuilder getResultListOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Int64Value result_count = 2;</code>
   */
  boolean hasResultCount();
  /**
   * <code>.google.protobuf.Int64Value result_count = 2;</code>
   */
  com.google.protobuf.Int64Value getResultCount();
  /**
   * <code>.google.protobuf.Int64Value result_count = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getResultCountOrBuilder();
}
