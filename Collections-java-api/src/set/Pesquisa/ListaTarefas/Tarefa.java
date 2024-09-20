package set.Pesquisa.ListaTarefas;

public class Tarefa {

    private String descricao;

    private boolean tarefaConcluida;


    public Tarefa (String descricao, boolean tarefaConcluida){

        this.descricao = descricao;

        this.tarefaConcluida = tarefaConcluida;

    }

    public String getDescricao(){

        return descricao;

    }

    public void setStatusTarefa(boolean tarefaConcluida){

        this.tarefaConcluida = tarefaConcluida;

    }

    public boolean getTarefaConcluida(){

        return tarefaConcluida;

    }

    public String toString(){

        return "\nTarefa{Descrição: ['" + descricao + "']"
        + ", Status concluido: ['" + tarefaConcluida + "']}";

    }

}
