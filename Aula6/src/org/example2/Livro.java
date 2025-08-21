package org.example2;

public class Livro {
    private String titulo;
    private String numeroPaginas;
    private String quantidadeCapitulos;
    private String codigoISBN;
    private String autor;

    public Livro(String titulo, String numeroPaginas, String quantidadeCapitulos, String codigoISBN, String autor) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.quantidadeCapitulos = quantidadeCapitulos;
        this.codigoISBN = codigoISBN;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro {" +
                "titulo='" + titulo + '\'' +
                ", numeroPaginas='" + numeroPaginas + '\'' +
                ", quantidadeCapitulos='" + quantidadeCapitulos + '\'' +
                ", codigoISBN='" + codigoISBN + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}

