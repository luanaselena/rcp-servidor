package com.distribuidos.rcp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.distribuidos.rcp.services.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria, Long> {

}
