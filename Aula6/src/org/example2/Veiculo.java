package org.example2;

public class Veiculo {
    private String placa;
    private String capacidadeTanque;
    private String velocidadeMaxima;
    private String capacidadeCarga;
    private String quantidadePortas;
    private String cor;

    public Veiculo(String placa, String capacidadeTanque, String velocidadeMaxima, String capacidadeCarga, String quantidadePortas, String cor) {
        this.placa = placa;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMaxima = velocidadeMaxima;
        this.capacidadeCarga = capacidadeCarga;
        this.quantidadePortas = quantidadePortas;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Veiculo {" +
                "placa='" + placa + '\'' +
                ", capacidadeTanque='" + capacidadeTanque + '\'' +
                ", velocidadeMaxima='" + velocidadeMaxima + '\'' +
                ", capacidadeCarga='" + capacidadeCarga + '\'' +
                ", quantidadePortas='" + quantidadePortas + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}

