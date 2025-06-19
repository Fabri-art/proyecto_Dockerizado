package com.ChinoMarket.pe.proyecto_crud.entities;


import jakarta.persistence.*;

@Entity
public class UnidadesMedida {
    @Id
    @GeneratedValue
    private Long idUnidades;
    private String nombre;
    private String simbolo;

    public Long getIdUnidades() {
        return idUnidades;
    }

    public void setIdUnidades(Long idUnidades) {
        this.idUnidades = idUnidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }
}
