/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cibertec.edu.todoList.services;

import com.cibertec.edu.todoList.models.Usuario;
import java.util.List;

/**
 *
 * @author Bryyann
 */
public interface IUsuarioService {
    
    List<Usuario> listarUsuarios();
    Usuario agregarUsuario(Usuario usuario);
    Usuario obtenerUsuario(Long id);
    Usuario editarUsuario(Long id, Usuario usuario);
    boolean eliminarUsuario(Long id);
    
    boolean validarUsuario(String username, String password);
    
}   
