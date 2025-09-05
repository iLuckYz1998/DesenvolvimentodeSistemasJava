package polimorfismo.atv4;

public class Gerente extends CargoDeConfianca implements Contratacao{
    public Gerente(String nome, String cpf, String datadeNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, datadeNascimento, salarioBase, bonificacao);
    }


    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", datadeNascimento='" + datadeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.obterSalarioFinal() +
                '}';
    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase * super.bonificacao.getValor();
    }

    @Override
    public void admitir(Gerente gerente) {
        System.out.println("Admitir: " );
    }

    @Override
    public void demitir(Gerente gerente) {

    }
}
