/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.todoList.controllers;

import com.cibertec.edu.todoList.servicesImpls.CategoriaServiceImpl;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cibertec.edu.todoList.models.Categoria;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/categoria")
@RequiredArgsConstructor
public class CategoriaController {
    private final CategoriaServiceImpl _service;
    
    @GetMapping
    public List<Categoria> ListarCategorias() {
        return _service.listarCategorias();
    }
    
    @GetMapping("/{id}")
    public Categoria obtenerCategoriaPorId(@PathVariable Long id) {
        return _service.obtenerCategoria(id);
    }
    
    @PostMapping("/registrar")
    public Categoria crearCategoria(@RequestBody Categoria categoria) {
        return _service.crearCategoria(categoria);
    }
    
    @DeleteMapping("/{id}")
    public Boolean eliminarCategoria(@PathVariable Long id) {
        return _service.eliminarCategoria(id);
    }
}
