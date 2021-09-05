package com.distribuidos.rcp;

import com.distribuidos.rcp.Farmacia;
import com.distribuidos.rcp.farmaciaGrpc;
import com.distribuidos.rcp.model.MedicamentoModel;
import io.grpc.stub.StreamObserver;

public class FarmaciaService extends farmaciaGrpc.farmaciaImplBase {

    @Override
    public void alta(Farmacia.AltaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {

        String nombre = request.getNombre();
        String codigo = request.getCodigo();
        String droga = request.getDroga();
        String tipo = request.getTipo();

        new MedicamentoModel(nombre,codigo,droga);

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("0").setResponseMessage("OK");

        //aca se envia la respuesta
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void baja(Farmacia.BajaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {

    }
}
