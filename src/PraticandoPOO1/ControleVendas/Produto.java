package PraticandoPOO1.ControleVendas;

public class Produto {
    String descricao;
    int quantidade;

    public Produto(String descricao, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public void venda(int quantidade) {
        if(this.quantidade >= quantidade){
            this.quantidade -= quantidade;
            System.out.println("Venda concluída.\nEstoque restante: " + this.quantidade);
        }else{
            System.out.println("Estoque insuficiente. \nQuantidade em estoque: " + this.quantidade);
        }

    }
}
