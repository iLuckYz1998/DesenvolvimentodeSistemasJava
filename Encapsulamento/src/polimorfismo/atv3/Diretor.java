package polimorfismo.atv3;

public class Diretor extends Funcionario implements Contratacao{

    public Diretor(String nome, Setor setor, polimorfismo.atv3.Sexo sexo, double salarioBase, String datadeNascimento) {
        super(nome, setor, sexo, salarioBase, datadeNascimento);
    }

    private static double PREMIO = 0.2;

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionario: " + funcionario.nome);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo funcionario: " + funcionario.nome);

    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase + (super.salarioBase + this.PREMIO);
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "nome='" + nome + '\'' +
                ", datadeNascimento='" + datadeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", Sexo=" + Sexo +
                ", setor=" + setor +
                ", salarioBase=" + getSalarioBase() +
                ", selarioFinal=" + getSalarioFinal() +
                '}';
    }

}
