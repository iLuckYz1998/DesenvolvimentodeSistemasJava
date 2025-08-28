package org.example;

public enum Sexo {
    MASCULINO("Sexo: ",'M'),
    FEMINIMO("Sexo :",'F');

    private String texto;
    private char caractere;

    Sexo(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public char getCaractere() {
        return caractere;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    @Override
    public String toString() {
        return "Sexo{" +
                "texto='" + texto + '\'' +
                ", caractere=" + caractere +
                '}';
    }
}
