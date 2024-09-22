package map.Ordenacao.LivrariaOnline;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorPreco implements Comparator<Map.Entry<Long, Livro>>{

    @Override
    public int compare(Map.Entry<Long, Livro> entry1, Map.Entry<Long, Livro> entry2) {

        return Double.compare(entry1.getValue().getPreco(), entry2.getValue().getPreco());
        
    }

}
