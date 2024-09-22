package map.OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){

        this.agendaContatoMap = new HashMap<>();

    }

    public void adicionarContato(String nome, Integer telefone){

        agendaContatoMap.put(nome, telefone);

    }

    public void removerContato(String nome){

        if(agendaContatoMap.isEmpty()){

            System.out.println("Map está vazia");

        }

        agendaContatoMap.remove(nome);

    }

    public Integer pesquisarPorNome(String nome){

        Integer numeroPorNome = null;

        if(agendaContatoMap.isEmpty()){

            System.out.println("Map está vazia");

        }

        numeroPorNome = agendaContatoMap.get(nome);

        return numeroPorNome;

    }

    public void exibirContatos(){

        System.out.println(agendaContatoMap);

    }

    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Telefone1", 998172);
        agendaContatos.adicionarContato("Telefone2", 998271);
        agendaContatos.adicionarContato("Telefone3", 998721);
        agendaContatos.adicionarContato("Telefone4", 997812);
        agendaContatos.adicionarContato("Telefone1", 444444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Telefone1");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Telefone4"));

    }

}
