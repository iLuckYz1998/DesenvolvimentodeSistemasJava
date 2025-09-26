package com.example.projeto7.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String datadeNascimento;

    @Column(nullable = false, unique = true)
    private String protocolodeAtendimento;

    public Cliente() {
    }

    public Cliente(UUID id, String nome, String datadeNascimento, String protocolodeAtendimento) {
        this.id = id;
        this.nome = nome;
        this.datadeNascimento = datadeNascimento;
        this.protocolodeAtendimento = protocolodeAtendimento;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public String getProtocolodeAtendimento() {
        return protocolodeAtendimento;
    }

    public void setProtocolodeAtendimento(String protocolodeAtendimento) {
        this.protocolodeAtendimento = protocolodeAtendimento;
    }
}
