// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TextConverter.proto

package via.pro3.grpcspringbootexample.grpc;

public interface ProductListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ProductList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Product result_list = 1;</code>
   */
  java.util.List<via.pro3.grpcspringbootexample.grpc.Product> 
      getResultListList();
  /**
   * <code>repeated .Product result_list = 1;</code>
   */
  via.pro3.grpcspringbootexample.grpc.Product getResultList(int index);
  /**
   * <code>repeated .Product result_list = 1;</code>
   */
  int getResultListCount();
  /**
   * <code>repeated .Product result_list = 1;</code>
   */
  java.util.List<? extends via.pro3.grpcspringbootexample.grpc.ProductOrBuilder> 
      getResultListOrBuilderList();
  /**
   * <code>repeated .Product result_list = 1;</code>
   */
  via.pro3.grpcspringbootexample.grpc.ProductOrBuilder getResultListOrBuilder(
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