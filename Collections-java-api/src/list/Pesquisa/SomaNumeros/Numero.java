package list.Pesquisa.SomaNumeros;

public class Numero implements Comparable<Numero> {

    @Override
    public int compareTo(Numero n) {

        return Integer.compare(numero, n.getNumero());

    }

    private Integer numero;

    public Numero(Integer numero) {

        this.numero = numero;

    }

    public Integer getNumero() {

        return numero;

    }

    public String toString() {

        return "Numero{'" + numero + "'}";

    }

}
