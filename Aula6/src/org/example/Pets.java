package org.example;

public class Pets {

        //Instanciar uma classe
        private String nome;
        private int idade;
        private String raca;
        private String porte;
        private String alimentacao;

    @Override
    public String toString() {
        return "Pets{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                ", porte='" + porte + '\'' +
                ", alimentacao='" + alimentacao + '\'' +
                '}';
    }

    public Pets(String nome, String alimentacao, String porte, String raca, int idade) {
        this.nome = nome;
        this.alimentacao = alimentacao;
        this.porte = porte;
        this.raca = raca;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }
}
