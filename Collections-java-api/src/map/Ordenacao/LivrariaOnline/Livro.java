package map.Ordenacao.LivrariaOnline;

public class Livro {

    private String link;

    private String titulo;

    private String autor;

    private double preco;


    public Livro (String link, String titulo, String autor, double preco){

        this.link = link;

        this.titulo = titulo;

        this.autor = autor;

        this.preco = preco;

    }

    public String getLink(){

        return link;

    }

    public String getTitulo(){

        return titulo;

    }

    public String getAutor(){

        return autor;

    }

    public double getPreco(){

        return preco;

    }

    public String toString(){

        return "Livro{Link: '" + link + "'" +
        ", Nome: '" + titulo + "'" + 
        ", Autor: '" + autor + "'" + 
        ", Preço: '" + preco + "'}";

    }

}
