package com.example.projeto13.Service;

import com.example.projeto13.Model.Cliente;
import com.example.projeto13.Repository.ClienteRepository;

import java.util.List;

public class ClienteService {

    private ClienteRepository clienteRepository;

    public ClienteService (ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> ListarClientes(){
        return clienteRepository.findAll();
    }

    public Cliente salvarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void deletarCliente(Long id){
        clienteRepository.deleteById(id);
    }

}
