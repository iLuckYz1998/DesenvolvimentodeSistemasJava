import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {

        String loginSalvo = "Lucas";
        String senhaSalva = "123";

        Scanner ler = new Scanner(System.in);
        System.out.println(" Digite o login: ");
        String login = ler.next();

        System.out.println("Digite a senha: ");
        String senha  = ler.next();

        if(login.equals(loginSalvo) && senha.equals(senhaSalva)){
            System.out.println("Bem vindo usuario, Logado!");
        }else {
            System.out.println("Login ou senha invalido!");
        }

    }

}
