package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Envio;
import com.ChinoMarket.pe.proyecto_crud.repository.EnvioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvioServiceImpl implements EnvioService {

    @Autowired
    private EnvioRepository envioRepository;

    @Override
    public Envio crearEnvio(Envio envio) {
        return envioRepository.save(envio);
    }

    @Override
    public List<Envio> obtenerTodosLosEnvios() {
        return envioRepository.findAll();
    }

    @Override
    public List<Envio> obtenerEnviosPorClienteId(Long clienteIdC) {
        return envioRepository.findByCliente_IdC(clienteIdC);
    }

    @Override
    public void eliminarEnvio(Long id) {
        envioRepository.deleteById(id);
    }
}
