
package list.Ordenacao.OrdenarPessoas;

import java.util.List;

import java.util.Collections;

import java.util.ArrayList;

public class OrdenacaoPessoa {

    List<Pessoa> listPessoa = new ArrayList<>();

    public void adicionarPessoa(String nome, Integer idade, Double altura){

        listPessoa.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordernarPorIdade(){

        List<Pessoa> pessoasPorIdade = new ArrayList<>(listPessoa);

        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;

    }

    public List<Pessoa> ordernarPorAltura(){

        List<Pessoa> pessoasPorAltura = new ArrayList<>(listPessoa);

        Collections.sort(pessoasPorAltura, new ComparatorAltura());

        return pessoasPorAltura;

    }

    public static void main(String[] args) {

        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Pessoa1", 22, 1.72);
        ordenacaoPessoa.adicionarPessoa("Pessoa2", 28, 1.75);
        ordenacaoPessoa.adicionarPessoa("Pessoa3", 25, 1.68);

        System.out.println(ordenacaoPessoa.ordernarPorIdade());
        
        ordenacaoPessoa.adicionarPessoa("Pessoa4", 55, 1.94);

        System.out.println(ordenacaoPessoa.ordernarPorIdade());

        System.out.println(ordenacaoPessoa.ordernarPorAltura());
        
    }

}
