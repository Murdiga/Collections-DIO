package set.Ordenacao.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {

        this.alunoSet = new HashSet<>();

    }

    public void adicionarAluno(String nome, Long matricula, double media) {

        alunoSet.add(new Aluno(nome, matricula, media));

    }

    public void removerAluno (Long matricula){

        Aluno removerAluno = null;

        if(alunoSet.isEmpty()){

            System.out.println("Lista está vazia");

        }

        for(Aluno a : alunoSet){

            if(a.getMatricula() == matricula){

                removerAluno = a;

                break;

            }

        }

        alunoSet.remove(removerAluno);

    }

    public Set<Aluno> exibirAlunosPorNome() {

        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);

        return alunosPorNome;

    }

    public Set<Aluno> exibirAlunosPorNota() {

        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());

        alunosPorNota.addAll(alunoSet);

        return alunosPorNota;

    }

    public void exibirAluno() {

        System.out.println(alunoSet);

    }

    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno1", 1L, 8.5);
        gerenciadorAlunos.adicionarAluno("Alunos2", 5L, 7);
        gerenciadorAlunos.adicionarAluno("Alunos3", 5L, 5.5);
        gerenciadorAlunos.adicionarAluno("Alunos4", 2L, 9.5);
        gerenciadorAlunos.adicionarAluno("Alunos5", 10L, 10);

        gerenciadorAlunos.exibirAluno();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(10L);

        gerenciadorAlunos.exibirAluno();

    }

}
