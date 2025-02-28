import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente1 = new Cliente("Maria Silva", "123.456.789-00", "maria.silva@email.com");
        cliente1.mostrarDados();
        
        // Criando uma conta para o cliente
        Conta conta1 = new Conta("1001", 5000.0, cliente1);
        conta1.exibirSaldo();
        conta1.depositar(1500.0);
        conta1.sacar(2000.0);
        conta1.exibirSaldo();
        
        // Processando uma transação
        Transacao transacao1 = new Transacao(new Date(), 1500.0, "Depósito");
        transacao1.processarTransacao();
        
        // Realizando um investimento
        Investimento investimento1 = new Investimento("Renda Fixa", 10000.0, 0.05);
        investimento1.calcularRetorno();
    }
}
