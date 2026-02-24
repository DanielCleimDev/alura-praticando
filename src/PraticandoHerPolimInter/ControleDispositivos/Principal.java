package PraticandoHerPolimInter.ControleDispositivos;

import PraticandoHerPolimInter.ControleDispositivos.Modelos.ArCondicionado;
import PraticandoHerPolimInter.ControleDispositivos.Modelos.Luz;

public class Principal {
    public static void main(String[] args) {
        Luz luz = new Luz();
        ArCondicionado arCondicionado = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();
        arCondicionado.ligar();
        arCondicionado.ligar();
        arCondicionado.desligar();
        luz.desligar();
        arCondicionado.desligar();
    }
}
