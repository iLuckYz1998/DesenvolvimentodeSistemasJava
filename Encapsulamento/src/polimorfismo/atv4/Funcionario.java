package polimorfismo.atv4;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String datadeNascimento;
    protected double salarioBase;

    public Funcionario(String nome, String cpf, String datadeNascimento, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.datadeNascimento = datadeNascimento;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(String datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", datadeNascimento='" + datadeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public double obterSalarioFinal() {
        return 0;
    }
}
