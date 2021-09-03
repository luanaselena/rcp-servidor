package com.distribuidos.rcp;

import com.distribuidos.rcp.Farmacia;
import com.distribuidos.rcp.farmaciaGrpc;
import io.grpc.stub.StreamObserver;

public class FarmaciaService extends farmaciaGrpc.farmaciaImplBase {

    @Override
    public void alta(Farmacia.AltaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {
        System.out.println("alta");
        String id = request.getId();
        String nombre = request.getNombre();
        String codigo = request.getCodigo();
        String droga = request.getDroga();
        String tipo = request.getTipo();

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        if(nombre.equals(id)) {
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
