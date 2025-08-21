package org.example2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Veiculo v1 = new Veiculo("XA3Y452", "20lt", "100.0", "50lt", "5", "Vermelho");
        Livro l1 = new Livro("Amor e Guerra", "100", "50", "A14526NB", "Maluco");
        Cliente c1 = new Cliente("Lucas","(71)996987394","Rua Simao Sobral n 107","06679530512",27);

        System.out.println(v1.toString());
        System.out.println(l1.toString());
        System.out.println(c1.toString());

        s.close();
    }
}

