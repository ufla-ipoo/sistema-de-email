/**
 * Uma classe que modela um cliente de e-mail simples.
 * O cliente é executado por um usuário específico, e envia e
 * recebe e-mails através de um servidor específico.
 * 
 * Traduzido por Julio César Alves. 2023-09-22
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class ClienteDeEmail
{
    // O servidor usar para enviar e receber e-mails.
    private ServidorDeEmail servidor;
    // O usuário que está rodando este cliente.
    private String usuario;

    /**
     * Cria uma execução de cliente de e-mail pelo usuário e 
     * ligado ao servidor passado.
     */
    public ClienteDeEmail(ServidorDeEmail servidor, String usuario)
    {
        this.servidor = servidor;
        this.usuario = usuario;
    }

    /**
     * Retorna a próxima mensagem de e-mail do servidor, se houver.
     */
    public Email obterProximoEmail()
    {
        return servidor.obterProximoEmail(usuario);
    }

    /**
     * Imprime no terminal de texto a próxima mensagem de e-mail 
     * deste usuário, se houver.
     */
    public void imprimirProximoEmail()
    {
        Email email = servidor.obterProximoEmail(usuario);
        if(email == null) {
            System.out.println("Não há novos e-mails.");
        }
        else {
            email.imprimir();
        }
    }

    /**
     * Envia a mensagem passada para o destinatário passado
     * usando o servidor de e-mail.
     * @param destinatario O destinatário da mensagem.
     * @param messagem O texto da mensagem a ser enviada.
     */
    public void enviarEmail(String destinatario, String messagem)
    {
        Email email = new Email(usuario, destinatario, messagem);
        servidor.postar(email);
    }
}
