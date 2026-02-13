package PraticandoPOO1.MultaPorAtraso;

public class Pedido {
    private String titulo;
    private int diasAtraso;

    public Pedido(String titulo, int diasAtraso) {
        this.titulo = titulo;
        this.diasAtraso = diasAtraso;
    }

    public void exibirDetalhes(){
        System.out.println("Livro: " + titulo + " | Multa por " + diasAtraso +
                " dias de atraso: R$ " + (diasAtraso * 2.50));
    }
}
