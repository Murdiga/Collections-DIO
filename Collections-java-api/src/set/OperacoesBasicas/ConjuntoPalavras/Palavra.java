package set.OperacoesBasicas.ConjuntoPalavras;

import java.util.Objects;

public class Palavra {

    private String palavra;

    public Palavra(String palavra){

        this.palavra = palavra;

    }

    public String getPalavra(){

        return palavra;

    }

    public boolean equals(Object o){

        if(this == o) return true;

        if(!(o instanceof Palavra palavra)) return false;

        return getPalavra() == palavra.getPalavra();

    }

    public int hashCode(){

        return Objects.hash(getPalavra());

    }

    public String toString(){

        return "Palavra{'" + palavra + "'}";

    }

}
