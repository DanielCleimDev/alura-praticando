package PraticandoHerPolimInter.SistemaDePagamentos.Modelos;

public class BoletoBancario extends Pagamento{
    public BoletoBancario(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Boleto de R$%.2f gerado com sucesso (Taxa: R$%.2f)\n", getValor(), geraTaxa(1));
    }
}
