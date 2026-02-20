package PraticandoHerPolimInter.SistemaDePagamentos.Modelos;

public abstract class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double geraTaxa(double taxa){
        return (taxa*valor)/100;
    }

    public double getValor() {
        return valor;
    }

    public abstract void confirmarPagamento();
}
