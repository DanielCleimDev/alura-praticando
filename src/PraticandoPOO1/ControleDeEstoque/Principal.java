package PraticandoPOO1.ControleDeEstoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Produto produto;

        String nome;
        double preco;
        int quantidade;

        List<Produto> produtos = new ArrayList<>();

        int controlador = 1;

        Scanner leitor = new Scanner(System.in);


        while (controlador == 1){
            System.out.println("Informe o Nome do Produto: ");
            nome = leitor.nextLine();
            System.out.println("Informe o Preço: ");
            preco = Double.parseDouble(leitor.nextLine());
            System.out.println("Informe a quantidade: ");
            quantidade = Integer.parseInt(leitor.nextLine());

            produto = new Produto(nome, preco, quantidade);

            produtos.add(produto);

            System.out.println("Digite (0) para encerrar ou (1) para Adicionar um novo produto: ");
            controlador = Integer.parseInt(leitor.nextLine());

        }
        System.out.println(produtos);
        leitor.close();

    }
}
