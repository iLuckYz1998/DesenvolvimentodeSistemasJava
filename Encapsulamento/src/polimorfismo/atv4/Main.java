package polimorfismo.atv4;

import polimorfismo.atv3.Diretor;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente ("Lucas","00100200304","21/03/000",2547,Bonificacao.GERENTE);
        Motoboy motoboy = new Motoboy("aaa","0000000","00/00/0000",2587,"ayn2587");

        System.out.println(gerente.toString());
        System.out.println(motoboy.toString());

    }
}
