package polimorfismo.atv3;

public class Main {
    public static void main(String[] args) {

        Diretor diretor = new Diretor("Lucas", Setor.RECURSOS_HUMANOS, Sexo.MASCULINO, 5.500, "22/03/1998");
        Motoboy motoboy = new Motoboy("Santiago", Setor.OPERACOES, Sexo.MASCULINO, 1.512, "23/10/1997", "001");

        System.out.println(diretor.toString());
        System.out.println(motoboy.toString());

        diretor.admitir(motoboy);

        }

    }