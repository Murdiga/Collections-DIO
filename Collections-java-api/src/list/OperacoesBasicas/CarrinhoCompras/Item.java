package list.OperacoesBasicas.CarrinhoCompras;

public class Item {

    private String nome;

    private Double valor;

    private Integer quantia;

    public Item(String nome, Double valor, Integer quantia) {

        this.nome = nome;

        this.valor = valor;

        this.quantia = quantia;

    }

    public String getNome() {

        return nome;

    }

    public Double getValor() {

        return valor;

    }

    public Integer getQuantia() {

        return quantia;

    }

    public String toString() {

        return "\nItem{Nome: " + nome
                + ", Valor: " + valor
                + ", Quantia: " + quantia + "}";

    }
}
