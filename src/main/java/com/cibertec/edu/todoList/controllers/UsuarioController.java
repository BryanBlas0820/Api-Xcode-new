/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.todoList.controllers;

import com.cibertec.edu.todoList.servicesImpls.UsuarioServiceImpl;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cibertec.edu.todoList.models.Usuario;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
        
@RestController
@RequestMapping("/api/usuario")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioServiceImpl _service;
    
    @GetMapping
    public List<Usuario> listarUsuarios() {
        return _service.listarUsuarios();
    }
    
    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@PathVariable Long id) {
        return _service.obtenerUsuario(id);
    }
    
    @PostMapping("/registrar")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return _service.agregarUsuario(usuario);
    }
    
    @PutMapping("{id}")
    public Usuario editarUsuario(@RequestBody Usuario usuario, @PathVariable Long id) {
        return _service.editarUsuario(id, usuario);
    }
    
    @DeleteMapping("/{id}")
    public Boolean eliminarUsuario(@PathVariable Long id) {
        return _service.eliminarUsuario(id);
    }
    
    @PostMapping("/login")
    public Boolean validarUsuarioLogin(@RequestBody Usuario usuario) {
        return _service.validarUsuario(usuario.getUsuario(), usuario.getPassword());
    }
}
