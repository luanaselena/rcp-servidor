package com.distribuidos.rcp;

import com.distribuidos.rcp.Farmacia;
import com.distribuidos.rcp.farmaciaGrpc;
import io.grpc.stub.StreamObserver;

public class FarmaciaService extends farmaciaGrpc.farmaciaImplBase {

    @Override
    public void alta(Farmacia.AltaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {
        System.out.println("alta");
        String id = request.getId();
        String nombreMedicamento = request.getNombreMedicamento();

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        if(nombreMedicamento.equals(id)) {
            response.setResponseCode("0").setResponseMessage("OK");
        }
        else{
            response.setResponseCode("1").setResponseMessage("NO OK");
        }

        //aca se envia la respuesta
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void baja(Farmacia.BajaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {

    }
}
