package com.example.projeto10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.projeto10.service.UsuarioService;
import com.example.projeto10.model.UsuarioModel;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioModel> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvarUsuario(@RequestBody UsuarioModel usuario){
        usuarioService.salvarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("mensagem", "Usuario cadastrado com sucesso"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarUsuario(Long id, @RequestBody UsuarioModel usuarioModel){
        usuarioService.atualizarUsuario(UUID.randomUUID(), usuarioModel);

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Usuario atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluirUsuario(Long id){
        usuarioService.deletarUsuario(UUID.randomUUID());

        return ResponseEntity.status(HttpStatus.OK).body(Map.of("mensagem", "Usuario deletado com sucesso"));
    }

}
