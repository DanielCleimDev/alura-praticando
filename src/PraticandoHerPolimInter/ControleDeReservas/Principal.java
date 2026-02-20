package PraticandoHerPolimInter.ControleDeReservas;

import PraticandoHerPolimInter.ControleDeReservas.Modelos.Reserva;
import PraticandoHerPolimInter.ControleDeReservas.Modelos.ReservaVip;

public class Principal {
    public static void main(String[] args) {
        Reserva reserva = new Reserva();
        reserva.reservar();
        reserva.reservar("10/07");
        reserva.reservar("10/8", 5);

        ReservaVip reservaVip =new ReservaVip();
        reservaVip.reservar();
    }
}
