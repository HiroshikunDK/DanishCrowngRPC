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
public final class TrackingServiceGrpc {

  private TrackingServiceGrpc() {}

  public static final String SERVICE_NAME = "TrackingService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<via.pro3.grpcspringbootexample.grpc.Animal,
      via.pro3.grpcspringbootexample.grpc.AniProRegistrationList> METHOD_GET_PRODUCTS_FROM_ANIMAL =
      io.grpc.MethodDescriptor.<via.pro3.grpcspringbootexample.grpc.Animal, via.pro3.grpcspringbootexample.grpc.AniProRegistrationList>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "TrackingService", "getProductsFromAnimal"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.Animal.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.AniProRegistrationList.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<via.pro3.grpcspringbootexample.grpc.Product,
      via.pro3.grpcspringbootexample.grpc.AniProRegistrationList> METHOD_GET_ANIMAL_FROM_PRODUCT =
      io.grpc.MethodDescriptor.<via.pro3.grpcspringbootexample.grpc.Product, via.pro3.grpcspringbootexample.grpc.AniProRegistrationList>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "TrackingService", "getAnimalFromProduct"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.Product.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.AniProRegistrationList.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<via.pro3.grpcspringbootexample.grpc.AniProRegistration,
      via.pro3.grpcspringbootexample.grpc.AnimalList> METHOD_GET_ANIMAL_FROM_PRODUCT_REGISTATION =
      io.grpc.MethodDescriptor.<via.pro3.grpcspringbootexample.grpc.AniProRegistration, via.pro3.grpcspringbootexample.grpc.AnimalList>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "TrackingService", "getAnimalFromProductRegistation"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.AniProRegistration.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              via.pro3.grpcspringbootexample.grpc.AnimalList.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrackingServiceStub newStub(io.grpc.Channel channel) {
    return new TrackingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrackingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrackingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrackingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrackingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TrackingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *assignment 2 functions
     * </pre>
     */
    public void getProductsFromAnimal(via.pro3.grpcspringbootexample.grpc.Animal request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.AniProRegistrationList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCTS_FROM_ANIMAL, responseObserver);
    }

    /**
     */
    public void getAnimalFromProduct(via.pro3.grpcspringbootexample.grpc.Product request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.AniProRegistrationList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ANIMAL_FROM_PRODUCT, responseObserver);
    }

    /**
     */
    public void getAnimalFromProductRegistation(via.pro3.grpcspringbootexample.grpc.AniProRegistration request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.AnimalList> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ANIMAL_FROM_PRODUCT_REGISTATION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_PRODUCTS_FROM_ANIMAL,
            asyncUnaryCall(
              new MethodHandlers<
                via.pro3.grpcspringbootexample.grpc.Animal,
                via.pro3.grpcspringbootexample.grpc.AniProRegistrationList>(
                  this, METHODID_GET_PRODUCTS_FROM_ANIMAL)))
          .addMethod(
            METHOD_GET_ANIMAL_FROM_PRODUCT,
            asyncUnaryCall(
              new MethodHandlers<
                via.pro3.grpcspringbootexample.grpc.Product,
                via.pro3.grpcspringbootexample.grpc.AniProRegistrationList>(
                  this, METHODID_GET_ANIMAL_FROM_PRODUCT)))
          .addMethod(
            METHOD_GET_ANIMAL_FROM_PRODUCT_REGISTATION,
            asyncUnaryCall(
              new MethodHandlers<
                via.pro3.grpcspringbootexample.grpc.AniProRegistration,
                via.pro3.grpcspringbootexample.grpc.AnimalList>(
                  this, METHODID_GET_ANIMAL_FROM_PRODUCT_REGISTATION)))
          .build();
    }
  }

  /**
   */
  public static final class TrackingServiceStub extends io.grpc.stub.AbstractStub<TrackingServiceStub> {
    private TrackingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *assignment 2 functions
     * </pre>
     */
    public void getProductsFromAnimal(via.pro3.grpcspringbootexample.grpc.Animal request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.AniProRegistrationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_FROM_ANIMAL, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalFromProduct(via.pro3.grpcspringbootexample.grpc.Product request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.AniProRegistrationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMAL_FROM_PRODUCT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalFromProductRegistation(via.pro3.grpcspringbootexample.grpc.AniProRegistration request,
        io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.AnimalList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMAL_FROM_PRODUCT_REGISTATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrackingServiceBlockingStub extends io.grpc.stub.AbstractStub<TrackingServiceBlockingStub> {
    private TrackingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *assignment 2 functions
     * </pre>
     */
    public via.pro3.grpcspringbootexample.grpc.AniProRegistrationList getProductsFromAnimal(via.pro3.grpcspringbootexample.grpc.Animal request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCTS_FROM_ANIMAL, getCallOptions(), request);
    }

    /**
     */
    public via.pro3.grpcspringbootexample.grpc.AniProRegistrationList getAnimalFromProduct(via.pro3.grpcspringbootexample.grpc.Product request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ANIMAL_FROM_PRODUCT, getCallOptions(), request);
    }

    /**
     */
    public via.pro3.grpcspringbootexample.grpc.AnimalList getAnimalFromProductRegistation(via.pro3.grpcspringbootexample.grpc.AniProRegistration request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ANIMAL_FROM_PRODUCT_REGISTATION, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrackingServiceFutureStub extends io.grpc.stub.AbstractStub<TrackingServiceFutureStub> {
    private TrackingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrackingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrackingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrackingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *assignment 2 functions
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<via.pro3.grpcspringbootexample.grpc.AniProRegistrationList> getProductsFromAnimal(
        via.pro3.grpcspringbootexample.grpc.Animal request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS_FROM_ANIMAL, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.pro3.grpcspringbootexample.grpc.AniProRegistrationList> getAnimalFromProduct(
        via.pro3.grpcspringbootexample.grpc.Product request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMAL_FROM_PRODUCT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.pro3.grpcspringbootexample.grpc.AnimalList> getAnimalFromProductRegistation(
        via.pro3.grpcspringbootexample.grpc.AniProRegistration request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ANIMAL_FROM_PRODUCT_REGISTATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS_FROM_ANIMAL = 0;
  private static final int METHODID_GET_ANIMAL_FROM_PRODUCT = 1;
  private static final int METHODID_GET_ANIMAL_FROM_PRODUCT_REGISTATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrackingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrackingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCTS_FROM_ANIMAL:
          serviceImpl.getProductsFromAnimal((via.pro3.grpcspringbootexample.grpc.Animal) request,
              (io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.AniProRegistrationList>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_FROM_PRODUCT:
          serviceImpl.getAnimalFromProduct((via.pro3.grpcspringbootexample.grpc.Product) request,
              (io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.AniProRegistrationList>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_FROM_PRODUCT_REGISTATION:
          serviceImpl.getAnimalFromProductRegistation((via.pro3.grpcspringbootexample.grpc.AniProRegistration) request,
              (io.grpc.stub.StreamObserver<via.pro3.grpcspringbootexample.grpc.AnimalList>) responseObserver);
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

  private static final class TrackingServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.pro3.grpcspringbootexample.grpc.DanishCrownServiceProto.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TrackingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrackingServiceDescriptorSupplier())
              .addMethod(METHOD_GET_PRODUCTS_FROM_ANIMAL)
              .addMethod(METHOD_GET_ANIMAL_FROM_PRODUCT)
              .addMethod(METHOD_GET_ANIMAL_FROM_PRODUCT_REGISTATION)
              .build();
        }
      }
    }
    return result;
  }
}
