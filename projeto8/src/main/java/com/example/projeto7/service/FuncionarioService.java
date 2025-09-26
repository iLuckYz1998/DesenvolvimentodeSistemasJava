package com.example.projeto7.service;

import com.example.projeto7.model.Funcionario;
import com.example.projeto7.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    //GET
    public List <Funcionario> listarTodos(){
        return funcionarioRepository.findAll();
    }

    //POST
    public Funcionario salvar(Funcionario funcionario){
        //Verificar se o funcionario já está cadastrado
        if (funcionarioRepository.findByTelefone(funcionario.getTelefone()).isPresent()){
            //Se encontrado o telefone do funcionario no banco de dados, mostra mensagem.
            throw new RuntimeException("Funcionario já cadastrado.");
        }

        //Caso não encontre o telefone no BD, salva o Funcionario.
        return funcionarioRepository.save(funcionario);
    }

}
