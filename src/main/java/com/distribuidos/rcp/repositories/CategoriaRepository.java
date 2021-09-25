package com.distribuidos.rcp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.distribuidos.rcp.model.CategoriaModel;

import java.io.Serializable;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Serializable> {

    public abstract CategoriaModel findById(Long id);
    
    public abstract CategoriaModel findByNombre(String nombre);

}
