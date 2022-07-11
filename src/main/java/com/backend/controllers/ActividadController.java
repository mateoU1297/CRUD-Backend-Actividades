package com.backend.controllers;

import com.backend.models.ActividadModel;
import com.backend.services.ActividadService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/actividad")
public class ActividadController {
    @Autowired
    ActividadService actividadService;

    @GetMapping("listar")
    public Iterable<ActividadModel> getActividades(){
        return this.actividadService.getActividades();
    }

    @PostMapping("create")
    public ActividadModel addActividad(@RequestBody ActividadModel actividad){
        return this.actividadService.addActividad(actividad);
    }

    @DeleteMapping( path = "delete/{id}")
    public boolean deleteActividad(@PathVariable("id") Long id){
        return this.actividadService.deleteActividad(id);
    }

    @GetMapping( path = "find-by-name/{nombre}")
    public Iterable<ActividadModel> findByName(@PathVariable("nombre") String nombre){
        return this.actividadService.findByName(nombre);
    }
}
