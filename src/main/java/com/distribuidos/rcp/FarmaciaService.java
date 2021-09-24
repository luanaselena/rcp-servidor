package com.distribuidos.rcp;
import java.util.stream.IntStream;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.distribuidos.rcp.model.CategoriaModel;
import com.distribuidos.rcp.model.MedicamentoModel;
import com.distribuidos.rcp.repositories.CategoriaRepository;
import com.distribuidos.rcp.repositories.MedicamentoRepository;

import io.grpc.stub.StreamObserver;

@GRpcService
public class FarmaciaService extends farmaciaGrpc.farmaciaImplBase {

    @Autowired
    @Qualifier("medicamentoRepository")
    private MedicamentoRepository medicamentoRepository;

    @Autowired
    @Qualifier("categoriaRepository")
    private CategoriaRepository categoriaRepository;

    @Override
    public void alta(Farmacia.AltaRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {
    	CategoriaModel categoria = categoriaRepository.findById(1l).get();
    	
    	MedicamentoModel medicamento = new MedicamentoModel("asd", "asd", "asd", categoria);
    	
    	System.out.println(medicamentoRepository.save(medicamento));
    	
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
    public void bajaTipo(Farmacia.BajaTipoRequest request, StreamObserver<Farmacia.APIResponse> responseObserver) {
        String id = request.getId();
        String baja = request.getBaja();


        //se efectua la baja logica en la base

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
        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        //response.setResponseCode("1").setResponseMessage("[\"Actron Ibuprofeno Capsulas blandas\",\"Actron Ibuprofeno Comprimidos\",\"Rivotril Clonazepam Comprimidos\",\"Ibuevanol Ibuprofeno Capsulas blandas\",\"Laxamin Bisacodilo Comprimidos\",\"Ketorolac Sinalgico Capsulas blandas\",\"Tafirol Paracetamol Capsulas blandas\",\"Omeprasec Omeprazol Capsulas blandas\",\"Desinflamasol Ibuprofeno Crema\"]");
        response.setResponseCode("1").setResponseMessage("[{'codigo':'AIC-23142-4', 'nombre':'Actron', 'droga':'Ibuprofeno', 'tipo': 'Capsulas blandas'}, {'codigo':'AIC-42182-8', 'nombre':'Actron', 'droga':'Ibuprofeno', 'tipo': 'Comprimidos'}, {'codigo':'RCC-74512-1', 'nombre':'Rivotril', 'droga':'Clonazepam', 'tipo': 'Comprimidos'}, {'codigo':'IIC-58403-2', 'nombre':'Ibuevanol', 'droga':'Ibuprofeno', 'tipo': 'Capsulas blandas'}, {'codigo':'LBC-49320-9', 'nombre':'Laxamin', 'droga':'Bisacodilo', 'tipo': 'Comprimidos'}, {'codigo':'KSC-92325-3', 'nombre':'Ketorolac', 'droga':'Sinalgico', 'tipo': 'Capsulas blandas'}, {'codigo':'TPC-32473-1', 'nombre':'Tafirol', 'droga':'Paracetamol', 'tipo': 'Capsulas blandas'}, {'codigo':'OOC-08123-5', 'nombre':'Omeprasec', 'droga':'Omeprazol', 'tipo': 'Capsulas blandas'}, {'codigo':'DIC-51325-7', 'nombre':'Desinflamasol', 'droga':'Ibuprofeno', 'tipo': 'Crema'}]");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void listadoCodigos(Farmacia.ListadoCodigos request, StreamObserver<Farmacia.APIResponse> responseObserver){
        Farmacia.APIResponse.Builder response = Farmacia.APIResponse.newBuilder();
        response.setResponseCode("1").setResponseMessage("[\"AIC-23142-4\",\"AIC-42182-8\",\"RCC-74512-1\",\"IIC-58403-2\",\"LBC-49320-9\",\"KSC-92325-3\",\"TPC-32473-1\",\"OOC-08123-5\",\"DIC-51325-7\"]");
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
