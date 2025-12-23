/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cibertec.edu.todoList.services;

import com.cibertec.edu.todoList.models.Categoria;
import java.util.List;

/**
 *
 * @author Bryyann
 */
public interface ICategoriaService {
    
    List<Categoria> listarCategorias();
    Categoria crearCategoria(Categoria categoria);
    Categoria obtenerCategoria(Long id);
    boolean eliminarCategoria(Long id);
}
