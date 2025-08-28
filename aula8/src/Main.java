public class Main {
    public static void main(String[] args) {
    Funcioinario funcionario1 = new Funcioinario(Sexo.MASCULINO, Setor.FINANCEIRO,2.500,27,"Lucas",01);
    Funcioinario funcionario2 = new Funcioinario(Sexo.FEMININO, Setor.FINANCEIRO,2.200,22,"Laila",02);

        System.out.println(funcionario1.toString());

    }
}