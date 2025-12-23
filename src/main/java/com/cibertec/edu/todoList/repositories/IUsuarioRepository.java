/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cibertec.edu.todoList.repositories;

import com.cibertec.edu.todoList.models.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Bryyann
 */
public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{
    Optional<Usuario> findByUsuario(String usuario);
}
