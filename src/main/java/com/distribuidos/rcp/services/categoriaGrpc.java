package com.distribuidos.rcp.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: categoria.proto")
public final class categoriaGrpc {

  private categoriaGrpc() {}

  public static final String SERVICE_NAME = "categoria";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.services.Categoria.AltaRequest,
      com.distribuidos.rcp.services.Categoria.APIResponse> getAltaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "alta",
      requestType = com.distribuidos.rcp.services.Categoria.AltaRequest.class,
      responseType = com.distribuidos.rcp.services.Categoria.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.services.Categoria.AltaRequest,
      com.distribuidos.rcp.services.Categoria.APIResponse> getAltaMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.services.Categoria.AltaRequest, com.distribuidos.rcp.services.Categoria.APIResponse> getAltaMethod;
    if ((getAltaMethod = categoriaGrpc.getAltaMethod) == null) {
      synchronized (categoriaGrpc.class) {
        if ((getAltaMethod = categoriaGrpc.getAltaMethod) == null) {
          categoriaGrpc.getAltaMethod = getAltaMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.services.Categoria.AltaRequest, com.distribuidos.rcp.services.Categoria.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "categoria", "alta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.services.Categoria.AltaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.services.Categoria.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new categoriaMethodDescriptorSupplier("alta"))
                  .build();
          }
        }
     }
     return getAltaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.services.Categoria.BajaRequest,
      com.distribuidos.rcp.services.Categoria.APIResponse> getBajaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "baja",
      requestType = com.distribuidos.rcp.services.Categoria.BajaRequest.class,
      responseType = com.distribuidos.rcp.services.Categoria.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.services.Categoria.BajaRequest,
      com.distribuidos.rcp.services.Categoria.APIResponse> getBajaMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.services.Categoria.BajaRequest, com.distribuidos.rcp.services.Categoria.APIResponse> getBajaMethod;
    if ((getBajaMethod = categoriaGrpc.getBajaMethod) == null) {
      synchronized (categoriaGrpc.class) {
        if ((getBajaMethod = categoriaGrpc.getBajaMethod) == null) {
          categoriaGrpc.getBajaMethod = getBajaMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.services.Categoria.BajaRequest, com.distribuidos.rcp.services.Categoria.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "categoria", "baja"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.services.Categoria.BajaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.services.Categoria.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new categoriaMethodDescriptorSupplier("baja"))
                  .build();
          }
        }
     }
     return getBajaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static categoriaStub newStub(io.grpc.Channel channel) {
    return new categoriaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static categoriaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new categoriaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static categoriaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new categoriaFutureStub(channel);
  }

  /**
   */
  public static abstract class categoriaImplBase implements io.grpc.BindableService {

    /**
     */
    public void alta(com.distribuidos.rcp.services.Categoria.AltaRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.services.Categoria.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAltaMethod(), responseObserver);
    }

    /**
     */
    public void baja(com.distribuidos.rcp.services.Categoria.BajaRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.services.Categoria.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBajaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAltaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.services.Categoria.AltaRequest,
                com.distribuidos.rcp.services.Categoria.APIResponse>(
                  this, METHODID_ALTA)))
          .addMethod(
            getBajaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.services.Categoria.BajaRequest,
                com.distribuidos.rcp.services.Categoria.APIResponse>(
                  this, METHODID_BAJA)))
          .build();
    }
  }

  /**
   */
  public static final class categoriaStub extends io.grpc.stub.AbstractStub<categoriaStub> {
    private categoriaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private categoriaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected categoriaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new categoriaStub(channel, callOptions);
    }

    /**
     */
    public void alta(com.distribuidos.rcp.services.Categoria.AltaRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.services.Categoria.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAltaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void baja(com.distribuidos.rcp.services.Categoria.BajaRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.services.Categoria.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBajaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class categoriaBlockingStub extends io.grpc.stub.AbstractStub<categoriaBlockingStub> {
    private categoriaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private categoriaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected categoriaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new categoriaBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.distribuidos.rcp.services.Categoria.APIResponse alta(com.distribuidos.rcp.services.Categoria.AltaRequest request) {
      return blockingUnaryCall(
          getChannel(), getAltaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.distribuidos.rcp.services.Categoria.APIResponse baja(com.distribuidos.rcp.services.Categoria.BajaRequest request) {
      return blockingUnaryCall(
          getChannel(), getBajaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class categoriaFutureStub extends io.grpc.stub.AbstractStub<categoriaFutureStub> {
    private categoriaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private categoriaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected categoriaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new categoriaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.services.Categoria.APIResponse> alta(
        com.distribuidos.rcp.services.Categoria.AltaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAltaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.services.Categoria.APIResponse> baja(
        com.distribuidos.rcp.services.Categoria.BajaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBajaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALTA = 0;
  private static final int METHODID_BAJA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final categoriaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(categoriaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALTA:
          serviceImpl.alta((com.distribuidos.rcp.services.Categoria.AltaRequest) request,
              (io.grpc.stub.StreamObserver<com.distribuidos.rcp.services.Categoria.APIResponse>) responseObserver);
          break;
        case METHODID_BAJA:
          serviceImpl.baja((com.distribuidos.rcp.services.Categoria.BajaRequest) request,
              (io.grpc.stub.StreamObserver<com.distribuidos.rcp.services.Categoria.APIResponse>) responseObserver);
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

  private static abstract class categoriaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    categoriaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.distribuidos.rcp.services.Categoria.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("categoria");
    }
  }

  private static final class categoriaFileDescriptorSupplier
      extends categoriaBaseDescriptorSupplier {
    categoriaFileDescriptorSupplier() {}
  }

  private static final class categoriaMethodDescriptorSupplier
      extends categoriaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    categoriaMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (categoriaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new categoriaFileDescriptorSupplier())
              .addMethod(getAltaMethod())
              .addMethod(getBajaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
