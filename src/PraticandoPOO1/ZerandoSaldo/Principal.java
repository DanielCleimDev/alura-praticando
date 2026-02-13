package PraticandoPOO1.ZerandoSaldo;

public class Principal {
    public static void main(String[] args) {
        Saldo saldo = new Saldo(335.37);
        System.out.println("Saldo: " + saldo.getSaldo());
        System.out.println("Zerando Saldo" );
        saldo.zeraSaldo();
        System.out.println("Saldo Atual: " + saldo.getSaldo());

    }
}
