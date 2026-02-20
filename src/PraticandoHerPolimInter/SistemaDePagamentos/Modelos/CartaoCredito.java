package PraticandoHerPolimInter.SistemaDePagamentos.Modelos;

public class CartaoCredito extends Pagamento{
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento de R$%.2f confirmado no Cartão de Crédito (Taxa: R$%.2f)\n", getValor(), geraTaxa(3));
    }
}
