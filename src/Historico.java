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
            System.out.println("\n=== Nenhum IMC de Atleta encontrado ===");
            return;
        }
        System.out.println("\n=== HISTORICO DE IMC (ATLETAS) ===");
        for (String registro : registrosAtletas) {
            System.out.println(registro);
        }
    }

   // Exibe Pessoas
    public void exibirRegistrosPessoas() {
        if (registrosComum.isEmpty()) {
            System.out.println("\n=== Nenhum IMC de Pessoa Comum encontrado ===");
            return; // Para a execução aqui se estiver vazia
        }

        // CORREÇÃO AQUI: O for precisa estar perfeitamente alinhado dentro do método
        System.out.println("\n=== HISTORICO DE IMC (PESSOAS COMUNS) ===");
        for (String registro : registrosComum) {
            System.out.println(registro);
        }
    }
}


