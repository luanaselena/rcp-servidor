package com.distribuidos.rcp;
import com.distribuidos.rcp.model.CategoriaModel;
import com.distribuidos.rcp.repositories.CategoriaRepository;
import com.distribuidos.rcp.repositories.MedicamentoRepository;
import com.distribuidos.rcp.model.MedicamentoModel;
import com.google.protobuf.UnknownFieldSet;
import io.grpc.stub.StreamObserver;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

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
        MedicamentoModel medicamentoModel = medicamentoRepository.save(new MedicamentoModel(nombre,codigo,droga));

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("0").setResponseMessage("Medicamento dado de alta");

        //aca se envia la respuesta
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void baja(Farmacia.BajaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {
        String id = request.getId();

        MedicamentoModel medicamentoModel = medicamentoRepository.findById(Integer.valueOf(id));
        medicamentoModel.setBaja(true);

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
        CategoriaModel categoriaModel = categoriaRepository.save(new CategoriaModel(Integer.valueOf(id),nombre));

        //se envia la respuesta al servidor
        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("0").setResponseMessage("Nuevo Tipo de medicamento dado de alta");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void bajaTipo(Farmacia.BajaTipoRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {
        String id = request.getId();
        String baja = request.getBaja();


        CategoriaModel categoria = categoriaRepository.findById(Long.valueOf(id));
        categoria.setBaja(true);

        //se envia la respuesta al servidor
        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("1").setResponseMessage("Se efectuo la baja del tipo de medicamento");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void busquedaPorPalabra(Farmacia.BusquedaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver){
        String buscar = request.getBuscar();
        String filtro = request.getFiltro();
        String columna = request.getColumna();

        //se aplican los 3 parametros para la busqueda

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("2").setResponseMessage("Lista de medicamentos con PALABRA o LETRA");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void digitoVerificador(Farmacia.DigitoVerificadorRequest request, StreamObserver<Farmacia.APIResponse> responseObserver){
        String digito = request.getDigito();
        
        String[] partes = digito.split("-");
        String codAlfabetico = partes[0];
        String codNumerico = partes[1];
        String digVerificador = partes[2];

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        
        
        if(codAlfabetico.substring(0, 1).equals("P")){
        	System.out.print("P");
            if(verificar(codNumerico, digVerificador)){
                response.setResponseCode("1").setResponseMessage("esPrioritario(codigo) = TRUE | verificar(codigo) = TRUE");
            }
            else{
                response.setResponseCode("2").setResponseMessage("esPrioritario(codigo) = TRUE | verificar(codigo) = FALSE");
            }
        } else if(codAlfabetico.substring(0, 1).equals("W")){
        	System.out.print("W");
            if(verificar(codNumerico, digVerificador)){
            	System.out.print("1");
                response.setResponseCode("1").setResponseMessage("esPrioritario(codigo) = TRUE | verificar(codigo) = TRUE");
            }
            else{
            	System.out.print("2");
                response.setResponseCode("2").setResponseMessage("esPrioritario(codigo) = TRUE | verificar(codigo) = FALSE");
            }
        } else {
        	
            if(verificar(codNumerico, digVerificador)){
                response.setResponseCode("3").setResponseMessage("esPrioritario(codigo) = FALSE | verificar(codigo) = TRUE");
            }
            else{
                response.setResponseCode("4").setResponseMessage("esPrioritario(codigo) = FALSE | verificar(codigo) = FALSE");
            }
        }
       

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
        
        System.out.print(response);
    }

    private boolean verificar(String codNumerico, String digVerificador){

        // convirtiendo el codNumerico en un array de numeros

        int[] num = new int[codNumerico.length()];

        for (int i = 0; i < codNumerico.length(); i++){
            num[i] = codNumerico.charAt(i) - '0';
        }

        //se suman todos los numeros del codigo numerico
        int sum = IntStream.of(num).sum();

        if(sum == Integer.parseInt(digVerificador)){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void listadoMedicamentos(Farmacia.ListadoMedicamentos request, StreamObserver<Farmacia.APIResponse> responseObserver){

        List<String> nombresMedicamento = new ArrayList<>();
        for (MedicamentoModel medicamentoModel : medicamentoRepository.findAll()){
            nombresMedicamento.add(medicamentoModel.getNombre());
        }

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("1").setResponseMessage("");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void listadoCodigos(Farmacia.ListadoCodigos request, StreamObserver<Farmacia.APIResponse> responseObserver){

        List<String> nombresCategorias = new ArrayList<>();
        for (CategoriaModel categoriaModel : categoriaRepository.findAll()){
            nombresCategorias.add(categoriaModel.getNombre());
        }

        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("1").setResponseMessage("");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
