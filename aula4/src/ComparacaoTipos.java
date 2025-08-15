public class ComparacaoTipos {
    public static void main(String[] args) {

        String nomeUsuario = "Lucas";
        int senha = 123;

        boolean resultadoNome = nomeUsuario.equals("Lucas");
        boolean resultadoSenha = (senha == 456);

        System.out.println("O nome do usuario está correto? "+ resultadoNome);
        System.out.println("A senha está correto? "+ resultadoSenha);
    }

}
