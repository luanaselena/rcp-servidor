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

  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BajaTipoRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getBajaTipoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bajaTipo",
      requestType = com.distribuidos.rcp.Farmacia.BajaTipoRequest.class,
      responseType = com.distribuidos.rcp.Farmacia.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BajaTipoRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getBajaTipoMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BajaTipoRequest, com.distribuidos.rcp.Farmacia.APIResponse> getBajaTipoMethod;
    if ((getBajaTipoMethod = farmaciaGrpc.getBajaTipoMethod) == null) {
      synchronized (farmaciaGrpc.class) {
        if ((getBajaTipoMethod = farmaciaGrpc.getBajaTipoMethod) == null) {
          farmaciaGrpc.getBajaTipoMethod = getBajaTipoMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.Farmacia.BajaTipoRequest, com.distribuidos.rcp.Farmacia.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farmacia", "bajaTipo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.BajaTipoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new farmaciaMethodDescriptorSupplier("bajaTipo"))
                  .build();
          }
        }
     }
     return getBajaTipoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BusquedaRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getBusquedaPorPalabraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "busquedaPorPalabra",
      requestType = com.distribuidos.rcp.Farmacia.BusquedaRequest.class,
      responseType = com.distribuidos.rcp.Farmacia.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BusquedaRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getBusquedaPorPalabraMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.BusquedaRequest, com.distribuidos.rcp.Farmacia.APIResponse> getBusquedaPorPalabraMethod;
    if ((getBusquedaPorPalabraMethod = farmaciaGrpc.getBusquedaPorPalabraMethod) == null) {
      synchronized (farmaciaGrpc.class) {
        if ((getBusquedaPorPalabraMethod = farmaciaGrpc.getBusquedaPorPalabraMethod) == null) {
          farmaciaGrpc.getBusquedaPorPalabraMethod = getBusquedaPorPalabraMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.Farmacia.BusquedaRequest, com.distribuidos.rcp.Farmacia.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farmacia", "busquedaPorPalabra"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.BusquedaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new farmaciaMethodDescriptorSupplier("busquedaPorPalabra"))
                  .build();
          }
        }
     }
     return getBusquedaPorPalabraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.ListadoMedicamentos,
      com.distribuidos.rcp.Farmacia.APIResponse> getListadoMedicamentosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listadoMedicamentos",
      requestType = com.distribuidos.rcp.Farmacia.ListadoMedicamentos.class,
      responseType = com.distribuidos.rcp.Farmacia.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.ListadoMedicamentos,
      com.distribuidos.rcp.Farmacia.APIResponse> getListadoMedicamentosMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.ListadoMedicamentos, com.distribuidos.rcp.Farmacia.APIResponse> getListadoMedicamentosMethod;
    if ((getListadoMedicamentosMethod = farmaciaGrpc.getListadoMedicamentosMethod) == null) {
      synchronized (farmaciaGrpc.class) {
        if ((getListadoMedicamentosMethod = farmaciaGrpc.getListadoMedicamentosMethod) == null) {
          farmaciaGrpc.getListadoMedicamentosMethod = getListadoMedicamentosMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.Farmacia.ListadoMedicamentos, com.distribuidos.rcp.Farmacia.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farmacia", "listadoMedicamentos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.ListadoMedicamentos.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new farmaciaMethodDescriptorSupplier("listadoMedicamentos"))
                  .build();
          }
        }
     }
     return getListadoMedicamentosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.ListadoCodigos,
      com.distribuidos.rcp.Farmacia.APIResponse> getListadoCodigosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listadoCodigos",
      requestType = com.distribuidos.rcp.Farmacia.ListadoCodigos.class,
      responseType = com.distribuidos.rcp.Farmacia.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.ListadoCodigos,
      com.distribuidos.rcp.Farmacia.APIResponse> getListadoCodigosMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.ListadoCodigos, com.distribuidos.rcp.Farmacia.APIResponse> getListadoCodigosMethod;
    if ((getListadoCodigosMethod = farmaciaGrpc.getListadoCodigosMethod) == null) {
      synchronized (farmaciaGrpc.class) {
        if ((getListadoCodigosMethod = farmaciaGrpc.getListadoCodigosMethod) == null) {
          farmaciaGrpc.getListadoCodigosMethod = getListadoCodigosMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.Farmacia.ListadoCodigos, com.distribuidos.rcp.Farmacia.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farmacia", "listadoCodigos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.ListadoCodigos.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new farmaciaMethodDescriptorSupplier("listadoCodigos"))
                  .build();
          }
        }
     }
     return getListadoCodigosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getDigitoVerificadorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "digitoVerificador",
      requestType = com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest.class,
      responseType = com.distribuidos.rcp.Farmacia.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest,
      com.distribuidos.rcp.Farmacia.APIResponse> getDigitoVerificadorMethod() {
    io.grpc.MethodDescriptor<com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest, com.distribuidos.rcp.Farmacia.APIResponse> getDigitoVerificadorMethod;
    if ((getDigitoVerificadorMethod = farmaciaGrpc.getDigitoVerificadorMethod) == null) {
      synchronized (farmaciaGrpc.class) {
        if ((getDigitoVerificadorMethod = farmaciaGrpc.getDigitoVerificadorMethod) == null) {
          farmaciaGrpc.getDigitoVerificadorMethod = getDigitoVerificadorMethod = 
              io.grpc.MethodDescriptor.<com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest, com.distribuidos.rcp.Farmacia.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "farmacia", "digitoVerificador"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.distribuidos.rcp.Farmacia.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new farmaciaMethodDescriptorSupplier("digitoVerificador"))
                  .build();
          }
        }
     }
     return getDigitoVerificadorMethod;
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
    public void bajaTipo(com.distribuidos.rcp.Farmacia.BajaTipoRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBajaTipoMethod(), responseObserver);
    }

    /**
     */
    public void busquedaPorPalabra(com.distribuidos.rcp.Farmacia.BusquedaRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBusquedaPorPalabraMethod(), responseObserver);
    }

    /**
     */
    public void listadoMedicamentos(com.distribuidos.rcp.Farmacia.ListadoMedicamentos request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListadoMedicamentosMethod(), responseObserver);
    }

    /**
     */
    public void listadoCodigos(com.distribuidos.rcp.Farmacia.ListadoCodigos request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListadoCodigosMethod(), responseObserver);
    }

    /**
     */
    public void digitoVerificador(com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDigitoVerificadorMethod(), responseObserver);
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
            getBajaTipoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.Farmacia.BajaTipoRequest,
                com.distribuidos.rcp.Farmacia.APIResponse>(
                  this, METHODID_BAJA_TIPO)))
          .addMethod(
            getBusquedaPorPalabraMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.Farmacia.BusquedaRequest,
                com.distribuidos.rcp.Farmacia.APIResponse>(
                  this, METHODID_BUSQUEDA_POR_PALABRA)))
          .addMethod(
            getListadoMedicamentosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.Farmacia.ListadoMedicamentos,
                com.distribuidos.rcp.Farmacia.APIResponse>(
                  this, METHODID_LISTADO_MEDICAMENTOS)))
          .addMethod(
            getListadoCodigosMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.Farmacia.ListadoCodigos,
                com.distribuidos.rcp.Farmacia.APIResponse>(
                  this, METHODID_LISTADO_CODIGOS)))
          .addMethod(
            getDigitoVerificadorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest,
                com.distribuidos.rcp.Farmacia.APIResponse>(
                  this, METHODID_DIGITO_VERIFICADOR)))
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
    public void bajaTipo(com.distribuidos.rcp.Farmacia.BajaTipoRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBajaTipoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void busquedaPorPalabra(com.distribuidos.rcp.Farmacia.BusquedaRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBusquedaPorPalabraMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listadoMedicamentos(com.distribuidos.rcp.Farmacia.ListadoMedicamentos request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListadoMedicamentosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listadoCodigos(com.distribuidos.rcp.Farmacia.ListadoCodigos request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListadoCodigosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void digitoVerificador(com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest request,
        io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDigitoVerificadorMethod(), getCallOptions()), request, responseObserver);
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
    public com.distribuidos.rcp.Farmacia.APIResponse bajaTipo(com.distribuidos.rcp.Farmacia.BajaTipoRequest request) {
      return blockingUnaryCall(
          getChannel(), getBajaTipoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.distribuidos.rcp.Farmacia.APIResponse busquedaPorPalabra(com.distribuidos.rcp.Farmacia.BusquedaRequest request) {
      return blockingUnaryCall(
          getChannel(), getBusquedaPorPalabraMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.distribuidos.rcp.Farmacia.APIResponse listadoMedicamentos(com.distribuidos.rcp.Farmacia.ListadoMedicamentos request) {
      return blockingUnaryCall(
          getChannel(), getListadoMedicamentosMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.distribuidos.rcp.Farmacia.APIResponse listadoCodigos(com.distribuidos.rcp.Farmacia.ListadoCodigos request) {
      return blockingUnaryCall(
          getChannel(), getListadoCodigosMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.distribuidos.rcp.Farmacia.APIResponse digitoVerificador(com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest request) {
      return blockingUnaryCall(
          getChannel(), getDigitoVerificadorMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.Farmacia.APIResponse> bajaTipo(
        com.distribuidos.rcp.Farmacia.BajaTipoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBajaTipoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.Farmacia.APIResponse> busquedaPorPalabra(
        com.distribuidos.rcp.Farmacia.BusquedaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBusquedaPorPalabraMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.Farmacia.APIResponse> listadoMedicamentos(
        com.distribuidos.rcp.Farmacia.ListadoMedicamentos request) {
      return futureUnaryCall(
          getChannel().newCall(getListadoMedicamentosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.Farmacia.APIResponse> listadoCodigos(
        com.distribuidos.rcp.Farmacia.ListadoCodigos request) {
      return futureUnaryCall(
          getChannel().newCall(getListadoCodigosMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.distribuidos.rcp.Farmacia.APIResponse> digitoVerificador(
        com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDigitoVerificadorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ALTA = 0;
  private static final int METHODID_BAJA = 1;
  private static final int METHODID_ALTA_TIPO = 2;
  private static final int METHODID_BAJA_TIPO = 3;
  private static final int METHODID_BUSQUEDA_POR_PALABRA = 4;
  private static final int METHODID_LISTADO_MEDICAMENTOS = 5;
  private static final int METHODID_LISTADO_CODIGOS = 6;
  private static final int METHODID_DIGITO_VERIFICADOR = 7;

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
        case METHODID_BAJA_TIPO:
          serviceImpl.bajaTipo((com.distribuidos.rcp.Farmacia.BajaTipoRequest) request,
              (io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse>) responseObserver);
          break;
        case METHODID_BUSQUEDA_POR_PALABRA:
          serviceImpl.busquedaPorPalabra((com.distribuidos.rcp.Farmacia.BusquedaRequest) request,
              (io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse>) responseObserver);
          break;
        case METHODID_LISTADO_MEDICAMENTOS:
          serviceImpl.listadoMedicamentos((com.distribuidos.rcp.Farmacia.ListadoMedicamentos) request,
              (io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse>) responseObserver);
          break;
        case METHODID_LISTADO_CODIGOS:
          serviceImpl.listadoCodigos((com.distribuidos.rcp.Farmacia.ListadoCodigos) request,
              (io.grpc.stub.StreamObserver<com.distribuidos.rcp.Farmacia.APIResponse>) responseObserver);
          break;
        case METHODID_DIGITO_VERIFICADOR:
          serviceImpl.digitoVerificador((com.distribuidos.rcp.Farmacia.DigitoVerificadorRequest) request,
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
              .addMethod(getBajaTipoMethod())
              .addMethod(getBusquedaPorPalabraMethod())
              .addMethod(getListadoMedicamentosMethod())
              .addMethod(getListadoCodigosMethod())
              .addMethod(getDigitoVerificadorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
