package list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    List<Numero> listNumero = new ArrayList<>();

    public void adicionarNumero(Integer numero) {

        listNumero.add(new Numero(numero));

    }

    public Integer somarNumeros() {

        if (listNumero.isEmpty()) {

            throw new ListaVaziaException();

        }

        int somaTotal = 0;

        for (Numero n : listNumero) {

            somaTotal = somaTotal + n.getNumero();

        }

        return somaTotal;

    }

    public Numero encontrarMaiorNumero() {

        if (listNumero.isEmpty()) {

            throw new ListaVaziaException();

        }

        Numero maiorNumero = Collections.max(listNumero);

        return maiorNumero;

    }

    public Numero encontrarMenorNumero() {

        if (listNumero.isEmpty()) {

            throw new ListaVaziaException();

        }

        Numero menorNumero = Collections.min(listNumero);

        return menorNumero;

    }

    public void exibirNumeros() {

        if (listNumero.isEmpty()) {

            throw new ListaVaziaException();

        }

        System.out.println(listNumero);

    }

    public static void main(String[] args) {

        SomaNumeros somarNumeros = new SomaNumeros();

        somarNumeros.adicionarNumero(1);
        somarNumeros.adicionarNumero(8);
        somarNumeros.adicionarNumero(110);
        somarNumeros.adicionarNumero(20);
        somarNumeros.adicionarNumero(405);

        somarNumeros.exibirNumeros();

        System.out.println("Soma total de todos os números: " + somarNumeros.somarNumeros());

        System.out.println("Este é o maior número da lista: " + somarNumeros.encontrarMaiorNumero());
        System.out.println("Este é o menor número da lista: " + somarNumeros.encontrarMenorNumero());

    }

}
