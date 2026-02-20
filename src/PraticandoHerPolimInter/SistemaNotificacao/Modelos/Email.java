package PraticandoHerPolimInter.SistemaNotificacao.Modelos;

public class Email extends Notificacao{
    private String assunto;

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.printf(
                "Enviando Email para: %s\n" +
                "Assunto: %s\n" +
                "Corpo: %s.\n",
                getDestinatario(), assunto, getMensagem()
        );
    }
}
