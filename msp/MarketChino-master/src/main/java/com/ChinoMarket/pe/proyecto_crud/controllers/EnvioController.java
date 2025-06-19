package com.ChinoMarket.pe.proyecto_crud.controllers;

import com.ChinoMarket.pe.proyecto_crud.entities.Envio;
import com.ChinoMarket.pe.proyecto_crud.services.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/envios")
public class EnvioController {

    @Autowired
    private EnvioService envioService;

    @PostMapping
    public Envio crearEnvio(@RequestBody Envio envio) {
        return envioService.crearEnvio(envio);
    }

    @GetMapping
    public List<Envio> obtenerTodosLosEnvios() {
        return envioService.obtenerTodosLosEnvios();
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Envio> obtenerEnviosPorClienteId(@PathVariable Long clienteId) {
        return envioService.obtenerEnviosPorClienteId(clienteId);
    }

    @DeleteMapping("/{id}")
    public void eliminarEnvio(@PathVariable Long id) {
        envioService.eliminarEnvio(id);
    }
}
