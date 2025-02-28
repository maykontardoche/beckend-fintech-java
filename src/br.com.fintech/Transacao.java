import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;


public class Transacao {
    private UUID idTransacao = UUID.randomUUID();
    private Date dataRegistro = new Date();
    private Date dataTransacao;
    private double valor;
    private String tipo; // "Depósito", "Saque", "Transferência"

    // Construtor padrão
    public Transacao() {
    }
    
    // Construtor com parâmetros
    public Transacao(Date dataTransacao, double valor, String tipo) {
        this.dataTransacao = dataTransacao;
        this.valor = valor;
        this.tipo = tipo;
    }
    // Método para Converter data e Hora no padrão brasileiro
    private String converterDataHora(Date data){
        var formatarData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return formatarData.format(data);

    }

    // Método para processar a transação
    public void processarTransacao() {
        System.out.printf("Transação ID: %s | Tipo: %s | Valor: R$ %.2f | Data:%s  | Registrado em: %s %n",
                idTransacao, tipo, valor, converterDataHora(dataTransacao), converterDataHora(dataRegistro));
    }

}
