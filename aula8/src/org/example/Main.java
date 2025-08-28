package org.example;

public class Main {
    public static void main(String[] args) {
    Pessoa p1 = new Pessoa(01,"Lucas",27,"(71)996987394","lucasantls19@gmail.com",
            new Endereco("Rua Simao Sobral", "107","Casa","40435360","Salvaodr",Unidade_Federativa.BAHIA),Sexo.MASCULINO);

        System.out.println(p1.toString());

    }
}
