package com.distribuidos.rcp;
import com.distribuidos.rcp.repositories.CategoriaRepository;
import com.distribuidos.rcp.repositories.MedicamentoRepository;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FarmaciaService extends farmaciaGrpc.farmaciaImplBase {

    @Autowired
    @Qualifier("medicamentoRepository")
    private MedicamentoRepository medicamentoRepository;

    @Autowired
    @Qualifier("categoriaRepository")
    private CategoriaRepository categoriaRepository;

    @Override
    public void alta(Farmacia.AltaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {
        String id = request.getId();
        String nombre = request.getNombre();
        String codigo = request.getCodigo();
        String droga = request.getDroga();
        String tipo = request.getTipo();

        //se guarda el dato que se recibe en la base de datos
        //MedicamentoModel medicamentoModel = medicamentoRepository.save(new MedicamentoModel(Integer.valueOf(id), nombre,codigo,droga));

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("0").setResponseMessage("Medicamento dado de alta");

        //aca se envia la respuesta
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void baja(Farmacia.BajaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {
        String id = request.getId();

        //se busca el medicamento con ese id y se da de baja
        //medicamentoRepository.delete();

        //se envia la respuesta al servidor
        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("1").setResponseMessage("Se efectuo la baja del medicamento");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void altaTipo(Farmacia.AltaTipoRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {
        String id = request.getId();
        String nombre = request.getNombre();

        //se da de alta el tipo en la base de datos
        //CategoriaModel categoriaModel = categoriaRepository.save(new CategoriaModel(Integer.valueOf(id),nombre));

        //se envia la respuesta al servidor
        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("0").setResponseMessage("Nuevo Tipo de medicamento dado de alta");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void busquedaPorPalabra(Farmacia.BusquedaPorPalabraRequest request, StreamObserver<Farmacia.APIResponse> responseObserver){
        String palabra = request.getPalabra();

        //se filtraria por el nombre de tipo

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("2").setResponseMessage("Lista de medicamentos con palabra AEROSOL");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void busquedaPorLetra(Farmacia.BusquedaPorLetraRequest request, StreamObserver<Farmacia.APIResponse> responseObserver){
        String letra = request.getLetra();

        //se filtrarian los medicamentos por nombres empezados por la letra correspondiente

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("2").setResponseMessage("Lista de medicamentos cuyo nombre comience con letra A");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
