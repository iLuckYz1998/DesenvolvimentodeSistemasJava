package org.example2;

public class Cliente {

    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String telefone, String endereco, String cpf, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
