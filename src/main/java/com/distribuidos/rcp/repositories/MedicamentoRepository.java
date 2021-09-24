package com.distribuidos.rcp.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.distribuidos.rcp.model.MedicamentoModel;

@Repository
public interface MedicamentoRepository extends JpaRepository<MedicamentoModel, Serializable> {

    public abstract MedicamentoModel findById(Integer id);
    
    @Query(nativeQuery = true, value = "SELECT * FROM medicamento WHERE fk_categoria IN (SELECT id FROM categoria WHERE nombre = :filtro)")
    public abstract List<MedicamentoModel> findByType(String filtro);
    
    @Query(nativeQuery = true, value = "SELECT * FROM medicamento WHERE nombre LIKE :filtro%")
    public abstract List<MedicamentoModel> findByFirstLetter(String filtro);
	
}
