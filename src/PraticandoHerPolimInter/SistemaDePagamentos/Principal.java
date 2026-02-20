package PraticandoHerPolimInter.SistemaDePagamentos;

import PraticandoHerPolimInter.SistemaDePagamentos.Modelos.BoletoBancario;
import PraticandoHerPolimInter.SistemaDePagamentos.Modelos.CartaoCredito;
import PraticandoHerPolimInter.SistemaDePagamentos.Modelos.Pix;

public class Principal {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito(250);
        cartaoCredito.confirmarPagamento();

        BoletoBancario boletoBancario = new BoletoBancario(500);
        boletoBancario.confirmarPagamento();

        Pix pix =new Pix(300);
        pix.confirmarPagamento();
    }
}
