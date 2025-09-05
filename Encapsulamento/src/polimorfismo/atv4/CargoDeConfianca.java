package polimorfismo.atv4;

public abstract class CargoDeConfianca extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String datadeNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, datadeNascimento, salarioBase);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

}
