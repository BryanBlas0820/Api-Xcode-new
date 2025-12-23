/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.todoList.servicesImpls;

import com.cibertec.edu.todoList.models.Categoria;
import com.cibertec.edu.todoList.repositories.ICategoriaRepository;
import com.cibertec.edu.todoList.services.ICategoriaService;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoriaServiceImpl implements ICategoriaService{
    private final ICategoriaRepository _repository;

    @Override
    public List<Categoria> listarCategorias() {
        return _repository.findAll();
    }

    @Override
    public Categoria crearCategoria(Categoria categoria) {
        return _repository.save(categoria);
    }

    @Override
    public Categoria obtenerCategoria(Long id) {
        return _repository.findById(id).orElse(null);
    }

    @Override
    public boolean eliminarCategoria(Long id) {
        Optional<Categoria> categoria = _repository.findById(id);
        if (categoria.isPresent()) {
            _repository.delete(categoria.get());
            return true;
        }
        return false;
    }
    
    
}
