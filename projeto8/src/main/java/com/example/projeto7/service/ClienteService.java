package com.example.projeto7.service;

import com.example.projeto7.model.Cliente;
import com.example.projeto7.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;


    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }


    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }


    public Cliente salvar(Cliente cliente) {
        // Aqui você pode adicionar validações antes de salvar, se necessário
        return clienteRepository.save(cliente);
    }

    public Cliente atualizar (UUID id, Cliente cliente){
        if (!clienteRepository.existsById(id)){
            throw new RuntimeException("Cliente não encontrado.");
        }
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }

    public void excluir (UUID id) {
        if (!clienteRepository.existsById(id)) {
            throw new RuntimeException("Cliente não encontrado.");
        }

        clienteRepository.deleteById(id);

    }
}
