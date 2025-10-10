package com.example.projeto13.Controller;

import com.example.projeto13.Model.Cliente;
import com.example.projeto13.Model.Funcionario;
import com.example.projeto13.Service.ClienteService;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> ListarClientes(){
        return clienteService.ListarClientes();
    }

    @PostMapping
    public ResponseEntity<Map<String, Object>> salvarCliente(@RequestBody Cliente cliente){
        clienteService.salvarCliente(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message", "Cliente salvo com sucesso"));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarCliente(@RequestBody Cliente cliente){
        clienteService.atualizarCliente(cliente);
        return  ResponseEntity.status(HttpStatus.OK).body(Map.of("message", "Cliente atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> deletarCliente(@RequestBody Cliente cliente){
        clienteService.deletarCliente(Long.valueOf(cliente.getId()));
        return ResponseEntity.status(HttpStatus.OK).body(Map.of("message", "Funcionario deletado"));
    }
    

}
