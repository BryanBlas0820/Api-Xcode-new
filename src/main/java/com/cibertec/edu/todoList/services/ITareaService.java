/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cibertec.edu.todoList.services;

import com.cibertec.edu.todoList.models.Tarea;
import java.util.List;

/**
 *
 * @author Bryyann
 */
public interface ITareaService {
    
    List<Tarea> listarTarea();
    Tarea crearTarea(Tarea tarea);
    Tarea obtenerTarea(Long id);
    Tarea editarTarea(Long id, Tarea tarea);
    boolean eliminarTarea(Long id);
    boolean TareaSemanaCompletada(Long id);
    List<Tarea> listarTareaPorUsuario(Long usuarioId);
    
}
