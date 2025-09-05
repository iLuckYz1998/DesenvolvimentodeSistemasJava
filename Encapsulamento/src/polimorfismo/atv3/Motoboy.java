package polimorfismo.atv3;

public class Motoboy extends Funcionario implements Contratacao{
    private String carteiraDeHabilitacao;
    
    public Motoboy(String nome, Setor setor, polimorfismo.atv3.Sexo sexo, double salarioBase, String datadeNascimento, String carteiraDeHabilitacao) {
        super(nome, setor, sexo, salarioBase, datadeNascimento);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "carteiraDeHabilitacao='" + carteiraDeHabilitacao + '\'' +
                ", nome='" + nome + '\'' +
                ", datadeNascimento='" + datadeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", Sexo=" + Sexo +
                ", setor=" + setor +
                '}';
    }

    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase;
    }
}
