package ColecoesStreams;

import java.util.List;

public class CalculandoImpostoComReduce {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);

        double total = precosProdutos.stream()
                .reduce(0.0,Double::sum);

        System.out.println("Valor total antes do imposto: " + total);

        double totalComImposto = total * 1.08;
        System.out.printf("Valor total antes do imposto: %.2f ", totalComImposto);
    }
}
