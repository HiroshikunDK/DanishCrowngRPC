// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TextConverter.proto

package via.pro3.grpcspringbootexample.grpc;

public interface TrayStaRegistrationListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TrayStaRegistrationList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .TrayStaRegistration result_list = 1;</code>
   */
  java.util.List<via.pro3.grpcspringbootexample.grpc.TrayStaRegistration> 
      getResultListList();
  /**
   * <code>repeated .TrayStaRegistration result_list = 1;</code>
   */
  via.pro3.grpcspringbootexample.grpc.TrayStaRegistration getResultList(int index);
  /**
   * <code>repeated .TrayStaRegistration result_list = 1;</code>
   */
  int getResultListCount();
  /**
   * <code>repeated .TrayStaRegistration result_list = 1;</code>
   */
  java.util.List<? extends via.pro3.grpcspringbootexample.grpc.TrayStaRegistrationOrBuilder> 
      getResultListOrBuilderList();
  /**
   * <code>repeated .TrayStaRegistration result_list = 1;</code>
   */
  via.pro3.grpcspringbootexample.grpc.TrayStaRegistrationOrBuilder getResultListOrBuilder(
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