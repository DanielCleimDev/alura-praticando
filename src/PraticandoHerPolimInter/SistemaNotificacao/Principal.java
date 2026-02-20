package PraticandoHerPolimInter.SistemaNotificacao;

import PraticandoHerPolimInter.SistemaNotificacao.Modelos.Email;
import PraticandoHerPolimInter.SistemaNotificacao.Modelos.Push;
import PraticandoHerPolimInter.SistemaNotificacao.Modelos.Sms;

public class Principal {
    public static void main(String[] args) {
        Email email=new Email("daneil@cleim.com", "Testando mensagem", "Testando");
        email.enviar();

        Sms sms =new Sms( "(11) 3356-6548", "Fatura disponível");
        sms.enviar();

        Push push = new Push("novo_usuario", "Seja bem vindo a nossa Comunidade!", "Bem Vindo" );
        push.enviar();
    }
}
