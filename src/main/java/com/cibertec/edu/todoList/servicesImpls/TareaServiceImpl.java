/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.todoList.servicesImpls;

import com.cibertec.edu.todoList.models.Tarea;
import com.cibertec.edu.todoList.repositories.ITareaRepository;
import com.cibertec.edu.todoList.services.ITareaService;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TareaServiceImpl implements ITareaService {
    private final ITareaRepository _repository;

    @Override
    public List<Tarea> listarTarea() {
        return _repository.findAll();
    }

    @Override
    public Tarea crearTarea(Tarea tarea) {
        return _repository.save(tarea);
    }

    @Override
    public Tarea obtenerTarea(Long id) {
        return _repository.findById(id).orElse(null);
    }

    @Override
    public Tarea editarTarea(Long id, Tarea tarea) {
        return _repository.findById(id).map(u -> {
            u.setNombre(tarea.getNombre());
            u.setPrioridad(tarea.getPrioridad());
            u.setCompletada(false);
            return _repository.save(u);
        }).orElse(null);
    }

    @Override
    public boolean eliminarTarea(Long id) {
        Optional<Tarea> tarea = _repository.findById(id);
        if (tarea.isPresent()) {
            _repository.delete(tarea.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean TareaSemanaCompletada(Long id) {
        return _repository.findById(id).map(t -> {
            t.setCompletada(true);
            _repository.save(t);
            return true;
        }).orElse(false);
    }
}
