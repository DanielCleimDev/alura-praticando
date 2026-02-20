package PraticandoHerPolimInter.SistemaBancario;

import PraticandoHerPolimInter.SistemaBancario.Modelos.Deposito;
import PraticandoHerPolimInter.SistemaBancario.Modelos.OperacaoBancaria;
import PraticandoHerPolimInter.SistemaBancario.Modelos.Saque;

public class Principal {
    public static void main(String[] args) {
        OperacaoBancaria deposito = new Deposito(350);
        deposito.executar();

        OperacaoBancaria saque = new Saque(750.50);
        saque.executar();
    }
}
