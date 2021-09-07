package com.distribuidos.rcp;

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
    comments = "Source: farmacia.proto")
public final class farmaciaGrpc {

  private farmaciaGrpc() {}

  public static final String SERVICE_NAME = "farmacia";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.AltaRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getAltaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "alta",
      requestType = com.distribuidos.rcp.Farmacia.AltaRequest.class,
      responseType = com.distribuidos.rcp.Farmacia.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.AltaRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getAltaMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.AltaRequest, com.distribuidos.rcp.Farmacia.APIResponse> getAltaMethod;
    if ((getAltaMethod = farmaciaGrpc.getAltaMethod) == null) {
      synchronized (farmaciaGrpc.class) {
        if ((getAltaMethod = farmaciaGrpc.getAltaMethod) == null) {
          farmaciaGrpc.getAltaMethod = getAltaMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.Farmacia.AltaRequest, com.distribuidos.rcp.Farmacia.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farmacia", "alta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.AltaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new farmaciaMethodDescriptorSupplier("alta"))
                  .build();
          }
        }
     }
     return getAltaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BajaRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getBajaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "baja",
      requestType = com.distribuidos.rcp.Farmacia.BajaRequest.class,
      responseType = com.distribuidos.rcp.Farmacia.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BajaRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getBajaMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BajaRequest, com.distribuidos.rcp.Farmacia.APIResponse> getBajaMethod;
    if ((getBajaMethod = farmaciaGrpc.getBajaMethod) == null) {
      synchronized (farmaciaGrpc.class) {
        if ((getBajaMethod = farmaciaGrpc.getBajaMethod) == null) {
          farmaciaGrpc.getBajaMethod = getBajaMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.Farmacia.BajaRequest, com.distribuidos.rcp.Farmacia.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farmacia", "baja"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.BajaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new farmaciaMethodDescriptorSupplier("baja"))
                  .build();
          }
        }
     }
     return getBajaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.AltaTipoRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getAltaTipoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "altaTipo",
      requestType = com.distribuidos.rcp.Farmacia.AltaTipoRequest.class,
      responseType = com.distribuidos.rcp.Farmacia.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.AltaTipoRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getAltaTipoMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.AltaTipoRequest, com.distribuidos.rcp.Farmacia.APIResponse> getAltaTipoMethod;
    if ((getAltaTipoMethod = farmaciaGrpc.getAltaTipoMethod) == null) {
      synchronized (farmaciaGrpc.class) {
        if ((getAltaTipoMethod = farmaciaGrpc.getAltaTipoMethod) == null) {
          farmaciaGrpc.getAltaTipoMethod = getAltaTipoMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.Farmacia.AltaTipoRequest, com.distribuidos.rcp.Farmacia.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farmacia", "altaTipo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.AltaTipoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new farmaciaMethodDescriptorSupplier("altaTipo"))
                  .build();
          }
        }
     }
     return getAltaTipoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getBusquedaPorPalabraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "busquedaPorPalabra",
      requestType = com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest.class,
      responseType = com.distribuidos.rcp.Farmacia.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getBusquedaPorPalabraMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest, com.distribuidos.rcp.Farmacia.APIResponse> getBusquedaPorPalabraMethod;
    if ((getBusquedaPorPalabraMethod = farmaciaGrpc.getBusquedaPorPalabraMethod) == null) {
      synchronized (farmaciaGrpc.class) {
        if ((getBusquedaPorPalabraMethod = farmaciaGrpc.getBusquedaPorPalabraMethod) == null) {
          farmaciaGrpc.getBusquedaPorPalabraMethod = getBusquedaPorPalabraMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest, com.distribuidos.rcp.Farmacia.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farmacia", "busquedaPorPalabra"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new farmaciaMethodDescriptorSupplier("busquedaPorPalabra"))
                  .build();
          }
        }
     }
     return getBusquedaPorPalabraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getBusquedaPorLetraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "busquedaPorLetra",
      requestType = com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest.class,
      responseType = com.distribuidos.rcp.Farmacia.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getBusquedaPorLetraMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest, com.distribuidos.rcp.Farmacia.APIResponse> getBusquedaPorLetraMethod;
    if ((getBusquedaPorLetraMethod = farmaciaGrpc.getBusquedaPorLetraMethod) == null) {
      synchronized (farmaciaGrpc.class) {
        if ((getBusquedaPorLetraMethod = farmaciaGrpc.getBusquedaPorLetraMethod) == null) {
          farmaciaGrpc.getBusquedaPorLetraMethod = getBusquedaPorLetraMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest, com.distribuidos.rcp.Farmacia.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farmacia", "busquedaPorLetra"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new farmaciaMethodDescriptorSupplier("busquedaPorLetra"))
                  .build();
          }
        }
     }
     return getBusquedaPorLetraMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static farmaciaStub newStub(io.grpc.Channel channel) {
    return new farmaciaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static farmaciaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new farmaciaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static farmaciaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new farmaciaFutureStub(channel);
  }

  /**
   */
  public static abstract class farmaciaImplBase implements io.grpc.BindableService {

    /**
     */
    public void alta(com.distribuidos.rcp.Farmacia.AltaRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAltaMethod(), responseObserver);
    }

    /**
     */
    public void baja(com.distribuidos.rcp.Farmacia.BajaRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBajaMethod(), responseObserver);
    }

    /**
     */
    public void altaTipo(com.distribuidos.rcp.Farmacia.AltaTipoRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAltaTipoMethod(), responseObserver);
    }

    /**
     */
    public void busquedaPorPalabra(com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBusquedaPorPalabraMethod(), responseObserver);
    }

    /**
     */
    public void busquedaPorLetra(com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBusquedaPorLetraMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAltaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.Farmacia.AltaRequest,
                com.distribuidos.rcp.Farmacia.APIResponse>(
                  this, METHODID_ALTA)))
          .addMethod(
            getBajaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.Farmacia.BajaRequest,
                com.distribuidos.rcp.Farmacia.APIResponse>(
                  this, METHODID_BAJA)))
          .addMethod(
            getAltaTipoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.Farmacia.AltaTipoRequest,
                com.distribuidos.rcp.Farmacia.APIResponse>(
                  this, METHODID_ALTA_TIPO)))
          .addMethod(
            getBusquedaPorPalabraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest,
                com.distribuidos.rcp.Farmacia.APIResponse>(
                  this, METHODID_BUSQUEDA_POR_PALABRA)))
          .addMethod(
            getBusquedaPorLetraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest,
                com.distribuidos.rcp.Farmacia.APIResponse>(
                  this, METHODID_BUSQUEDA_POR_LETRA)))
          .build();
    }
  }

  /**
   */
  public static final class farmaciaStub extends io.grpc.stub.AbstractStub<farmaciaStub> {
    private farmaciaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private farmaciaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected farmaciaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new farmaciaStub(channel, callOptions);
    }

    /**
     */
    public void alta(com.distribuidos.rcp.Farmacia.AltaRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAltaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void baja(com.distribuidos.rcp.Farmacia.BajaRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBajaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void altaTipo(com.distribuidos.rcp.Farmacia.AltaTipoRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAltaTipoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void busquedaPorPalabra(com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBusquedaPorPalabraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void busquedaPorLetra(com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBusquedaPorLetraMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class farmaciaBlockingStub extends io.grpc.stub.AbstractStub<farmaciaBlockingStub> {
    private farmaciaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private farmaciaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected farmaciaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new farmaciaBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.distribuidos.rcp.Farmacia.APIResponse alta(com.distribuidos.rcp.Farmacia.AltaRequest request) {
      return blockingUnaryCall(
          getChannel(), getAltaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.distribuidos.rcp.Farmacia.APIResponse baja(com.distribuidos.rcp.Farmacia.BajaRequest request) {
      return blockingUnaryCall(
          getChannel(), getBajaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.distribuidos.rcp.Farmacia.APIResponse altaTipo(com.distribuidos.rcp.Farmacia.AltaTipoRequest request) {
      return blockingUnaryCall(
          getChannel(), getAltaTipoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.distribuidos.rcp.Farmacia.APIResponse busquedaPorPalabra(com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest request) {
      return blockingUnaryCall(
          getChannel(), getBusquedaPorPalabraMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.distribuidos.rcp.Farmacia.APIResponse busquedaPorLetra(com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest request) {
      return blockingUnaryCall(
          getChannel(), getBusquedaPorLetraMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class farmaciaFutureStub extends io.grpc.stub.AbstractStub<farmaciaFutureStub> {
    private farmaciaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private farmaciaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected farmaciaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new farmaciaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.Farmacia.APIResponse> alta(
        com.distribuidos.rcp.Farmacia.AltaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAltaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.Farmacia.APIResponse> baja(
        com.distribuidos.rcp.Farmacia.BajaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBajaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.Farmacia.APIResponse> altaTipo(
        com.distribuidos.rcp.Farmacia.AltaTipoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAltaTipoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.Farmacia.APIResponse> busquedaPorPalabra(
        com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBusquedaPorPalabraMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.Farmacia.APIResponse> busquedaPorLetra(
        com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBusquedaPorLetraMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALTA = 0;
  private static final int METHODID_BAJA = 1;
  private static final int METHODID_ALTA_TIPO = 2;
  private static final int METHODID_BUSQUEDA_POR_PALABRA = 3;
  private static final int METHODID_BUSQUEDA_POR_LETRA = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final farmaciaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(farmaciaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALTA:
          serviceImpl.alta((com.distribuidos.rcp.Farmacia.AltaRequest) request,
              (io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse>) responseObserver);
          break;
        case METHODID_BAJA:
          serviceImpl.baja((com.distribuidos.rcp.Farmacia.BajaRequest) request,
              (io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse>) responseObserver);
          break;
        case METHODID_ALTA_TIPO:
          serviceImpl.altaTipo((com.distribuidos.rcp.Farmacia.AltaTipoRequest) request,
              (io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse>) responseObserver);
          break;
        case METHODID_BUSQUEDA_POR_PALABRA:
          serviceImpl.busquedaPorPalabra((com.distribuidos.rcp.Farmacia.BusquedaPorPalabraRequest) request,
              (io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse>) responseObserver);
          break;
        case METHODID_BUSQUEDA_POR_LETRA:
          serviceImpl.busquedaPorLetra((com.distribuidos.rcp.Farmacia.BusquedaPorLetraRequest) request,
              (io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse>) responseObserver);
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

  private static abstract class farmaciaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    farmaciaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.distribuidos.rcp.Farmacia.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("farmacia");
    }
  }

  private static final class farmaciaFileDescriptorSupplier
      extends farmaciaBaseDescriptorSupplier {
    farmaciaFileDescriptorSupplier() {}
  }

  private static final class farmaciaMethodDescriptorSupplier
      extends farmaciaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    farmaciaMethodDescriptorSupplier(String methodName) {
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
      synchronized (farmaciaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new farmaciaFileDescriptorSupplier())
              .addMethod(getAltaMethod())
              .addMethod(getBajaMethod())
              .addMethod(getAltaTipoMethod())
              .addMethod(getBusquedaPorPalabraMethod())
              .addMethod(getBusquedaPorLetraMethod())
              .build();
        }
      }
    }
    return result;
  }
}
