public class CalculadoraRecursiva {
    public static double potencia(double base, double exp) {
        if (exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }
}
