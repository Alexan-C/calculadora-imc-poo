// Este arquivo é para a pessoa normal não se tratando do Atleta

//  Em resumo está chamando a PessoaBasel, e adicionado altura e peso(Diferenciando do atleta) e implementendo a calculadora (O método que colocamos no Calculadora.java)

public class Pessoa extends PessoaBase implements CalculadoraIMC{

    private double altura;
    private double peso;
    private final boolean ativo;

    public Pessoa(String nome, int idade, double altura, double peso,  boolean ativo) {
        super(nome, idade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        this.ativo = ativo;
    }

    public double getPeso() {return peso;}
    public double getAltura() {return altura;}
    public boolean isAtivo() {return ativo; }

// Verificação, vê se a pessoa vai colocar ou não um número válido
    public void setPeso(double peso) {
        if (peso <= 0) throw new IllegalArgumentException("Peso deve ser potivo!");
        this.peso = peso;
    }
    public void setAltura(double altura) {
        if (altura <= 0) throw new IllegalArgumentException("Altura deve ser potivo!");
        this.altura = altura;
    }
    public void setIdade(int idade) {
        if (idade <= 0) throw new IllegalArgumentException("Idade deve ser potivo!");
    }


    // retorna a calculaIMC
    @Override
    public double calcularIMC(double peso, double altura){
        if (altura > 0 && peso > 0 && ativo){
            double alturaAoQuadrado = CalculadoraRecursiva.potencia(altura, 2);
            return peso / alturaAoQuadrado;
        }
        return 0;
    }
    @Override
    public String mostrarIMC(double imc) {
        if      (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25.0) return "Peso normal";
        else if (imc < 30.0) return "Sobrepeso";
        else if (imc < 35.0) return "Obesidade grau I";
        else if (imc < 40.0) return "Obesidade grau II";
        else  return "Obesidade grau III";
    }
    @Override
    public String exibirPerfil() {
        return "Pessoa: " + nome + " | Idade: " + idade +
                " | Peso: " + peso + "kg | Altura: " + altura + "m";
    }
}

