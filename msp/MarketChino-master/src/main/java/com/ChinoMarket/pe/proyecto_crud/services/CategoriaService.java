package com.ChinoMarket.pe.proyecto_crud.services;

import com.ChinoMarket.pe.proyecto_crud.entities.Categoria;

import java.util.List;

public interface CategoriaService {
    Categoria crearCategoria(Categoria categoria);
    List<Categoria> obtenerTodasLasCategorias();
    Categoria obtenerCategoriaPorId(Long id);
    Categoria obtenerCategoriaPorNombre(String nombre);
    void eliminarCategoria(Long id);

    Categoria actualizarCategoria(Long idCat, Categoria categoriaActualizada);
}
