package PraticandoHerPolimInter.EnviandoMensagem;

public class Mensagem {
    public void enviarMensagem(String mensagem){
        System.out.printf("Mensagem enviada para todos: %s\n", mensagem);
    }
    public void enviarMensagem(String usuario, String mensagem){
        System.out.printf("Mensagem para %s: %s\n", usuario, mensagem);
    }

    public void enviarMensagem(String usuario, String mensagem, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Mensagem para %s: %s\n", usuario, mensagem);
        }
    }
}
