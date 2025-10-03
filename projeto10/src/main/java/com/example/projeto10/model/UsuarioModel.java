package com.example.projeto10.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class UsuarioModel {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = true)
    private String nome;

    @Column(nullable = true)
    private String email;

    @Version  // Campo de versão para controle de concorrência otimista
    private Long version;

    public UsuarioModel() {
    }

    public UsuarioModel(UUID id, String nome, String email, Long version) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.version = version;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
