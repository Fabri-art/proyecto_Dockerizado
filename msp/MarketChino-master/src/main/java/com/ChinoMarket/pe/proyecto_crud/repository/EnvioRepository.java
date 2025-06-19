package com.ChinoMarket.pe.proyecto_crud.repository;

import com.ChinoMarket.pe.proyecto_crud.entities.Envio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;



public interface EnvioRepository extends JpaRepository<Envio, Long> {
    List<Envio> findByCliente_IdC(Long clienteId);
}
