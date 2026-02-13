package PraticandoPOO1.ControleVendas;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 10);
        produto.venda(5);
        produto.venda(6);
    }
}
