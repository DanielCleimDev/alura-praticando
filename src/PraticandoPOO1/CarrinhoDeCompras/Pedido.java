package PraticandoPOO1.CarrinhoDeCompras;

public class Pedido {
    private String nome;
    private double preco;
    private int quantidade;

    public Pedido(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public double total(){
        return preco * quantidade;
    }
}
