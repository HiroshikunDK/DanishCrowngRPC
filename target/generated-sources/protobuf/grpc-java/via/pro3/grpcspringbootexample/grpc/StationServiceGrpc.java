package via.pro3.grpcspringbootexample.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: TextConverter.proto")
public final class StationServiceGrpc {

  private StationServiceGrpc() {}

  public static final String SERVICE_NAME = "StationService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<via.pro3.grpcspringbootexample.grpc.Station,
      via.pro3.grpcspringbootexample.grpc.Station> METHOD_CREATE =
      io.grpc.MethodDescriptor.<via.pro3.grpcspringbootexample.grpc.Station, via.pro3.grpcspringbootexample.grpc.Station>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "StationService", "create"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.Station.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.Station.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<via.pro3.grpcspringbootexample.grpc.Station,
      via.pro3.grpcspringbootexample.grpc.Station> METHOD_UPDATE =
      io.grpc.MethodDescriptor.<via.pro3.grpcspringbootexample.grpc.Station, via.pro3.grpcspringbootexample.grpc.Station>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "StationService", "update"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.Station.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.Station.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      via.pro3.grpcspringbootexample.grpc.Station> METHOD_FIND_BY_ID =
      io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, via.pro3.grpcspringbootexample.grpc.Station>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "StationService", "findById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Int64Value.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.Station.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      via.pro3.grpcspringbootexample.grpc.StationList> METHOD_LIST =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, via.pro3.grpcspringbootexample.grpc.StationList>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "StationService", "list"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.StationList.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Int64Value,
      com.google.protobuf.BoolValue> METHOD_DELETE =
      io.grpc.MethodDescriptor.<com.google.protobuf.Int64Value, com.google.protobuf.BoolValue>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "StationService", "delete"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Int64Value.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.BoolValue.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StationServiceStub newStub(io.grpc.Channel channel) {
    return new StationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(via.pro3.grpcspringbootexample.grpc.Station request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.Station> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     */
    public void update(via.pro3.grpcspringbootexample.grpc.Station request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.Station> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE, responseObserver);
    }

    /**
     */
    public void findById(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.Station> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_FIND_BY_ID, responseObserver);
    }

    /**
     */
    public void list(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.StationList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     */
    public void delete(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELETE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                via.pro3.grpcspringbootexample.grpc.Station,
                via.pro3.grpcspringbootexample.grpc.Station>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                via.pro3.grpcspringbootexample.grpc.Station,
                via.pro3.grpcspringbootexample.grpc.Station>(
                  this, METHODID_UPDATE)))
          .addMethod(
            METHOD_FIND_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                via.pro3.grpcspringbootexample.grpc.Station>(
                  this, METHODID_FIND_BY_ID)))
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                via.pro3.grpcspringbootexample.grpc.StationList>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_DELETE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int64Value,
                com.google.protobuf.BoolValue>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class StationServiceStub extends io.grpc.stub.AbstractStub<StationServiceStub> {
    private StationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StationServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(via.pro3.grpcspringbootexample.grpc.Station request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.Station> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(via.pro3.grpcspringbootexample.grpc.Station request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.Station> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findById(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.Station> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_FIND_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.StationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.google.protobuf.Int64Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StationServiceBlockingStub extends io.grpc.stub.AbstractStub<StationServiceBlockingStub> {
    private StationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.pro3.grpcspringbootexample.grpc.Station create(via.pro3.grpcspringbootexample.grpc.Station request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     */
    public via.pro3.grpcspringbootexample.grpc.Station update(via.pro3.grpcspringbootexample.grpc.Station request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE, getCallOptions(), request);
    }

    /**
     */
    public via.pro3.grpcspringbootexample.grpc.Station findById(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_FIND_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public via.pro3.grpcspringbootexample.grpc.StationList list(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.BoolValue delete(com.google.protobuf.Int64Value request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELETE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StationServiceFutureStub extends io.grpc.stub.AbstractStub<StationServiceFutureStub> {
    private StationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.pro3.grpcspringbootexample.grpc.Station> create(
        via.pro3.grpcspringbootexample.grpc.Station request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.pro3.grpcspringbootexample.grpc.Station> update(
        via.pro3.grpcspringbootexample.grpc.Station request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.pro3.grpcspringbootexample.grpc.Station> findById(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_FIND_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.pro3.grpcspringbootexample.grpc.StationList> list(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BoolValue> delete(
        com.google.protobuf.Int64Value request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELETE, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_FIND_BY_ID = 2;
  private static final int METHODID_LIST = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((via.pro3.grpcspringbootexample.grpc.Station) request,
              (io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.Station>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((via.pro3.grpcspringbootexample.grpc.Station) request,
              (io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.Station>) responseObserver);
          break;
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.Station>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.StationList>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.google.protobuf.Int64Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BoolValue>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class StationServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.pro3.grpcspringbootexample.grpc.DanishCrownServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (StationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StationServiceDescriptorSupplier())
              .addMethod(METHOD_CREATE)
              .addMethod(METHOD_UPDATE)
              .addMethod(METHOD_FIND_BY_ID)
              .addMethod(METHOD_LIST)
              .addMethod(METHOD_DELETE)
              .build();
        }
      }
    }
    return result;
  }
}
