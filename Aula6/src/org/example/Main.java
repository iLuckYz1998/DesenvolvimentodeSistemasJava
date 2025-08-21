package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Coletando dados para o primeiro pet
        System.out.println("Digite o Nome do pet 1:");
        String nome1 = s.nextLine();

        System.out.println("Digite a alimentação do pet 1:");
        String alimentacao1 = s.nextLine();

        System.out.println("Digite o porte do pet 1:");
        String porte1 = s.nextLine();

        System.out.println("Digite a raça do pet 1:");
        String raca1 = s.nextLine();

        System.out.println("Digite a idade do pet 1:");
        int idade1 = s.nextInt();
        s.nextLine();  // Consumir a quebra de linha pendente

        // Criando o primeiro pet
        Pets pet1 = new Pets(nome1, alimentacao1, porte1, raca1, idade1);

        // Coletando dados para o segundo pet
        System.out.println("Digite o Nome do pet 2:");
        String nome2 = s.nextLine();

        System.out.println("Digite a alimentação do pet 2:");
        String alimentacao2 = s.nextLine();

        System.out.println("Digite o porte do pet 2:");
        String porte2 = s.nextLine();

        System.out.println("Digite a raça do pet 2:");
        String raca2 = s.nextLine();

        System.out.println("Digite a idade do pet 2:");
        int idade2 = s.nextInt();

        // Criando o segundo pet
        Pets pet2 = new Pets(nome2, alimentacao2, porte2, raca2, idade2);

        // Exibindo os detalhes dos pets
        System.out.println("Detalhes do Pet 1: " + pet1);
        System.out.println("Detalhes do Pet 2: " + pet2);

        s.close();
    }
}
