package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente create(Cliente cliente);
    Cliente readById(Long idC);
    List<Cliente> readAll();
    Cliente update(Long idC, Cliente clienteActualizado);
    void delete(Long idC);
}
