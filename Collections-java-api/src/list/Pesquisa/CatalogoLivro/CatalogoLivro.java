package list.Pesquisa.CatalogoLivro;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivro {

    private List<Livro> livroList;

    public CatalogoLivro() {

        this.livroList = new ArrayList<>();

    }

    public void adicionarLivro(String titulo, String autor, Integer anoPublicacao) {

        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor) {

        List<Livro> livroPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {

            for (Livro l : livroList) {

                if (l.getAutor().equals(autor)) {

                    livroPorAutor.add(l);

                }

            }

        }

        return livroPorAutor;

    }

    public List<Livro> pesquisarPorAno(Integer anoInicial, Integer anoFinal) {

        List<Livro> listIntervaloAno = new ArrayList<>();

        if (!livroList.isEmpty()) {

            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial &&
                        l.getAnoPublicacao() <= anoFinal) {

                    listIntervaloAno.add(l);

                }

            }

        }

        return listIntervaloAno;

    }

    public Livro pesquisarPorTitulo(String titulo) {

        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {

                    livroPorTitulo = l;
                    break;

                }

            }
            
        }

        return livroPorTitulo;

    }

    public static void main(String[] args) {

        CatalogoLivro catalogoLivro = new CatalogoLivro();

        catalogoLivro.adicionarLivro("Livro1", "Autor1", 2005);
        catalogoLivro.adicionarLivro("Livro2", "Autor2", 2015);
        catalogoLivro.adicionarLivro("Livro3", "Autor2", 1995);
        catalogoLivro.adicionarLivro("Livro4", "Autor3", 2024);
        catalogoLivro.adicionarLivro("Livro5", "Autor4", 2008);
        catalogoLivro.adicionarLivro("Livro6", "Autor5", 2018);
        catalogoLivro.adicionarLivro("Livro6", "Autor7", 2012);

        System.out.println(catalogoLivro.pesquisarPorAutor("Autor2"));

        System.out.println(catalogoLivro.pesquisarPorAno(2023, 2024));

        System.out.println(catalogoLivro.pesquisarPorTitulo("Livro6"));

    }

}
