package com.distribuidos.rcp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.distribuidos.rcp.model.MedicamentoModel;

import java.util.List;

@Repository
public interface MedicamentoRepository extends CrudRepository<MedicamentoModel, Long> {

    List<MedicamentoModel> findAll();
	
}
