package com.example.projeto4.model;

public enum Sexo {
    MASCULINO("M"),
    FEMININO("F");

    private String texto;

    Sexo(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
