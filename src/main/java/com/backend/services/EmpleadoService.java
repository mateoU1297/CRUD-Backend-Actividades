package com.backend.services;

import com.backend.models.EmpleadoModel;
import com.backend.repositories.EmpleadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public Iterable<EmpleadoModel> getEmpleados(){
        return this.empleadoRepository.findAll();
    }

}
