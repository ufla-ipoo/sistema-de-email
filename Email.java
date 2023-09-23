/**
 * Uma classe que modela uma mensagem simples de e-mail.
 * A mensagem tem endereços remetente e destinatário e uma mensagem string.
 * 
 * Traduzido por Julio César Alves. 2023.09.22
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class Email
{
    // O remetente da mensagem
    private String remetente;
    // O destinatário da mensagem
    private String destinatario;
    // O texto da mensagem
    private String messagem;

    /**
     * Cria uma mensagem de e-mail do remente para o destinário,
     * contendo a mensagem passada.
     * @param remetente O remetente desta mensagem.
     * @param destinatario O destinatário desta mensagem.
     * @param messagem O texto da mensagem a ser enviada
     */
    public Email(String remetente, String destinatario, String messagem)
    {
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.messagem = messagem;
    }

    /**
     * @return O remetente desta mensagem.
     */
    public String obterRemetente()
    {
        return remetente;
    }

    /**
     * @return O destinatário desta mensagem.
     */
    public String obterDestinatario()
    {
        return destinatario;
    }

    /**
     * @return O texto da mensagem.
     */
    public String obterMessagem()
    {
        return messagem;
    }

    /**
     * Imprime esta mensagem de e-mail no terminal de texto.
     */
    public void imprimir()
    {
        System.out.println("De: " + remetente);
        System.out.println("Para: " + destinatario);
        System.out.println("Messagem: " + messagem);
    }
}
