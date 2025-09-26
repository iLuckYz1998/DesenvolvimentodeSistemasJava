package com.example.projeto7.service;

import com.example.projeto7.model.Aluno;
import com.example.projeto7.model.Cliente;
import com.example.projeto7.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AlunoService {
    private  AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarTodos(){
        return alunoRepository.findAll();
    }

    public  Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    public Aluno atualizar(UUID id, Aluno aluno){
        if (alunoRepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado");
        }aluno.setId(id);
        return alunoRepository.save(aluno);
    }

    public void excluir(UUID id){
        if(!alunoRepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado");
        }
        alunoRepository.deleteById(id);
    }

}
