public class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente titular;
    
    // Construtor padrão
    public Conta() {
    }
    
    // Construtor com parâmetros
    public Conta(int numeroConta, double saldo, Cliente titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    // Método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado no valor de: " + valor);
    }
    
    // Método para realizar saque
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado no valor de: " + valor);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }
    
    // Método para exibir o saldo da conta
    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
