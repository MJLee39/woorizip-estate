package com.example.estate_grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: estate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EstateProtoServiceGrpc {

  private EstateProtoServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "estate.EstateProtoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateIdRequest,
      com.example.estate_grpc.proto.EstateInfoResponse> getFindEstateInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindEstateInfo",
      requestType = com.example.estate_grpc.proto.EstateIdRequest.class,
      responseType = com.example.estate_grpc.proto.EstateInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateIdRequest,
      com.example.estate_grpc.proto.EstateInfoResponse> getFindEstateInfoMethod() {
    io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateIdRequest, com.example.estate_grpc.proto.EstateInfoResponse> getFindEstateInfoMethod;
    if ((getFindEstateInfoMethod = EstateProtoServiceGrpc.getFindEstateInfoMethod) == null) {
      synchronized (EstateProtoServiceGrpc.class) {
        if ((getFindEstateInfoMethod = EstateProtoServiceGrpc.getFindEstateInfoMethod) == null) {
          EstateProtoServiceGrpc.getFindEstateInfoMethod = getFindEstateInfoMethod =
              io.grpc.MethodDescriptor.<com.example.estate_grpc.proto.EstateIdRequest, com.example.estate_grpc.proto.EstateInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindEstateInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.estate_grpc.proto.EstateIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.estate_grpc.proto.EstateInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EstateProtoServiceMethodDescriptorSupplier("FindEstateInfo"))
              .build();
        }
      }
    }
    return getFindEstateInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateAllRequest,
      com.example.estate_grpc.proto.EstateAllResponse> getGetEstateAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEstateAll",
      requestType = com.example.estate_grpc.proto.EstateAllRequest.class,
      responseType = com.example.estate_grpc.proto.EstateAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateAllRequest,
      com.example.estate_grpc.proto.EstateAllResponse> getGetEstateAllMethod() {
    io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateAllRequest, com.example.estate_grpc.proto.EstateAllResponse> getGetEstateAllMethod;
    if ((getGetEstateAllMethod = EstateProtoServiceGrpc.getGetEstateAllMethod) == null) {
      synchronized (EstateProtoServiceGrpc.class) {
        if ((getGetEstateAllMethod = EstateProtoServiceGrpc.getGetEstateAllMethod) == null) {
          EstateProtoServiceGrpc.getGetEstateAllMethod = getGetEstateAllMethod =
              io.grpc.MethodDescriptor.<com.example.estate_grpc.proto.EstateAllRequest, com.example.estate_grpc.proto.EstateAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEstateAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.estate_grpc.proto.EstateAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.estate_grpc.proto.EstateAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EstateProtoServiceMethodDescriptorSupplier("GetEstateAll"))
              .build();
        }
      }
    }
    return getGetEstateAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateSaveRequest,
      com.example.estate_grpc.proto.EstateSaveResponse> getSaveEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveEstate",
      requestType = com.example.estate_grpc.proto.EstateSaveRequest.class,
      responseType = com.example.estate_grpc.proto.EstateSaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateSaveRequest,
      com.example.estate_grpc.proto.EstateSaveResponse> getSaveEstateMethod() {
    io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateSaveRequest, com.example.estate_grpc.proto.EstateSaveResponse> getSaveEstateMethod;
    if ((getSaveEstateMethod = EstateProtoServiceGrpc.getSaveEstateMethod) == null) {
      synchronized (EstateProtoServiceGrpc.class) {
        if ((getSaveEstateMethod = EstateProtoServiceGrpc.getSaveEstateMethod) == null) {
          EstateProtoServiceGrpc.getSaveEstateMethod = getSaveEstateMethod =
              io.grpc.MethodDescriptor.<com.example.estate_grpc.proto.EstateSaveRequest, com.example.estate_grpc.proto.EstateSaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.estate_grpc.proto.EstateSaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.estate_grpc.proto.EstateSaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EstateProtoServiceMethodDescriptorSupplier("SaveEstate"))
              .build();
        }
      }
    }
    return getSaveEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateUpdateRequest,
      com.example.estate_grpc.proto.EstateUpdateResponse> getUpdateEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEstate",
      requestType = com.example.estate_grpc.proto.EstateUpdateRequest.class,
      responseType = com.example.estate_grpc.proto.EstateUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateUpdateRequest,
      com.example.estate_grpc.proto.EstateUpdateResponse> getUpdateEstateMethod() {
    io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateUpdateRequest, com.example.estate_grpc.proto.EstateUpdateResponse> getUpdateEstateMethod;
    if ((getUpdateEstateMethod = EstateProtoServiceGrpc.getUpdateEstateMethod) == null) {
      synchronized (EstateProtoServiceGrpc.class) {
        if ((getUpdateEstateMethod = EstateProtoServiceGrpc.getUpdateEstateMethod) == null) {
          EstateProtoServiceGrpc.getUpdateEstateMethod = getUpdateEstateMethod =
              io.grpc.MethodDescriptor.<com.example.estate_grpc.proto.EstateUpdateRequest, com.example.estate_grpc.proto.EstateUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.estate_grpc.proto.EstateUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.estate_grpc.proto.EstateUpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EstateProtoServiceMethodDescriptorSupplier("UpdateEstate"))
              .build();
        }
      }
    }
    return getUpdateEstateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateDeleteRequest,
      com.example.estate_grpc.proto.EstateDeleteResponse> getDeleteEstateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEstate",
      requestType = com.example.estate_grpc.proto.EstateDeleteRequest.class,
      responseType = com.example.estate_grpc.proto.EstateDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateDeleteRequest,
      com.example.estate_grpc.proto.EstateDeleteResponse> getDeleteEstateMethod() {
    io.grpc.MethodDescriptor<com.example.estate_grpc.proto.EstateDeleteRequest, com.example.estate_grpc.proto.EstateDeleteResponse> getDeleteEstateMethod;
    if ((getDeleteEstateMethod = EstateProtoServiceGrpc.getDeleteEstateMethod) == null) {
      synchronized (EstateProtoServiceGrpc.class) {
        if ((getDeleteEstateMethod = EstateProtoServiceGrpc.getDeleteEstateMethod) == null) {
          EstateProtoServiceGrpc.getDeleteEstateMethod = getDeleteEstateMethod =
              io.grpc.MethodDescriptor.<com.example.estate_grpc.proto.EstateDeleteRequest, com.example.estate_grpc.proto.EstateDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEstate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.estate_grpc.proto.EstateDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.estate_grpc.proto.EstateDeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EstateProtoServiceMethodDescriptorSupplier("DeleteEstate"))
              .build();
        }
      }
    }
    return getDeleteEstateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EstateProtoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceStub>() {
        @java.lang.Override
        public EstateProtoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EstateProtoServiceStub(channel, callOptions);
        }
      };
    return EstateProtoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EstateProtoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceBlockingStub>() {
        @java.lang.Override
        public EstateProtoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EstateProtoServiceBlockingStub(channel, callOptions);
        }
      };
    return EstateProtoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EstateProtoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EstateProtoServiceFutureStub>() {
        @java.lang.Override
        public EstateProtoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EstateProtoServiceFutureStub(channel, callOptions);
        }
      };
    return EstateProtoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findEstateInfo(com.example.estate_grpc.proto.EstateIdRequest request,
        io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindEstateInfoMethod(), responseObserver);
    }

    /**
     */
    default void getEstateAll(com.example.estate_grpc.proto.EstateAllRequest request,
        io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEstateAllMethod(), responseObserver);
    }

    /**
     */
    default void saveEstate(com.example.estate_grpc.proto.EstateSaveRequest request,
        io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateSaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveEstateMethod(), responseObserver);
    }

    /**
     */
    default void updateEstate(com.example.estate_grpc.proto.EstateUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateUpdateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEstateMethod(), responseObserver);
    }

    /**
     */
    default void deleteEstate(com.example.estate_grpc.proto.EstateDeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateDeleteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEstateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EstateProtoService.
   */
  public static abstract class EstateProtoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EstateProtoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EstateProtoService.
   */
  public static final class EstateProtoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EstateProtoServiceStub> {
    private EstateProtoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EstateProtoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EstateProtoServiceStub(channel, callOptions);
    }

    /**
     */
    public void findEstateInfo(com.example.estate_grpc.proto.EstateIdRequest request,
        io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindEstateInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEstateAll(com.example.estate_grpc.proto.EstateAllRequest request,
        io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEstateAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveEstate(com.example.estate_grpc.proto.EstateSaveRequest request,
        io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateSaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEstate(com.example.estate_grpc.proto.EstateUpdateRequest request,
        io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateUpdateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEstateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEstate(com.example.estate_grpc.proto.EstateDeleteRequest request,
        io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateDeleteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEstateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EstateProtoService.
   */
  public static final class EstateProtoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EstateProtoServiceBlockingStub> {
    private EstateProtoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EstateProtoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EstateProtoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.estate_grpc.proto.EstateInfoResponse findEstateInfo(com.example.estate_grpc.proto.EstateIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindEstateInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.estate_grpc.proto.EstateAllResponse getEstateAll(com.example.estate_grpc.proto.EstateAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEstateAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.estate_grpc.proto.EstateSaveResponse saveEstate(com.example.estate_grpc.proto.EstateSaveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveEstateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.estate_grpc.proto.EstateUpdateResponse updateEstate(com.example.estate_grpc.proto.EstateUpdateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEstateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.estate_grpc.proto.EstateDeleteResponse deleteEstate(com.example.estate_grpc.proto.EstateDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEstateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EstateProtoService.
   */
  public static final class EstateProtoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EstateProtoServiceFutureStub> {
    private EstateProtoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EstateProtoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EstateProtoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.estate_grpc.proto.EstateInfoResponse> findEstateInfo(
        com.example.estate_grpc.proto.EstateIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindEstateInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.estate_grpc.proto.EstateAllResponse> getEstateAll(
        com.example.estate_grpc.proto.EstateAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEstateAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.estate_grpc.proto.EstateSaveResponse> saveEstate(
        com.example.estate_grpc.proto.EstateSaveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveEstateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.estate_grpc.proto.EstateUpdateResponse> updateEstate(
        com.example.estate_grpc.proto.EstateUpdateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEstateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.estate_grpc.proto.EstateDeleteResponse> deleteEstate(
        com.example.estate_grpc.proto.EstateDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEstateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_ESTATE_INFO = 0;
  private static final int METHODID_GET_ESTATE_ALL = 1;
  private static final int METHODID_SAVE_ESTATE = 2;
  private static final int METHODID_UPDATE_ESTATE = 3;
  private static final int METHODID_DELETE_ESTATE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_ESTATE_INFO:
          serviceImpl.findEstateInfo((com.example.estate_grpc.proto.EstateIdRequest) request,
              (io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateInfoResponse>) responseObserver);
          break;
        case METHODID_GET_ESTATE_ALL:
          serviceImpl.getEstateAll((com.example.estate_grpc.proto.EstateAllRequest) request,
              (io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateAllResponse>) responseObserver);
          break;
        case METHODID_SAVE_ESTATE:
          serviceImpl.saveEstate((com.example.estate_grpc.proto.EstateSaveRequest) request,
              (io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateSaveResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ESTATE:
          serviceImpl.updateEstate((com.example.estate_grpc.proto.EstateUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateUpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE_ESTATE:
          serviceImpl.deleteEstate((com.example.estate_grpc.proto.EstateDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.example.estate_grpc.proto.EstateDeleteResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFindEstateInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.estate_grpc.proto.EstateIdRequest,
              com.example.estate_grpc.proto.EstateInfoResponse>(
                service, METHODID_FIND_ESTATE_INFO)))
        .addMethod(
          getGetEstateAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.estate_grpc.proto.EstateAllRequest,
              com.example.estate_grpc.proto.EstateAllResponse>(
                service, METHODID_GET_ESTATE_ALL)))
        .addMethod(
          getSaveEstateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.estate_grpc.proto.EstateSaveRequest,
              com.example.estate_grpc.proto.EstateSaveResponse>(
                service, METHODID_SAVE_ESTATE)))
        .addMethod(
          getUpdateEstateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.estate_grpc.proto.EstateUpdateRequest,
              com.example.estate_grpc.proto.EstateUpdateResponse>(
                service, METHODID_UPDATE_ESTATE)))
        .addMethod(
          getDeleteEstateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.estate_grpc.proto.EstateDeleteRequest,
              com.example.estate_grpc.proto.EstateDeleteResponse>(
                service, METHODID_DELETE_ESTATE)))
        .build();
  }

  private static abstract class EstateProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EstateProtoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.estate_grpc.proto.EstateProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EstateProtoService");
    }
  }

  private static final class EstateProtoServiceFileDescriptorSupplier
      extends EstateProtoServiceBaseDescriptorSupplier {
    EstateProtoServiceFileDescriptorSupplier() {}
  }

  private static final class EstateProtoServiceMethodDescriptorSupplier
      extends EstateProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EstateProtoServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EstateProtoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EstateProtoServiceFileDescriptorSupplier())
              .addMethod(getFindEstateInfoMethod())
              .addMethod(getGetEstateAllMethod())
              .addMethod(getSaveEstateMethod())
              .addMethod(getUpdateEstateMethod())
              .addMethod(getDeleteEstateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
