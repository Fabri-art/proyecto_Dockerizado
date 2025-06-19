package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Producto;

import java.util.List;

public interface ProductoService {
    Producto crearProducto(Producto producto);
    List<Producto> obtenerTodosLosProductos();
    Producto obtenerProductoPorId(Long id);
    Producto obtenerProductoPorNombre(String nombre);
    void eliminarProducto(Long id);
    Producto update(Long idPro, Producto productoActualizado);
}
