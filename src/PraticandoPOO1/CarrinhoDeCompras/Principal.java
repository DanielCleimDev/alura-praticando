package PraticandoPOO1.CarrinhoDeCompras;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        String nome;
        double preco;
        int quantidade;

        do {
            System.out.println("Informe o nome do item: ");
            nome = leitor.nextLine();
            System.out.println("Informe o preço: ");
            preco = Double.parseDouble(leitor.nextLine());
            System.out.println("Informe a quantidade: ");
            quantidade = Integer.parseInt(leitor.nextLine());
            Pedido pedido = new Pedido(nome, preco, quantidade);
            carrinho.add(pedido);
            System.out.println("Deseja adicionar um novo pedido? Digite (1) para sim ou (0) para não: ");
        }while (Integer.parseInt(leitor.nextLine()) !=0);
        System.out.println("Total da compra: R$" + carrinho.getTotal());
        leitor.close();
    }
}
