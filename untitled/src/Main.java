import java.util.Scanner;

public class Aluno {
    // Atributos da classe Aluno
    private String nome;
    private double nota1;
    private double nota2;


    // Construtor da classe Aluno
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Método para calcular a média do aluno
    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método para verificar se o aluno está aprovado
    public String verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // Métodos getter para nome e notas
    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
}
