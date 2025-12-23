/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.edu.todoList.servicesImpls;

import com.cibertec.edu.todoList.models.Usuario;
import com.cibertec.edu.todoList.repositories.IUsuarioRepository;
import com.cibertec.edu.todoList.services.IUsuarioService;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements IUsuarioService {
    
    private final IUsuarioRepository _repository;

    @Override
    public List<Usuario> listarUsuarios() {
        return _repository.findAll();
    }

    @Override
    public Usuario agregarUsuario(Usuario usuario) {
        return _repository.save(usuario);
    }

    @Override
    public Usuario obtenerUsuario(Long id) {
        return _repository.findById(id).orElse(null);
    }

    @Override
    public Usuario editarUsuario(Long id, Usuario usuario) {
        return _repository.findById(id).map(u -> {
            u.setNombre(usuario.getNombre());
            u.setApellidos(usuario.getApellidos());
            u.setUsuario(usuario.getUsuario());
            u.setCorreo(usuario.getCorreo());
            return _repository.save(u);
        }).orElse(null);
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        Optional<Usuario> usuario = _repository.findById(id);
        if (usuario.isPresent()) {
            _repository.delete(usuario.get());
            return true;
        }
        return false;
    }

    @Override
    public Long validarUsuario(String user, String password) {
        Usuario usuario = _repository.findByUsuario(user).orElse(null);
        
        if (usuario == null) {
            return null;
        }

        // Validación simple (SIN ENCRIPTAR)
        if (!usuario.getPassword().equals(password)) {
            return null;
        }
        
        return usuario.getId();
    }
    
}
