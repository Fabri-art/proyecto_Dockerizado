package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Envio;

import java.util.List;

public interface EnvioService {
    Envio crearEnvio(Envio envio);
    List<Envio> obtenerTodosLosEnvios();
    List<Envio> obtenerEnviosPorClienteId(Long clienteId);
    void eliminarEnvio(Long id);
}
