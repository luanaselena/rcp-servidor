package com.distribuidos.rcp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.distribuidos.rcp.model.Medicamento;

@Repository
public interface MedicamentoRepository extends CrudRepository<Medicamento, Long> {
	
}
