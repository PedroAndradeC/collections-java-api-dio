package main.java.list.pesquisa;

public class Livro {
    //atributo
    private String titulo;
    private String autor;
    private int anoPublicação;

    public Livro(String titulo, String autor, int anoPublicação) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicação = anoPublicação;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicação() {
        return anoPublicação;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicação=" + anoPublicação +
                '}';
    }
}
