package PraticandoPOO1.ControleContas;

public class Principal {
    public static void main(String[] args) {
        Conta conta = new Conta("Daniel");

        conta.depositar(1000);
        conta.sacar(350);
        conta.sacar(350);
        conta.sacar(500);
        System.out.println("Saldo da Conta: " + conta.getSaldo());

    }
}
