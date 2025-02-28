import java.util.UUID;

public class Cliente {
    private UUID id = UUID.randomUUID();
    private String nome;
    private String cpf;
    private String email;
    
    // Construtor padrão
    public Cliente() {
    }
    
    // Construtor com parâmetros
    public Cliente(String nome, String cpf, String email) {
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
    // Sobrescrito o método toString para retonar informações do cliente.
    @Override
    public String toString() {
        return String.format("%s, cpf: %s, e-mail: %s",nome, cpf, email);
    }
}
