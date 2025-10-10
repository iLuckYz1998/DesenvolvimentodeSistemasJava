package com.example.projeto13.Service;

import com.example.projeto13.Model.Funcionario;
import com.example.projeto13.Repository.FuncionarioRepository;

import java.util.List;

public class FuncionarioService {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> ListarFuncionarios(){
        return funcionarioRepository.findAll();
    }

    public Funcionario salvFuncionario(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizFuncionario(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public void deletarFuncionario(Long id){
        funcionarioRepository.deleteById(id);
    }
    

}
