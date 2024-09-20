package set.Ordenacao.ListaAlunos;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

    @Override
    public int compareTo(Aluno a) {
        
        return nome.compareToIgnoreCase(a.getNome());

    }

    public boolean equals(Object o){

        if(this == o) return true;

        if(!(o instanceof Aluno aluno))return false;

        return getMatricula() == aluno.getMatricula();

    }

    public int hashCode(){

        return Objects.hash(getMatricula());

    }

    private String nome;

    private Long matricula;

    private double media;

    public Aluno(String nome, Long matricula, double media){

        this.nome = nome;

        this.matricula = matricula;

        this.media = media;

    }

    public String getNome(){

        return nome;

    }

    public Long getMatricula(){

        return matricula;

    }

    public Double getMedia(){

        return media;

    }

    public String  toString(){

        return "\nAluno{Nome: '" + nome +
        "', Matricula: '" + matricula + 
        "', Media: '" + media + "'}";

    }

}
