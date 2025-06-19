package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Stock;
import com.ChinoMarket.pe.proyecto_crud.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public Stock crearStock(Stock stock) {
        List<Stock> existentes = stockRepository.findByProductoIdPro(stock.getProducto().getIdPro());

        if (!existentes.isEmpty()) {
            Stock existente = existentes.get(0);
            existente.setEntradas(stock.getEntradas() != null ? stock.getEntradas() : existente.getEntradas());
            existente.setSalidas(stock.getSalidas());
            existente.setBalance(stock.getBalance());

            return stockRepository.save(existente);
        } else {
            if (stock.getEntradas() == null) stock.setEntradas(0);
            if (stock.getSalidas() == null) stock.setSalidas(0);
            stock.setBalance(stock.getEntradas() - stock.getSalidas());

            return stockRepository.save(stock);
        }
    }
    @Override
    public List<Stock> obtenerTodosLosStocks() {
        return stockRepository.findAll();
    }

    @Override
    public List<Stock> obtenerStockPorProductoId(Long productoIdPro) {
        return stockRepository.findByProductoIdPro(productoIdPro);
    }

    @Override
    public void eliminarStock(Long id) {
        stockRepository.deleteById(id);
    }
}
