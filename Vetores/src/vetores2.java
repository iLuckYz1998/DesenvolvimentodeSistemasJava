import java.util.ArrayList;
import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class vetores2 {
    public static void main(String[] args){
        Scanner ler=new Scanner(System.in);
        ArrayList<Double> notas= new ArrayList<>();
        String resposta;
        double notaInformada;

        do{
            do{
                System.out.println("Digite uma nota :");
                notaInformada ler.nextDouble();
                    }
            }while(notaInformada < 0  || notaInformada > 10);
        notas.add(notaInformada);

            System.out.println("Deseja inserir mais uma nota :");
            System.out.println("\nPressione a tecla N para sair");
            resposta = ler.next();
        }while(!resposta.equalsIgnoreCase("n"));

        System.out.println("\nExibindo as notas");
        for(double nota: nota){
            System.out.println("Nota :"+ nota);
        }

    }

}
