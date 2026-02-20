package PraticandoHerPolimInter.SistemaBancario.Modelos;

public class OperacaoBancaria implements AcaoBancaria{
    private double valor;

    public OperacaoBancaria(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public void executar() {}
}
