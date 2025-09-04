package polimorfismo.atv3;

public class Diretor extends Funcionario implements Contratacao{

    public Diretor(String nome, Setor setor, polimorfismo.atv3.Sexo sexo, double salarioBase, String datadeNascimento) {
        super(nome, setor, sexo, salarioBase, datadeNascimento);
    }

    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    @Override
    public double getSalarioFinal() {
        return 0;
    }

    private static double PREMIO = 0.2;
}
