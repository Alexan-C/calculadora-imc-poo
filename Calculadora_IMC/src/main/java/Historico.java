// importando Lista, pois no Java não se tem por nativo as listas
import java.util.List;
import java.util.ArrayList;

// Pega a lista e coloca na memória, criando uma lista de armazenamento, podendo ser consultado se o programa nao for encerrado
public class Historico {

    // registros das pessoas comuns
    private final List<String> registrosComum = new ArrayList<>();

    // registros dos atletas
    private final List<String> registrosAtletas = new ArrayList<>();

    // Salva Pessoas comuns
    public void adicionarComum(String registro){
        registrosComum.add(registro);
    }

    // Salva Atletas
    public void adicionarAtleta(String registro){
        registrosAtletas.add(registro);
    }

    // Exibe Atletas
    public void exibirRegistrosAtletas() {

        if (registrosAtletas.isEmpty()) {
            System.out.println("\n======= Nenhum IMC de Atleta encontrado =======\n");
            return;
        }
        System.out.println("\n======= HISTORICO DE IMC (ATLETAS) =======\n");
        for (String registro : registrosAtletas) {
            System.out.println(registro);
        }
        System.out.println();
    }

   // Exibe Pessoas
    public void exibirRegistrosPessoas() {
        if (registrosComum.isEmpty()) {
            System.out.println("\n======= Nenhum IMC de Pessoa encontrado =======\n");
            return; // Para a execução aqui se estiver vazia
        }

        System.out.println("\n======= HISTORICO DE IMC (PESSOAS) =======\n");
        for (String registro : registrosComum) {
            System.out.println(registro);
        }
        System.out.println();
    }
    // Exibe TODOS os REGISTROS
    public void exibirRegistros() {
        if (registrosComum.isEmpty() && registrosAtletas.isEmpty()) {
            System.out.println("\n======= Nenhum IMC encontrado no histórico =======\n");
            return;
        }
        List<String> listaCompleta = new ArrayList<>();
        listaCompleta.addAll(registrosComum);
        listaCompleta.addAll(registrosAtletas);

        System.out.println("\n======= HISTÓRICO GERAL DE IMC =======");
        for (String registro : listaCompleta) {
            System.out.println(registro);
        }
        System.out.println("==================================================\n");
    }
}


