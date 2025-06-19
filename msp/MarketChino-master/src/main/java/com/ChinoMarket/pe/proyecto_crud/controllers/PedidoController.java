package com.ChinoMarket.pe.proyecto_crud.controllers;

import com.ChinoMarket.pe.proyecto_crud.entities.DetPedido;
import com.ChinoMarket.pe.proyecto_crud.entities.Pedido;
import com.ChinoMarket.pe.proyecto_crud.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/crearpedido")
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        List<DetPedido> detalles = pedido.getDetallesPedido();
        if (detalles != null) {
            for (DetPedido detalle : detalles) { //si la venta no se realiza, generar error
                detalle.setPedido(pedido);
            }
        }
        return pedidoService.save(pedido);
    }

    @GetMapping
    public List<Pedido> obtenerTodosLosPedidos() {
        return pedidoService.obtenerTodosLosPedidos();
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Pedido> obtenerPedidosPorClienteId(@PathVariable Long clienteId) {
        return pedidoService.obtenerPedidosPorClienteId(clienteId);
    }

    @GetMapping("/{id}")
    public Pedido obtenerPedidoPorId(@PathVariable Long id) {
        return pedidoService.obtenerPedidoPorId(id);
    }

    @GetMapping("/estado/{estado}")
    public List<Pedido> obtenerPedidosPorEstado(@PathVariable String estado) {
        return pedidoService.obtenerPedidosPorEstado(estado);
    }

    @DeleteMapping("/{id}")
    public void eliminarPedido(@PathVariable Long id) {
        pedidoService.eliminarPedido(id);
    }
}
