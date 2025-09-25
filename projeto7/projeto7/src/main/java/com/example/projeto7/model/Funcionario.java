package com.example.projeto7.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String telefone;

    @Column(nullable = false, unique = true)
    private String rg;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(nullable = false, unique = true)
    private String matricula;

    @Column(nullable = false)
    private String datadeNascimento;

    @Column(nullable = false)
    private String salario;

    @Column(nullable = false)
    private String email;

    public Funcionario() {
    }

    public Funcionario(UUID id, String nome, String telefone, String rg, String cpf, String matricula, String datadeNascimento, String salario, String email) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
        this.matricula = matricula;
        this.datadeNascimento = datadeNascimento;
        this.salario = salario;
        this.email = email;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
