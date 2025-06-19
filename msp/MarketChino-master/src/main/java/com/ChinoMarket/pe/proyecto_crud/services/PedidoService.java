package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Pedido;

import java.util.List;

public interface PedidoService {
    Pedido save(Pedido pedido);
    List<Pedido> obtenerTodosLosPedidos();
    List<Pedido> obtenerPedidosPorClienteId(Long clienteId);
    Pedido obtenerPedidoPorId(Long id);
    List<Pedido> obtenerPedidosPorEstado(String estado);
    void eliminarPedido(Long id);
}
