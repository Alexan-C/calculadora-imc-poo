// extende de atleta podendo mudar
public class Atleta extends Pessoa {
  // isso que torna ele diferente
    private final String modalidade;


    // diferencia dos demais incluindo modalidade
    public Atleta(String nome, int idade , double peso, double altura, String modalidade) {
        super(nome, idade, peso, altura, true);
        this.modalidade = modalidade;
    }
    // calcula o IMC e volta para a interface pra poder ter um melhor controle
    @Override
    public String mostrarIMC(double imc){
        if (imc < 20.0 )return "Abaixo do peso ideal para o Atleta";
        else if (imc < 27.0)  return "Peso ideal para o Atleta";
        else  return "Acima do Peso ideal para o Atleta";

    }
    // retorna modadlidade
    @Override
    public String exibirPerfil(){
        return super.exibirPerfil() + "| Modalidade: " + modalidade;
    }

    // retorna a modalidade para outros lugares do sistema caso precise
    public String getModalidade() {return modalidade;}
}
