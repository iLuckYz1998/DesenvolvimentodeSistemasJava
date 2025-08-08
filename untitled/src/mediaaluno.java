import java.util.Scanner;

public class mediaaluno {

    public static void main(String[] args) {
        // Criando o objeto Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        // Solicita as notas das duas provas
        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        // Calculando a média das duas provas
        double media = (nota1 + nota2) / 2;

        // Exibe o nome do aluno e sua média
        System.out.printf("\nAluno: %s\n", nomeAluno);
        System.out.printf("Média final: %.2f\n", media);

        // Verificando a aprovação ou reprovação
        if (media >= 7) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }

        // Fechando o scanner
        scanner.close();
    }
}

