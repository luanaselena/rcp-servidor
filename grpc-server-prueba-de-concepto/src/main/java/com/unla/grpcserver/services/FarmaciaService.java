package com.unla.grpcserver.services;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.distribuidos.rcp.Farmacia;
import com.distribuidos.rcp.farmaciaGrpc;

import io.grpc.stub.StreamObserver;

@GRpcService
public class FarmaciaService extends farmaciaGrpc.farmaciaImplBase{
	
	@Autowired
	MedicamentoRepository medicamentoRepository;
	
	@Override
    public void alta(Farmacia.AltaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {    	
    	System.out.print("asd");
    	System.out.print(medicamentoRepository.count());

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("0").setResponseMessage("OK");

        //aca se envia la respuesta
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }		
}
