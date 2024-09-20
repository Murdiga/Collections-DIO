package set.Pesquisa.AgendaContatos;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos(){

        this.contatoSet = new HashSet<>();

    }

    public void adicionarContato(String nome, int numero){

        contatoSet.add(new Contato(nome, numero));

    }

    public Set<Contato> pesquisarNome(String nome){
        
        Set<Contato> contatosNome = new HashSet<>();
        
        for(Contato c : contatoSet){

            if(c.getNome().startsWith(nome)){

                contatosNome.add(c);

            }

        }

        return contatosNome;
    }

    public Contato atualizarContato(String nome, int novoNumero){

        Contato contatoAtualizado = null;

        for(Contato c : contatoSet){

            if(c.getNome().equalsIgnoreCase(nome)){

                c.setNumero(novoNumero);

                contatoAtualizado = c;

                break;

            }

        }

        return contatoAtualizado;

    }

    public void exibirContato(){

        System.out.println(contatoSet);

    }

    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila Silva", 1234567);
        agendaContatos.adicionarContato("Martina Silva", 7654321);
        agendaContatos.adicionarContato("Camila Oliveira", 2345671);
        agendaContatos.adicionarContato("Camila Amaral", 345671);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarNome("Camila"));

        agendaContatos.atualizarContato("Martina Silva", 6712345);

        agendaContatos.exibirContato();

    }

}
