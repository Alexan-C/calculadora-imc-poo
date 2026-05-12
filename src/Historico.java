// importando Lista, pois no Java não se tem por nativo as listas
import java.util.List;
import java.util.ArrayList;

// Pega a lista e coloca na memória, criando uma lista de armazenamento, podendo ser consultado se o programa nao for encerrado
public class Historico {

    // registros das pessoas comuns
    private List<String> registrosComum = new ArrayList<>();

    // registros dos atletas
    private List<String> registrosAtletas = new ArrayList<>();

    // Se der erro
    public void exibirRegistrosAtletas() {
        if (registrosAtletas.isEmpty()) {
            System.out.println("\n===Nenhum IMC encontrado ---");
            return;
        }
        // imprime os nomes mais bonitos
        System.out.println("\n=== HISTORICO DE IMC ===");
        for (String registro : registrosAtletas) {
            System.out.println(registro);
        }
    }

    // se der erro
    public void exibirRegistrosPessoas(){
            if (registrosComum.isEmpty()){
                System.out.println("\n===Nenhum IMC encontrado ---");
                return;
            }
        }
        // Imprime pessoas normais
        System.out.println("\n=== HISTORICO DE IMC ===");
        for (String registro : registrosComum) {
            System.out.println(registro);
        }
    }

