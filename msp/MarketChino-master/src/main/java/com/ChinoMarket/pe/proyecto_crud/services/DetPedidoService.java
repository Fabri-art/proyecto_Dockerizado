package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.DetPedido;

import java.util.List;

public interface DetPedidoService {
    DetPedido crearDetPedido(DetPedido detPedido);
    List<DetPedido> obtenerTodosLosDetPedidos();
    List<DetPedido> obtenerDetPedidoPorPedidoId(Long pedidoId);
    void eliminarDetPedido(Long id);
}
