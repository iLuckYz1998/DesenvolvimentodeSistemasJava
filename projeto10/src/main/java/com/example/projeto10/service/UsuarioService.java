package com.example.projeto10.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.projeto10.model.UsuarioModel;
import com.example.projeto10.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Lista todos os usuários
    public List<UsuarioModel> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public UsuarioModel salvarUsuario(UsuarioModel usuario){
        if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
            throw new RuntimeException("Email já cadastrado");
        }

        // Gera o UUID manualmente
        usuario.setId(UUID.randomUUID());

        return usuarioRepository.save(usuario);
    }


    // Atualiza um usuário existente
    public UsuarioModel atualizarUsuario(UUID id, UsuarioModel usuario){
        // Verifica se o usuário existe
        if (!usuarioRepository.existsById(id)) {
            throw new IllegalArgumentException("Usuário não encontrado");
        }
        usuario.setId(id);
        return usuarioRepository.save(usuario);
    }

    // Deleta um usuário
    public void deletarUsuario(UUID id){
        // Verifica se o usuário existe
        if (!usuarioRepository.existsById(id)) {
            throw new IllegalArgumentException("Usuário não encontrado");
        }
        usuarioRepository.deleteById(id);
    }
}
