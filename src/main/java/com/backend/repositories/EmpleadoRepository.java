package com.backend.repositories;

import com.backend.models.EmpleadoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpleadoRepository extends CrudRepository<EmpleadoModel, Long>{
    
}
