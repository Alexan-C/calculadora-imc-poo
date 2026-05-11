// Este arquivo é para a pessoa normal não se tratando do Atleta

//  Em resumo está chamando a PessoaBasel, e adicionado altura e peso(Diferenciando do atleta) e implementendo a calculadora (O método que colocamos no Calculadora.java)

public class Pessoa extends PessoaBase implements CalculadoraIMC{

    private double altura;
    private double peso;
    private boolean ativo;

    public Pessoa(String nome, int idade, double altura, double peso, boolean ativo) {
        super(nome, idade);
        this.altura = altura;
        this.peso = peso;
        this.ativo = ativo;

    }
    public double getPeso() {return peso;}
    public double getAltura() {return altura;}
    public boolean isAtivo() {return ativo;}

// Verificação, vê se a pessoa vai colocar ou não um número válido
    public void setPeso(double peso) {
        if (peso <= 0) throw new IllegalArgumentException("Peso deve ser potivo!");
        this.peso = peso;
    }
    public void setAltura(double altura) {
        if (altura <= 0) throw new IllegalArgumentException("Altura deve ser potivo!");
        this.altura = altura;
    }


    // retorna a calculaIMC
    @Override
    public double calcularIMC(){
        if (altura > 0 && peso > 0 && ativo){
            return peso / (altura * altura);
        }
        return 0;
    }
    @
}
