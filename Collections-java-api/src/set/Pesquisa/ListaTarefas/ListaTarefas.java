package set.Pesquisa.ListaTarefas;

import java.util.Set;
import java.util.HashSet;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){

        this.tarefaSet = new HashSet<>();

    }

    public void adicionarTarefa(String descricao, boolean tarefaConcluida){

        tarefaSet.add(new Tarefa(descricao, tarefaConcluida));

    }

    public void removerTarefa(String descricao){

        Tarefa removerTarefa = null;

        if(tarefaSet.isEmpty()){

            throw new SetVazioException();

        }

        for(Tarefa t : tarefaSet){

            if(t.getDescricao() == descricao){

                removerTarefa = t;

                break;

            }

        }

        tarefaSet.remove(removerTarefa);

    }

    public Set<Tarefa> obterTarefasConcluidas(){

        Set<Tarefa> tarefasConcluidasSet = new HashSet<>();

        if(tarefaSet.isEmpty()){

            throw new SetVazioException();

        }

        for(Tarefa t : tarefaSet){

            if(t.getTarefaConcluida() == true){

                tarefasConcluidasSet.add(t);

            }

        }

        return tarefasConcluidasSet;

    }

    public Set<Tarefa> obterTarefasPendentes(){

        Set<Tarefa> tarefasPendentesSet = new HashSet<>();

        if(tarefaSet.isEmpty()){

            throw new SetVazioException();

        }

        for(Tarefa t : tarefaSet){

            if(t.getTarefaConcluida() == false){

                tarefasPendentesSet.add(t);

            }

        }

        return tarefasPendentesSet;
    }

    public Tarefa marcarTarefaConcluida(String descricao){

        Tarefa atualizarParaConcluido = null;

        if(tarefaSet.isEmpty()){

            throw new SetVazioException();

        }

        for(Tarefa t : tarefaSet){

            if(t.getDescricao().equalsIgnoreCase(descricao)){

                t.setStatusTarefa(true);

                atualizarParaConcluido = t;

                break;

            }

        }

        return atualizarParaConcluido;

    }

    public Tarefa marcarTarefaPendente(String descricao){

        Tarefa atualizarParaPendente = null;

        if(tarefaSet.isEmpty()){

            throw new SetVazioException();

        }

        for(Tarefa t : tarefaSet){

            if(t.getDescricao().equals(descricao)){

                t.setStatusTarefa(false);

                atualizarParaPendente = t;

                break;

            }

        }

        return atualizarParaPendente;
    }

    public void limparTarefas(){

        if(tarefaSet.isEmpty()){

            throw new SetVazioException();

        }

        tarefaSet.clear();

    }

    public int contarTarefas(){

        return tarefaSet.size();

    }

    public void exibirTarefas(){

        System.out.println(tarefaSet);

    }

    public static void main(String[] args) {
        
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Tarefa1", false);
        listaTarefas.adicionarTarefa("Tarefa2", true);
        listaTarefas.adicionarTarefa("Tarefa3", false);
        listaTarefas.adicionarTarefa("Tarefa4", true);

        listaTarefas.exibirTarefas();

        System.out.println("Você possui: " + listaTarefas.contarTarefas() + " tarefas");

        System.out.println("Concluidas:" + listaTarefas.obterTarefasConcluidas());

        System.out.println("Pendentes:" + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaConcluida("Tarefa3");

        System.out.println("Concluidas:" + listaTarefas.obterTarefasConcluidas());

        listaTarefas.marcarTarefaPendente("Tarefa2");

        System.out.println("Pendentes:" + listaTarefas.obterTarefasPendentes());

        listaTarefas.limparTarefas();

        System.out.println("Você possui: " + listaTarefas.contarTarefas() + " tarefas");

    }

}
