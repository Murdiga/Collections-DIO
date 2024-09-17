package list.Ordenacao.OrdenarNumeros;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class OrdenarNumeros {

    List<Numero> listNumeros = new ArrayList<>();


    public void adicionarNumero(int numero){

        listNumeros.add(new Numero(numero));

    }

    public List<Numero> ordenarAscendente(){

        if (listNumeros.isEmpty()) {
            throw new ListVaziaException();
        }

        Collections.sort(listNumeros);

        return listNumeros;

    }

    public List<Numero> ordenarDescendent(){

        if (listNumeros.isEmpty()) {
            throw new ListVaziaException();
        }

        Collections.sort(listNumeros, new ComparatorNumero());

        return listNumeros;

    }

    public void exibirNumeros(){

        if (listNumeros.isEmpty()) {
            throw new ListVaziaException();
        }

        System.out.println(listNumeros);

    }

    public static void main(String[] args) {
        
        OrdenarNumeros ordenarNumeros = new OrdenarNumeros();

        ordenarNumeros.adicionarNumero(15);
        ordenarNumeros.adicionarNumero(1);
        ordenarNumeros.adicionarNumero(100);
        ordenarNumeros.adicionarNumero(1500);
        ordenarNumeros.adicionarNumero(50);
        ordenarNumeros.adicionarNumero(25);

        ordenarNumeros.exibirNumeros();

        System.out.println(ordenarNumeros.ordenarAscendente());

        System.out.println(ordenarNumeros.ordenarDescendent());

    }


}
