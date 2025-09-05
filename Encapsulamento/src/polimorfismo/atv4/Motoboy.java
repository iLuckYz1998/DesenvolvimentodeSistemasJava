package polimorfismo.atv4;

public class Motoboy extends Funcionario implements SalarioFinal{
    private String placadeMoto;

    public Motoboy(String nome, String cpf, String datadeNascimento, double salarioBase, String placadeMoto) {
        super(nome, cpf, datadeNascimento, salarioBase);
        this.placadeMoto = placadeMoto;
    }

    public String getPlacadeMoto() {
        return placadeMoto;
    }

    public void setPlacadeMoto(String placadeMoto) {
        this.placadeMoto = placadeMoto;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placadeMoto='" + placadeMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", datadeNascimento='" + datadeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.obterSalarioFinal() +

                '}';
    }
    @Override
    public double obterSalarioFinal() {
        return super.salarioBase;
    }
}
