package PraticandoPOO1.ZerandoSaldo;

public class Saldo {
    double saldo;

    public Saldo(double saldo) {
        this.saldo = saldo;
    }

    public void zeraSaldo(){
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }
}
