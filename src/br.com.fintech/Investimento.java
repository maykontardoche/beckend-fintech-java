import java.util.UUID;

public class Investimento {
    private UUID idInvestimento = UUID.randomUUID();
    private String tipoInvestimento; // Ex: "Renda Fixa", "Renda Variável"
    private double montante;
    private double taxaJuros;
    
    // Construtor padrão
    public Investimento() {
    }
    
    // Construtor com parâmetros
    public Investimento(String tipoInvestimento, double montante, double taxaJuros) {
        this.tipoInvestimento = tipoInvestimento;
        this.montante = montante;
        this.taxaJuros = taxaJuros;
    }

    // Método para simular o cálculo do retorno do investimento
    public void calcularRetorno() {
        System.out.printf("Calculando retorno para investimento de: %s | com montante de: %.2f \n", tipoInvestimento, montante );
    }
}
