package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Stock;

import java.util.List;

public interface StockService {
    Stock crearStock(Stock stock);
    List<Stock> obtenerTodosLosStocks();
    List<Stock> obtenerStockPorProductoId(Long productoId);
    void eliminarStock(Long id);
}
