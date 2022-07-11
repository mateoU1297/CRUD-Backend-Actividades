package com.backend.repositories;

import com.backend.models.ActividadModel;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ActividadRepository extends CrudRepository<ActividadModel, Long>{
    
    @Query(value = "SELECT * FROM empleados e WHERE e.nombre LIKE CONCAT('%',LOWER(:nombre),'%');", nativeQuery = true)
    Iterable<ActividadModel> findByName(String nombre);
}