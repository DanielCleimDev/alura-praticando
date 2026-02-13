package PraticandoPOO1.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Pedido> pedidos = new ArrayList<>();
    private double total;

    public void add(Pedido pedido){
        pedidos.add(pedido);
        total+= pedido.total();
    }

    public double getTotal() {
        return total;
    }
}
