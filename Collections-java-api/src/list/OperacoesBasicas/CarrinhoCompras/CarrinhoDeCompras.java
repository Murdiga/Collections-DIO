
package list.OperacoesBasicas.CarrinhoCompras;

import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras() {

        this.listaItens = new ArrayList<>();

    }

    public void adicionarItem(String nome, Double valor, Integer quantia) {

        listaItens.add(new Item(nome, valor, quantia));

    }

    public double calcularValorTotal() {

        if (listaItens.isEmpty()) {

            throw new ListaVaziaException();

        }

        double valorTotal = 0;

        for (Item item : listaItens) {

            double valorItem = item.getValor() * item.getQuantia();

            valorTotal += valorItem;

        }

        return valorTotal;

    }

    public void removerItem(String nome) {

        List<Item> itemRemover = new ArrayList<>();

        boolean itemRemovido = false;

        if (!listaItens.isEmpty()) {
            for (Item i : listaItens) {

                if (i.getNome().equalsIgnoreCase(nome)) {

                    itemRemover.add(i);

                    itemRemovido = true;

                }

            }

            listaItens.removeAll(itemRemover);

        }

        if (!itemRemovido) {
            System.out.println("Item: " + nome + " não encontrado");
        }

    }

    public void exibirItens() {

        if (!listaItens.isEmpty()) {

            System.out.println(listaItens);

        } else {

            throw new ListaVaziaException();

        }

    }

    public static void main(String[] args) throws ListaVaziaException {

        CarrinhoDeCompras listaItens = new CarrinhoDeCompras();

        listaItens.adicionarItem("Escova", 25.0, 3);
        listaItens.adicionarItem("Tenis Nike", 300.99, 1);
        listaItens.adicionarItem("Camisa Lakers", 230.99, 1);
        listaItens.adicionarItem("Escova", 25.0, 3);

        listaItens.exibirItens();
        System.out.println("Valor total a pagar = %.2f".formatted(listaItens.calcularValorTotal()));

        listaItens.removerItem("Escova");

        listaItens.exibirItens();

        System.out.println("Valor total a pagar = %.2f".formatted(listaItens.calcularValorTotal()));

        listaItens.removerItem("Lapis");

        listaItens.exibirItens();

        System.out.println("Valor total a pagar = %.2f".formatted(listaItens.calcularValorTotal()));

    }

}
