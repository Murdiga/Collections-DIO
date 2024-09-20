package set.OperacoesBasicas.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){

        this.convidadoSet = new HashSet<>();

    }

    public void adicionarConvidade(String nome, int codigoConvite){

        convidadoSet.add(new Convidado(nome, codigoConvite));

    }

    public void removerConvidadoConvite(int codigoConvite){

        Convidado removerConvidado = null;

        for(Convidado c : convidadoSet){

            if(c.getCodigoConvite() == codigoConvite){

                removerConvidado = c;

                break;

            }

        }

        convidadoSet.remove(removerConvidado);

    }

    public int contarConvidados(){

        return convidadoSet.size();

    }

    public void exibirConvidados(){

        System.out.println(convidadoSet);

    }

    public static void main(String[] args) {
        
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " em nosso set no momento");

        conjuntoConvidados.adicionarConvidade("Joaozinho", 12345);
        conjuntoConvidados.adicionarConvidade("Joaozinho2", 12345);
        conjuntoConvidados.adicionarConvidade("Leonildo", 54321);
        conjuntoConvidados.adicionarConvidade("Leandro", 24351);
        conjuntoConvidados.adicionarConvidade("House", 32541);

        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " em nosso set no momento");

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoConvite(12345);

        System.err.println("Existem: " + conjuntoConvidados.contarConvidados() + " em nosso set no momento");

        conjuntoConvidados.exibirConvidados();

    }

}
