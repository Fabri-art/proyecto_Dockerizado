package com.ChinoMarket.pe.proyecto_crud.controllers;

import com.ChinoMarket.pe.proyecto_crud.entities.Categoria;
import com.ChinoMarket.pe.proyecto_crud.services.CategoriaService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "categoria")
@Tag(name = "CATEGORIAS")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    // Crear categoría (POST)
    @PostMapping
    public ResponseEntity<Categoria> createCategoria(@RequestBody Categoria categoria) {
        Categoria nuevaCategoria = categoriaService.crearCategoria(categoria);
        return new ResponseEntity<>(nuevaCategoria, HttpStatus.CREATED);
    }

    // Obtener categoría por ID (GET)
    @GetMapping("/{idCat}")
    public ResponseEntity<Categoria> getCategoriaById(@PathVariable Long idCat) {
        Categoria categoria = categoriaService.obtenerCategoriaPorId(idCat);
        return new ResponseEntity<>(categoria, HttpStatus.OK);
    }

    // Obtener todas las categorías (GET)
    @GetMapping
    public ResponseEntity<List<Categoria>> getAllCategorias() {
        List<Categoria> categorias = categoriaService.obtenerTodasLasCategorias();
        return new ResponseEntity<>(categorias, HttpStatus.OK);
    }

    // Actualizar categoría (PUT)
    @PutMapping("/{idCat}")
    public ResponseEntity<Categoria> updateCategoria(@PathVariable Long idCat, @RequestBody Categoria categoriaActualizada) {
        Categoria categoria = categoriaService.actualizarCategoria(idCat, categoriaActualizada);
        if (categoria != null) {
            return new ResponseEntity<>(categoria, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Eliminar categoría (DELETE)
    @DeleteMapping("/{idCat}")
    public ResponseEntity<Void> deleteCategoria(@PathVariable Long idCat) {
        categoriaService.eliminarCategoria(idCat);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}