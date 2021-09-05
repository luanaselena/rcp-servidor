package com.distribuidos.rcp.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.distribuidos.rcp.repositories.CategoriaRepository;
import com.distribuidos.rcp.services.categoriaGrpc.categoriaImplBase;

import io.grpc.stub.StreamObserver;

public class CategoriaServices extends categoriaImplBase {
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Override 
	public void alta(Categoria.AltaRequest request,
			StreamObserver<Categoria.APIResponse> responseObserver) {
			
		//Categoria categoria = new Categoria(1L,request.getNombre(),false) ; TEST
        //categoriaRepository.save(categoria);
	}
	  
		
	@Override public void baja(Categoria.BajaRequest request,
			StreamObserver<Categoria.APIResponse> responseObserver) {
			
	    
		  
	}
		 
	 
}
