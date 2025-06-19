package com.ChinoMarket.pe.proyecto_crud.controllers;

import com.ChinoMarket.pe.proyecto_crud.entities.Stock;
import com.ChinoMarket.pe.proyecto_crud.services.StockService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "stock")
public class StockController {

    @Autowired
    private StockService stockService;

    // Crear o actualizar stock (según existencia)
    @PostMapping
    public ResponseEntity<Stock> crearOActualizarStock(@RequestBody Stock stock) {
        Stock creado = stockService.crearStock(stock);
        return ResponseEntity.ok(creado);
    }

    // Obtener todos los stocks
    @GetMapping
    public ResponseEntity<List<Stock>> obtenerTodos() {
        List<Stock> stocks = stockService.obtenerTodosLosStocks();
        return ResponseEntity.ok(stocks);
    }

    // Obtener stock por ID de producto
    @GetMapping("/producto/{idPro}")
    public ResponseEntity<List<Stock>> obtenerPorProducto(@PathVariable("idPro") Long idPro) {
        List<Stock> stocks = stockService.obtenerStockPorProductoId(idPro);
        if (stocks.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(stocks);
    }

    // Eliminar un stock por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarStock(@PathVariable Long id) {
        stockService.eliminarStock(id);
        return ResponseEntity.noContent().build();
    }
}