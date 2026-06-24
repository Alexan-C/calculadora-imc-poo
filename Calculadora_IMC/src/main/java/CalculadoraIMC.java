
public interface CalculadoraIMC {

    // Recebe o IMC calculado
    double calcularIMC(double peso, double altura);

    // Devolve o peso no caso da MAIN se a pessoa está com peso normal e etc
    String classificarIMC(double imc);
}
