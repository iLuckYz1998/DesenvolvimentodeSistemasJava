public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa ();

        // Atribuição de valores.
        //p1.nome = "Lucas";
        p1.setNome("Lucas");
        p1.setCpf("000.111.222-33");
        //p2.nome = "Leandro";
        p2.setNome("Leandro");
        p2.setCpf("444.555.777-88");


        //Mostrar os valores.
        //System.out.println("Nome: "+ p1.nome);
        System.out.println("Nome: "+ p1.getNome());
        System.out.println("CPF: "+ p1.getCpf());
        //System.out.println("Nome: "+ p2.nome);
        System.out.println("Nome: "+ p2.getNome());
        System.out.println("CPF: "+ p2.getCpf());
    }
}
