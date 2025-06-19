package com.ChinoMarket.pe.proyecto_crud.controllers;


import com.ChinoMarket.pe.proyecto_crud.entities.Cliente;
import com.ChinoMarket.pe.proyecto_crud.services.ClienteService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "cliente")
@Tag(name = "CLIENTES")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente nuevoCliente = clienteService.create(cliente);
        return new ResponseEntity<>(nuevoCliente, HttpStatus.CREATED);
    }

    @GetMapping("/{idC}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long idC) {
        Cliente cliente = clienteService.readById(idC);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAllClientes() {
        List<Cliente> clientes = clienteService.readAll();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }

    @PutMapping("/{idC}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long idC, @RequestBody Cliente clienteActualizado) {
        try {
            Cliente cliente = clienteService.update(idC, clienteActualizado);
            if (cliente != null) {
                return new ResponseEntity<>(cliente, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }

    @DeleteMapping("/{idC}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long idC) {
        clienteService.delete(idC);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}