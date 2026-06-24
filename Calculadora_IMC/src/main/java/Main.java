// para ler o que é digitado e "traduzir"
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    // verificação Double ou número com vírgula
    public static double lerDouble(Scanner sc, String campo) {
        try {
            double valor = sc.nextDouble();
            if (valor <= 0) {
                throw new EntradaInvalidaException(campo + " deve ser positivo!");
            }
            return valor;
        } catch (InputMismatchException e) {
            sc.nextLine(); // Limpa o buffer para não travar o teclado
            throw new EntradaInvalidaException("Digite apenas números para ou utilize a vírgula para altura " + campo);
        }
    }
    // Verificação extra Opção
    public static int lerOpcaoMenu(Scanner sc) {
        try {
            int opcao = sc.nextInt();
            sc.nextLine();
            return opcao;
        } catch (InputMismatchException e) {
            sc.nextLine();
            return -1;
        }
    }
    // Verificação Inteiro
    public static int lerInt(Scanner sc, String campo) {
        try {
            int valor = sc.nextInt();
            if (valor <= 0) {
                throw new EntradaInvalidaException(campo + " deve ser maior que zero!");
            }
            return valor;
        } catch (InputMismatchException e) {
            sc.nextLine();
            throw new EntradaInvalidaException("Digite apenas números inteiros válidos para o campo " + campo);

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaIMC sistema = new SistemaIMC();

        // Sistema de seleção
        int opcao = -1;
        while (opcao != 0) try{

            System.out.println("-----------------------------------------");
            System.out.println("       SISTEMA CALCULADORA DE IMC        ");
            System.out.println("-----------------------------------------");
            System.out.println("| 1 - Calcular IMC (Pessoa) |");
            System.out.println("| 2 - Calcular IMC (Atleta)       |");
            System.out.println("| 3 - Exibir histórico (Pessoa)    |");
            System.out.println("| 4 - Exibir histórico (Atleta)    |");
            System.out.println("| 5 - Exibir Todo o Histórico     |");
            System.out.println("| 0 - Sair                        |\n");
            System.out.print("Escolha uma opção: ");

            opcao = lerOpcaoMenu(sc);


            // Opções
            switch (opcao) {
                case 1:
                    System.out.println("\n--- CADASTRO: PESSOA COMUM ---");
                    System.out.print("Nome: ");
                    String nomeP = sc.nextLine();

                    System.out.print("Idade: ");
                    int idadeP = lerInt(sc, "Idade");

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
                    System.out.println("\n--- CADASTRO: ATLETA ---");
                    System.out.print("Nome do Atleta: ");
                    String nomeA = sc.nextLine();

                    System.out.print("Idade: ");
                    int idadeA = lerInt(sc, "Idade");

                    System.out.print("Peso (kg): ");
                    double pesoA = lerDouble(sc, "Peso");

                    System.out.print("Altura: ");
                    double alturaA = lerDouble(sc, "Altura");
                    sc.nextLine();

                    double alturaQuadradoA = CalculadoraRecursiva.potencia(alturaA, 2);
                    System.out.printf("[Recursão] Altura do Atleta ao quadrado: %.4fm²\n", alturaQuadradoA);

                    System.out.print("Modalidade: ");
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
                    System.out.print("Encerrando o Sistema...");
                    break;

                default:
                    System.out.print("Opção Inválida\n");
                    break;
            } // fim do switch
        }catch (EntradaInvalidaException e){
            System.out.println("Erro ao processar o IMC: " + e.getMessage());
        }
        sc.close();
    }
}