package com.backend.models;

import javax.persistence.*;

@Entity
@Table(name = "actividades")
public class ActividadModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name="nombre", nullable = false)
    private String nombre;

    @Column(name="descripcion", nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private String estado;

    @Column(name="fecha_ejecucion", nullable = false)
    private String fechaEjecucion;

    @OneToOne()
    @JoinColumn(name="id_empleado", nullable = false, referencedColumnName = "id", insertable = false, updatable = false)
    private EmpleadoModel empleado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaEjecucion() {
        return fechaEjecucion;
    }

    public void setFechaEjecucion(String fechaEjecucion) {
        this.fechaEjecucion = fechaEjecucion;
    }

    public EmpleadoModel getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(EmpleadoModel empleadoModel) {
        this.empleado = empleadoModel;
    }
    
}
