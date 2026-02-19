package PraticandoPOO1.ControleContas;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor){
        if(valor>0){
            this.saldo += valor;
            System.out.println("Depositado: " + valor + "\nSaldo atual: " + saldo);
        }else {
            System.out.println("Informe um valor válido");
        }

    }

    public void sacar(double valor){
        if (valor<=saldo) {
            if (valor>0){
                saldo -= valor;
                System.out.println("Saque de: " + valor + "\nSaldo atual: " + saldo);
            }else {
                System.out.println("Informe um valor válido");
            }
        }else {
            System.out.println("Saldo insuficiente\nSaldo atual: " + saldo);
        }

    }

    public double getSaldo() {
        return saldo;
    }
}
