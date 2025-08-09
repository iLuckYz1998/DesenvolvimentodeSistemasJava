import java.util.Scanner;

public class vetores {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        double[] notas = new double[3];

        for (int i = 0; i < 3; i++) {
            do {
                System.out.println("Digite a " + (i + 1) + "ª nota: ");
                notas[i] = ler.nextDouble();

                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("A nota não pode ser maior que 10 e menor que 0. Tente novamente.");
                }
            } while (notas[i] < 0 || notas[i] > 10);

            System.out.println("Nota " + (i + 1) + " registrada com sucesso!");
        }

        // Exibindo as notas
        System.out.println("\nExibindo as notas:");
        for (double nota : notas) {
            System.out.println("Nota: " + nota);
        }

        // Calculando a média
        double media = (notas[0] + notas[1] + notas[2]) / 3;
        System.out.println("A média do aluno é: " + media);

        ler.close();
    }
}
