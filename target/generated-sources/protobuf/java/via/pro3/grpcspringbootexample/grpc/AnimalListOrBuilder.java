// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TextConverter.proto

package via.pro3.grpcspringbootexample.grpc;

public interface AnimalListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AnimalList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Animal animals = 1;</code>
   */
  java.util.List<via.pro3.grpcspringbootexample.grpc.Animal> 
      getAnimalsList();
  /**
   * <code>repeated .Animal animals = 1;</code>
   */
  via.pro3.grpcspringbootexample.grpc.Animal getAnimals(int index);
  /**
   * <code>repeated .Animal animals = 1;</code>
   */
  int getAnimalsCount();
  /**
   * <code>repeated .Animal animals = 1;</code>
   */
  java.util.List<? extends via.pro3.grpcspringbootexample.grpc.AnimalOrBuilder> 
      getAnimalsOrBuilderList();
  /**
   * <code>repeated .Animal animals = 1;</code>
   */
  via.pro3.grpcspringbootexample.grpc.AnimalOrBuilder getAnimalsOrBuilder(
      int index);

  /**
   * <code>.google.protobuf.Int64Value resultCount = 2;</code>
   */
  boolean hasResultCount();
  /**
   * <code>.google.protobuf.Int64Value resultCount = 2;</code>
   */
  com.google.protobuf.Int64Value getResultCount();
  /**
   * <code>.google.protobuf.Int64Value resultCount = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getResultCountOrBuilder();
}
