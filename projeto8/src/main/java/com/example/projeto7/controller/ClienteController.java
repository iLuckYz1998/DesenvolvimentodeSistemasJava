package com.example.projeto7.controller;

import com.example.projeto7.model.Cliente;
import com.example.projeto7.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> listarCliente(){
        return clienteService.listarTodos();
    }

    @RequestMapping
    public ResponseEntity<Cliente> salvarCliente(@RequestBody Cliente cliente){
        clienteService.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

    @PutMapping
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable UUID id, @RequestBody Cliente cliente){
        clienteService.salvar(cliente);
        return ResponseEntity.status(HttpStatus.OK).body(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable UUID id) {
        clienteService.excluir(id); // Chama o serviço para excluir o cliente
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build(); // Retorna status 204 (No Content) sem corpo
    }


}
