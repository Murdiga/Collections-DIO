package map.Ordenacao.LivrariaOnline;

import java.util.*;

public class LivrariaOnline {

    private Map<Long, Livro> livrosMap;

    public LivrariaOnline() {

        this.livrosMap = new HashMap<>();

    }

    public void adicionarLivro(Long cod, String link, String titulo, String autor, double preco) {

        livrosMap.put(cod, new Livro(link, titulo, autor, preco));

    }

    public void removerLivro(String titulo) {

        List<Long> removerLivro = new ArrayList<>();

        for (Map.Entry<Long, Livro> entry : livrosMap.entrySet()) {

            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {

                removerLivro.add(entry.getKey());

            }

        }

        for(Long chave : removerLivro){

            livrosMap.remove(chave);

        }

    }

    public Map<Long, Livro> exibirLivrosOrdenadosPorPreco(){

        List<Map.Entry<Long, Livro>> livrosOrdernadosPorPreco = new ArrayList<>(livrosMap.entrySet());

        Collections.sort(livrosOrdernadosPorPreco, new ComparatorPorPreco());

        Map<Long, Livro> livrosPorPreco = new LinkedHashMap<>();

        for(Map.Entry<Long, Livro> entry : livrosOrdernadosPorPreco){

            livrosPorPreco.put(entry.getKey(), entry.getValue());

        }

        return livrosPorPreco;

    }

    public Map<Long, Livro> pesquisarPorAutor(String autor){

        Map<Long, Livro> livroPorAutor = new HashMap<>();

        for(Map.Entry<Long, Livro> entry : livrosMap.entrySet()){

            Livro livro = entry.getValue();

            if (livro.getAutor().equals(autor)) {
            
                livroPorAutor.put(entry.getKey(), livro);

            }

        }

        return livroPorAutor;

    }

    public void exibirListaLivro() {

        System.out.println(livrosMap);

    }

    public Livro obterLivroMaisCaro(){

        Livro livroMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;

        if(livrosMap.isEmpty()){

            System.out.println("Map vazio");

        }

        for(Livro l : livrosMap.values()){

            if(l.getPreco() > maiorPreco){

                livroMaisCaro = l;
                maiorPreco = l.getPreco();

            }

        }

        return livroMaisCaro;

    }

    public Livro obterLivroMaisBarato(){

        Livro livroMaisBarato = null;

        double menorPreco = Double.MAX_VALUE;

        if(livrosMap.isEmpty()){

            System.out.println("Map vazio");

        }

        for (Livro l : livrosMap.values()){

            if(l.getPreco() < menorPreco){

                livroMaisBarato = l;
                menorPreco = l.getPreco();

            }

        }

        return livroMaisBarato;

    }

    public static void main(String[] args) {

        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro(12345L, "livro1.com", "Livro1", "Autor1", 50.5);
        livrariaOnline.adicionarLivro(54321L, "livro2.com", "Livro2", "Autor2", 25);
        livrariaOnline.adicionarLivro(99999L, "livro3.com", "Livro3", "Autor1", 40);
        livrariaOnline.adicionarLivro(65432L, "livro4.com", "Livro4", "Autor1", 25);

        livrariaOnline.exibirListaLivro();

        livrariaOnline.removerLivro("Livro1");

        livrariaOnline.exibirListaLivro();

        System.out.println(livrariaOnline.pesquisarPorAutor("Autor1"));

        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        

    }

}
