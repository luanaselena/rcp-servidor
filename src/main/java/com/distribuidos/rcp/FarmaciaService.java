package com.distribuidos.rcp;

import com.distribuidos.rcp.Farmacia;
import com.distribuidos.rcp.farmaciaGrpc;
import com.distribuidos.rcp.mapper.MedicamentoMapper;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class FarmaciaService extends farmaciaGrpc.farmaciaImplBase {

    @Autowired
    IMedicamentoRepository medicamentoRepository;

    MedicamentoMapper medMap = new MedicamentoMapper();

    @Override
    public void alta(MedicamentoDTO request, StreamObserver<Farmacia.APIResponse> responseObserver) {
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

        medicamentoRepository.save(medMap.toModel(request));

        //aca se envia la respuesta
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void baja(Farmacia.BajaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {

    }

    public void getList(Empty request, StreamObserver<MedicamentoListResponse> responseObserver){
        List<MedicamentoModel> lstMedicamentos = medicamentoRepository.findAll();
        MedicamentoListResponse medResp = MedicamentoListResponse.newBuilder()
                .addAllMedicamentos(lstMedicamentos.stream().map(x -> medMap.toDTO(x))
                .collect(Collectors.toList())).build();
        responseObserver.onNext(cr);
        responseObserver.onCompleted();
    }

}
