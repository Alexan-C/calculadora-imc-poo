// para ler o que é digitado e "traduzir"
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static double lerDouble(Scanner sc, String campo) {
        try {
            double valor = sc.nextDouble();
            if (valor <= 0) {
                throw new EntradaInvalidaException(campo + " deve ser positivo!");
            }
            return valor;
        } catch (InputMismatchException e) {
            sc.nextLine(); // Limpa o buffer para não travar o teclado
            throw new EntradaInvalidaException("Digite apenas números para " + campo);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaIMC sistema = new SistemaIMC();

        // Sistema de seleção
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("1 - Calcular IMC (Pessoa Comum) |" +
                    " 2 - Calcular IMC (Atleta) |" +
                    "| 3- Exibir Histórico de Pessoas |" +
                    "| 4- Exibir Histórico de Atletas |" +
                    "| 5- Exibir Todo o histórico |" +
                    "| 0 - Sair |");
            opcao = sc.nextInt();
            sc.nextLine();

            // Opções
            switch (opcao) {
                case 1:
                    System.out.print("Nome:");
                    String nomeP = sc.nextLine();

                    System.out.println("Idade: ");
                    int idadeP = sc.nextInt();

                    System.out.print("Peso (kg): ");
                    double pesoP = lerDouble(sc, "Peso");

                    System.out.print("Altura: ");
                    double alturaP = lerDouble(sc, "Altura");

                    //Salva a lista criada
                    Pessoa p = new Pessoa(nomeP, idadeP, alturaP, pesoP, true);
                    sistema.processar(p);
                    // Para o sistema
                    break;

                case 2:
                    System.out.println("Nome do Atleta: ");
                    String nomeA = sc.nextLine();

                    System.out.println("Idade: ");
                    int idadeA = sc.nextInt();

                    System.out.println("Peso (kg): ");
                    double pesoA = lerDouble(sc, "Peso");

                    System.out.println("Altura: ");
                    double alturaA = lerDouble(sc, "Altura");

                    System.out.println("Modalidade");
                    String modalidadeA = sc.nextLine();

                    Atleta a = new Atleta(nomeA, idadeA, alturaA, pesoA, modalidadeA);
                    sistema.processar(a);
                    break;

                case 3:
                    sistema.exibirPessoas();
                    break;

                case 4:
                    sistema.exibirHistoricoAtletas();
                    break;

                case 5:
                    sistema.exibirtodoHistorico();
                    break;

                case 0:
                    System.out.println("Encerrando o Sistema...");
                    break;

                default:
                    System.out.println("Opção Inválida");
                    return;
            } // fim do switch
        } // fim do while
        sc.close();
    }
}