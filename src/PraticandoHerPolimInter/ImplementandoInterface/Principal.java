package PraticandoHerPolimInter.ImplementandoInterface;

import PraticandoHerPolimInter.ImplementandoInterface.Modelos.Relatorio;

public class Principal {
    public static void main(String[] args) {
        Relatorio relatorio = new Relatorio("Controle Financeiro", "Saldo positivo!");
        relatorio.imprimir();
    }
}
