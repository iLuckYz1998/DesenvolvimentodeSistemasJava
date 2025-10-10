package com.example.projeto13.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.projeto13.Model.Funcionario;
import com.example.projeto13.Service.FuncionarioService;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties.Http;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

   @GetMapping
   public List<Funcionario> ListarFuncioanrios() {
       return funcionarioService.ListarFuncionarios();
   }

   @PostMapping
   public ResponseEntity<Map<String, Object>> salvarFuncionario(@RequestBody Funcionario funcionario){
       funcionarioService.salvFuncionario(funcionario);
       return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message", "Funcionario salvo com sucesso"));
   }

    @PutMapping("/{id}")
    public ResponseEntity<Map<String, Object>> atualizarFuncionario(@RequestBody Funcionario funcionario){
       funcionarioService.salvFuncionario(funcionario);
       return  ResponseEntity.status(HttpStatus.OK).body(Map.of("message", "Funcionario atualizado com sucesso"));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> excluirFuncionario(@RequestBody Funcionario funcionario){
       funcionarioService.deletarFuncionario(Long.valueOf(funcionario.getId()));
       return ResponseEntity.status(HttpStatus.OK).body(Map.of("message", "Funcionario deletado"));
    }

    

}
