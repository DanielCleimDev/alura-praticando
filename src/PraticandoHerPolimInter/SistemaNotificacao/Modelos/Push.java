package PraticandoHerPolimInter.SistemaNotificacao.Modelos;

public class Push extends Notificacao{
    private String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    public void enviar() {
        System.out.printf(
                "Enviando Push para: %s  \n" +
                "Título: %s  \n" +
                "Conteúdo: %s ",
                getDestinatario(), titulo, getMensagem()
        );
    }
}
