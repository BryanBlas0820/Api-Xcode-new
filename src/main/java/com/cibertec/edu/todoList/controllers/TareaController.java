/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.todoList.controllers;

import com.cibertec.edu.todoList.servicesImpls.TareaServiceImpl;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cibertec.edu.todoList.models.Tarea;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping("/api/tarea")
@RequiredArgsConstructor
public class TareaController {
    private final TareaServiceImpl _service;
    
    
    @GetMapping
    public List<Tarea> listarTareas() {
        return _service.listarTarea();
    }
    
    @GetMapping("/{id}")
    public Tarea obtenerTareaPorId(@PathVariable Long id) {
        return _service.obtenerTarea(id);
    }

    @GetMapping("/xUser/{id}")
    public List<Tarea> listarTareasPorUsuario(@PathVariable Long id) {
        return _service.listarTareasPorUsuario(id);
    }
    
    @PostMapping("/registrar")
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return _service.crearTarea(tarea);
    }
    
    @PutMapping("/{id}")
    public Tarea editarTarea(@RequestBody Tarea tarea, @PathVariable Long id) {
        return _service.editarTarea(id, tarea);
    }
    
    @DeleteMapping("/{id}")
    public Boolean eliminarTarea(@PathVariable Long id) {
        return _service.eliminarTarea(id);
    }
    
    @PutMapping("/Compleatado/{id}")
    public Boolean cambiarEstadoCompleatado(@PathVariable Long id) {
        return _service.TareaSemanaCompletada(id);
    }
}
