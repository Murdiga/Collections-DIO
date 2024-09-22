package map.OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario(){

        this.dicionarioMap = new HashMap<>();

    }

    public void adicionarPalavra(String palavra, String descricao){

        dicionarioMap.put(palavra, descricao);

    }

    public void removerPalavra(String Palavra){

        if(dicionarioMap.isEmpty()){

            System.out.println("Map vazio");

        }

        dicionarioMap.remove(Palavra);

    }

    public String pesquisarPorPalavra(String palavra){

        String descricaoPorPalavra = null;

        if(dicionarioMap.isEmpty()){

            System.out.println("Map vazio");

        }

        descricaoPorPalavra = dicionarioMap.get(palavra);

        return descricaoPorPalavra;

    }

    public void exibirPalavras(){

        System.out.println(dicionarioMap);

    }

    public static void main(String[] args) {
        
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Palavra1", "Descrição1");
        dicionario.adicionarPalavra("Palavra2", "Descrição2");
        dicionario.adicionarPalavra("Palavra3", "Descrição3");
        dicionario.adicionarPalavra("Palavra4", "Descrição4");


        dicionario.exibirPalavras();
        
        dicionario.removerPalavra("Palavra4");

        dicionario.exibirPalavras();

       System.out.println("Descrição da palavra pesquisada: " + dicionario.pesquisarPorPalavra("Palavra2"));

    }

}
