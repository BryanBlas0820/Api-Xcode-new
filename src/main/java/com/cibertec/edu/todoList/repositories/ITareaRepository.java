/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cibertec.edu.todoList.repositories;

import com.cibertec.edu.todoList.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Bryyann
 */
public interface ITareaRepository extends JpaRepository<Tarea, Long>{
    
}
