package com.ChinoMarket.pe.proyecto_crud.repository;

import com.ChinoMarket.pe.proyecto_crud.entities.DetPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface DetPedidoRepository extends JpaRepository<DetPedido, Long> {
    List<DetPedido> findByPedidoIdP(Long idP);
}
