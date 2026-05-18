//  Pessoa independe se é atleta ou não é a "base"

// Pessoa Base = podem herdar isso, mas não fica no publico em geral
public abstract class PessoaBase {
    protected String nome;
    protected int idade;


    // Garante que ninguem crie uma pessoa vazia ou inválida
    public PessoaBase(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

    }

    // Todo mundo tem, mas pode cada um fazer do seu jeito
    public abstract String exibirPerfil();

    // chamar o nome da pessoa e a Idade
    public String getNome() {return nome;}
    public int getIdade() { return idade; }
}
