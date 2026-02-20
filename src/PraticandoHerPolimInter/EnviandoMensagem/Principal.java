package PraticandoHerPolimInter.EnviandoMensagem;

public class Principal {
    public static void main(String[] args) {
        Mensagem mensagem = new Mensagem();
        mensagem.enviarMensagem("Olá!");
        mensagem.enviarMensagem("Bruno", "Oi!");
        mensagem.enviarMensagem("Beto", "Atenção!", 3);
    }
}
