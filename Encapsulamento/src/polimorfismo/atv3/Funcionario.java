package polimorfismo.atv3;

public abstract class Funcionario {
    protected String nome;
    protected String datadeNascimento;
    protected double salarioBase;
    protected Sexo Sexo;
    protected Setor setor;

    public Funcionario(String nome, Setor setor, polimorfismo.atv3.Sexo sexo, double salarioBase, String datadeNascimento) {
        this.nome = nome;
        this.setor = setor;
        Sexo = sexo;
        this.salarioBase = salarioBase;
        this.datadeNascimento = datadeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public polimorfismo.atv3.Sexo getSexo() {
        return Sexo;
    }

    public void setSexo(polimorfismo.atv3.Sexo sexo) {
        Sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public abstract double getSalarioFinal();

}
