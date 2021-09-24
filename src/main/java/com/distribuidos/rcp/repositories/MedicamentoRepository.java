package com.distribuidos.rcp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.distribuidos.rcp.model.MedicamentoModel;

import java.io.Serializable;

@Repository
public interface MedicamentoRepository extends JpaRepository<MedicamentoModel, Serializable> {

    public abstract MedicamentoModel findById(Integer id);
	
}
