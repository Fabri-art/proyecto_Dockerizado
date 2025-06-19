package com.ChinoMarket.pe.proyecto_crud.repository;

import com.ChinoMarket.pe.proyecto_crud.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByCliente_IdC(Long clienteId);
    List<Pedido> findByEstado(String estado);
    Pedido findTopByOrderByIdPDesc();

}
