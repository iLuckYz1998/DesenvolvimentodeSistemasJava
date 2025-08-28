public class Funcioinario {
    private int id;
    private String nome;
    private int idade;
    private double salario;
    private Setor setor;
    private Sexo sexo;

    public Funcioinario(Sexo sexo, Setor setor, double salario, int idade, String nome, int id) {
        this.sexo = sexo;
        this.setor = setor;
        this.salario = salario;
        this.idade = idade;
        this.nome = nome;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    @Override
    public String toString() {
        return "Funcioinario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", setor=" + setor +
                ", sexo=" + sexo +
                '}';
    }
}
