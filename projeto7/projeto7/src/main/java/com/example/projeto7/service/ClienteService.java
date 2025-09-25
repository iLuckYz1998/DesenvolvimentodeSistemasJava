package com.example.projeto7.service;

import com.example.projeto7.model.Cliente;
import com.example.projeto7.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
