package PraticandoPOO1.ValidandoPreco;

public class Item {
    private String nome;
    private double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        if(preco<0){
            System.out.println("Preço inválido!");
            this.preco = 0;
        }else {
            this.preco = preco;
        }
    }

    @Override
    public String toString() {
        return "Produto='" + nome + '\'' +
                ", preço=" + preco;
    }
}
