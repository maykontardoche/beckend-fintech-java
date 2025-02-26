public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    
    // Construtor padrão
    public Cliente() {
    }
    
    // Construtor com parâmetros
    public Cliente(int id, String nome, String cpf, String email) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }
    
    // Método para exibir os dados do cliente
    public void mostrarDados() {
        System.out.println("Exibindo dados do cliente: " + nome + ", CPF: " + cpf + ", Email: " + email);
    }
    
    // Método para atualizar o email do cliente
    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
        System.out.println("Atualizando email para: " + novoEmail);
    }
}
