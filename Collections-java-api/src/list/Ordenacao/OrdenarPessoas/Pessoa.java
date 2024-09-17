package list.Ordenacao.OrdenarPessoas;

public class Pessoa implements Comparable<Pessoa>{

    
    @Override
    public int compareTo(Pessoa p) {

        return Integer.compare(idade, p.getIdade());

    }

    private String nome;

    private Integer idade;

    private Double altura;

    public Pessoa (String nome, Integer idade, Double altura){
        
        this.nome = nome;

        this.idade = idade;

        this.altura = altura;
    }

    public String getNome(){

        return nome;

    }

    public Integer getIdade(){

        return idade;

    }

    public Double getAltura(){

        return altura;

    }

    public String toString(){

        return "\nPessoa{'Nome: " + nome + "'"
        + ", 'Idade: " + idade + "'"
        + ", 'Altura: " + altura + "'}";

    }

}
