package set.Ordenacao.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {

        this.produtoSet = new HashSet<>();

    }

    public void adicionarProduto(String nome, Long codigo, double preco, int quantidade) {

        produtoSet.add(new Produto(nome, codigo, preco, quantidade));

    }

    public Set<Produto> exibirProdutosPorNome() {

        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

        return produtosPorNome;

    }

    public Set<Produto> exibirPorPreco() {

        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosPorPreco.addAll(produtoSet);

        return produtosPorPreco;

    }

    public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Produto1", 1L, 30, 3);
        cadastroProdutos.adicionarProduto("Produto5", 2L, 25, 1);
        cadastroProdutos.adicionarProduto("Produto9", 2L, 55, 1);
        cadastroProdutos.adicionarProduto("Produto4", 4L, 60, 1);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirPorPreco());

    }

}
