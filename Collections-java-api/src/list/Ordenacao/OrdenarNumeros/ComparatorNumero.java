package list.Ordenacao.OrdenarNumeros;

import java.util.Comparator;

public class ComparatorNumero implements Comparator<Numero>{

    public int compare(Numero n1, Numero n2){

        Integer.compare(n1.getNumero(), n2.getNumero());

        return n2.compareTo(n1);

    }

}
