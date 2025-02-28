public class Conta {
    private String numeroConta;
    private double saldo;
    private Cliente titular;

    // Construtor padrão
    public Conta() {
    }
    
    // Construtor com parâmetros
    public Conta(String numeroConta, double saldo, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }


    // Método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("Depósito realizado no valor de: %.2f \n" ,valor);
    }
    
    // Método para realizar saque
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque realizado no valor de: %.2f \n" , valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    
    // Método para exibir o saldo da conta
    public void exibirSaldo() {
        System.out.printf("Cliente: %s | Saldo Atual: %.2f \n", titular, saldo);
    }
}
