package org.example;

public enum Unidade_Federativa {
    BAHIA("Bahia","BA"),
    SAO_PAULO("São Paulo","SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

    private String nome;
    private String sigla;

    Unidade_Federativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Unidade_Federativa{" +
                "nome='" + nome + '\'' +
                ", sigla.uf ='" + sigla + '\'' +
                '}';
    }
}
