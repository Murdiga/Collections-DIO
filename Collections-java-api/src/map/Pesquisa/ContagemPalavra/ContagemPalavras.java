package map.Pesquisa.ContagemPalavra;

import java.util.Map;
import java.util.HashMap;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavraMap;

    public ContagemPalavras (){

        this.contagemPalavraMap = new HashMap<>();

    }

    public void adicionarPalavra(String palavra, Integer contagem){

        contagemPalavraMap.put(palavra, contagem);

    }

    public void removerPalavra(String palavra){

        if (contagemPalavraMap.isEmpty()) {
            
            System.out.println("Map vazio");

        }

        contagemPalavraMap.remove(palavra);

    }

    public String encontrarPalavraMaisFrequente(){

        String palavarMaisFrequente = null;

        int maiorContagem = 0;
        
        if (contagemPalavraMap.isEmpty()) {
            
            System.out.println("Map vazio");

        }

        for(Map.Entry<String, Integer> entry : contagemPalavraMap.entrySet()){

            if(entry.getValue() > maiorContagem){

                maiorContagem = entry.getValue();
                
                palavarMaisFrequente = entry.getKey();

            }

        }

        return palavarMaisFrequente;

    }

    public void exibirContagemPalavras(){

        System.out.println(contagemPalavraMap);

    }

    public static void main(String[] args) {

        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Java", 10);
        contagemPalavras.adicionarPalavra("C#", 3);
        contagemPalavras.adicionarPalavra("Python", 6);
        contagemPalavras.adicionarPalavra("PHP", 7);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Python");

        contagemPalavras.exibirContagemPalavras();

        System.out.println("Palavra mais frequente: " + contagemPalavras.encontrarPalavraMaisFrequente());
        
    }

}
