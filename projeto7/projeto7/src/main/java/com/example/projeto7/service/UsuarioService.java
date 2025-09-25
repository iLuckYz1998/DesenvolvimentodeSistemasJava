package com.example.projeto7.service;

import com.example.projeto7.model.Usuario;
import com.example.projeto7.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List <Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario salvar(Usuario usuario){
        if (usuarioRepository.findByTelefone(usuario.getTelefone()).isPresent()){
            throw new RuntimeException("Usuario já cadastrado!");
        }
        return usuarioRepository.save(usuario);
    }

}
