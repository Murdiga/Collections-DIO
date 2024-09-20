package set.Ordenacao.CadastroProdutos;

import java.util.Objects;

public class Produto implements Comparable<Produto> {

    @Override
    public int compareTo(Produto p) {

        return nome.compareToIgnoreCase(p.getNome());

    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;

        if (!(o instanceof Produto produto))
            return false;

        return getCodigo() == produto.getCodigo();

    }

    @Override
    public int hashCode() {

        return Objects.hash(getCodigo());

    }

    private String nome;

    private Long codigo;

    private double preco;

    private int quantidade;

    public Produto(String nome, Long codigo, double preco, int quantidade) {

        this.nome = nome;

        this.codigo = codigo;

        this.preco = preco;

        this.quantidade = quantidade;

    }

    public String getNome() {

        return nome;

    }

    public Long getCodigo() {

        return codigo;

    }

    public Double getPreco() {

        return preco;

    }

    public int getQuantidade() {

        return quantidade;

    }

    public String toString() {

        return "Produto{Nome: '" + nome + "'" +
                ", Codigo: '" + codigo + "'" +
                ", Preço: '" + preco + "'" +
                ", Quantidade: '" + quantidade + "'}";

    }

}
