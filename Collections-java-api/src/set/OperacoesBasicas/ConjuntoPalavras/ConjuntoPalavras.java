package set.OperacoesBasicas.ConjuntoPalavras;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavras {

    private Set<Palavra> palavraSet;

    public ConjuntoPalavras(){

        this.palavraSet = new HashSet<>();

    }

    public void adicionarPalavra(String palavra){

        palavraSet.add(new Palavra(palavra));

    }

    public void removerPalavra(String palavra){

        Palavra removePalavra = null;

        for(Palavra p : palavraSet){

            if(p.getPalavra().equals(palavra)){

                removePalavra = p;

                break;

            }

        }

        if(removePalavra != null){

            palavraSet.remove(removePalavra);

        }
        
    }

    public void verificarPalavra(String palavra){

        Palavra verificarPalavra = null;

        for(Palavra p : palavraSet){

            if(p.getPalavra().equals(palavra)){

                verificarPalavra = p;

                break;

            }

        }

        if(verificarPalavra != null){

            System.out.println("Palavra: " + verificarPalavra + " foi encontrada");

        }else{

            System.out.println("Palavra não encontrada");

        }

    }

    public void exibirPalavra(){

        System.out.println(palavraSet);

    }

    public static void main(String[] args) {

        ConjuntoPalavras conjuntoPalavras = new ConjuntoPalavras();

        conjuntoPalavras.adicionarPalavra("Garfo");
        conjuntoPalavras.adicionarPalavra("Prato");
        conjuntoPalavras.adicionarPalavra("Prato");
        conjuntoPalavras.adicionarPalavra("Cozinha");
        conjuntoPalavras.adicionarPalavra("Sala");
        conjuntoPalavras.adicionarPalavra("Mesa");

        conjuntoPalavras.exibirPalavra();

        conjuntoPalavras.verificarPalavra("Prato");

        conjuntoPalavras.removerPalavra("Prato");

        conjuntoPalavras.verificarPalavra("Prato");

        conjuntoPalavras.exibirPalavra();
        
    }

}
