public class SistemaIMC {
// cria um histórico e toda vez que adiciona um nome ele salva ao inves de ficar criando outra lista
    private final Historico historico = new Historico();
    public void processar(Pessoa pessoa) {

       // Proteção se caso a pessoa não estiver ativa
        if (!pessoa.isAtivo()){
            System.out.println("\nAviso: Não é possivel cadastrar o IMC de um inativo!\n");
            return;
        }

        double imc = pessoa.calcularIMC(pessoa.getPeso(), pessoa.getAltura());
        String classe = pessoa.mostrarIMC(imc);

        // formatação do nome
        String linha = String.format("\n%s (%d anos) --> IMC: %.2f (%s)", pessoa.getNome(),
                pessoa.getIdade(),
                imc,
                classe);
        // Se for atleta
        if (pessoa instanceof Atleta atleta) {
            linha += "| Modalidade: "  + atleta.getModalidade();
            historico.adicionarAtleta(linha);
        // se for pessoa normal
        }else {
            historico.adicionarComum(linha);
        }

        System.out.println(linha);
    }

    public void exibirHistoricoAtletas() {
        historico.exibirRegistrosAtletas();

    }
    public void exibirPessoas() {
        historico.exibirRegistrosPessoas();
    }
    public void exibirtodoHistorico() {
        historico.exibirRegistrosPessoas();
        historico.exibirRegistrosAtletas();
    }
}
