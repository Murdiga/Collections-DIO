package map.Pesquisa.EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(){

        this.estoqueProdutosMap = new HashMap<>();

    }

    public void adicionarProduto(Long cod, String nome, double preco, int quantidade){

        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));

    }

    public double calculaValorTotal(){

        double valorTotalEstoque = 0d;

        if(estoqueProdutosMap.isEmpty()) {

            System.out.println("Map vazio");

        }

        for(Produto p : estoqueProdutosMap.values()){

            valorTotalEstoque += p.getPreco() * p.getQuantidade();

        }

        return valorTotalEstoque;

    }

    public Produto obterProdutoMaisCaro(){

        Produto produtoMaisBarato = null;

        double maiorPreco = Double.MIN_VALUE;

        if (estoqueProdutosMap.isEmpty()) {
            
            System.out.println("Map vazio");

        }

        for(Produto p : estoqueProdutosMap.values()){

            if(p.getPreco() > maiorPreco){

             produtoMaisBarato = p;

             maiorPreco = p.getPreco();

            }

        }

        return produtoMaisBarato;

    }

    public Produto obterProdutoMaisBarato(){

        Produto produtoMaisBarato = null;

        double menorPreco = Double.MAX_VALUE;

        if (estoqueProdutosMap.isEmpty()) {
            
            System.out.println("Map vazio");

        }

        for(Produto p : estoqueProdutosMap.values()){

            if(p.getPreco() < menorPreco){

             produtoMaisBarato = p;

             menorPreco = p.getPreco();

            }

        }

        return produtoMaisBarato;

    }

    public Produto obterProdutorMaiorQuantidadeValorTotalNoEstoque(){

        Produto produtoMaiorQuantidadeValorNoEstoque = null;

        double maiorValorTotalProdutoEstoque = 0d;

        if(estoqueProdutosMap.isEmpty()){

            System.err.println("Map vazio");

        }

        for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()){

            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            
            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {

                maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;

                produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                
            }

        }

        return produtoMaiorQuantidadeValorNoEstoque;

    }

    public void exibirProdutos(){

        System.out.println(estoqueProdutosMap);

    }

    public static void main(String[] args) {
        
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 50, 3);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 40, 2);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 20, 4);

        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque: " + estoqueProdutos.calculaValorTotal());

        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

        Produto produtoMaiorQuantidadeValorTotal = estoqueProdutos.obterProdutorMaiorQuantidadeValorTotalNoEstoque();

        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);

    }

}
