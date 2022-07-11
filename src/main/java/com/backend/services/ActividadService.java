package com.backend.services;

import com.backend.models.ActividadModel;
import com.backend.repositories.ActividadRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ActividadService {
    @Autowired
    ActividadRepository actividadRepository;

    public Iterable<ActividadModel> getActividades(){
        return this.actividadRepository.findAll();
    }

    public ActividadModel addActividad(ActividadModel actividad){
        return this.actividadRepository.save(actividad);
    }

    public boolean deleteActividad(Long id){
        try{
            this.actividadRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

    public Iterable<ActividadModel> findByName(String nombre){
        return this.actividadRepository.findByName(nombre);
    }

}
