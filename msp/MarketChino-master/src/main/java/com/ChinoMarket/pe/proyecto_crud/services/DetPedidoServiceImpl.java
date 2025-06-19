package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.DetPedido;
import com.ChinoMarket.pe.proyecto_crud.repository.DetPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetPedidoServiceImpl implements DetPedidoService {

    @Autowired
    private DetPedidoRepository detPedidoRepository;

    @Override
    public DetPedido crearDetPedido(DetPedido detPedido) {
        return detPedidoRepository.save(detPedido);
    }

    @Override
    public List<DetPedido> obtenerTodosLosDetPedidos() {
        return detPedidoRepository.findAll();
    }

    @Override
    public List<DetPedido> obtenerDetPedidoPorPedidoId(Long pedidoIdP) {
        return detPedidoRepository.findByPedidoIdP(pedidoIdP);
    }

    @Override
    public void eliminarDetPedido(Long id) {
        detPedidoRepository.deleteById(id);
    }
}
