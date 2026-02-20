package PraticandoHerPolimInter.SistemaNotificacao.Modelos;

public class Sms extends Notificacao {
    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.printf(
                "Enviando SMS para: %s  \n" +
                "Mensagem: %s  \n",
                getDestinatario(), getMensagem()
        );
    }
}
