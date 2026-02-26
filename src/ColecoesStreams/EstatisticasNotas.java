package ColecoesStreams;

import java.util.List;

public class EstatisticasNotas {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double totalNotas = notas.stream()
                .reduce(0.0,Double::sum);

        double mediaNotas = totalNotas/notas.size();

        System.out.printf("A média das notas é: %.1f\n", mediaNotas);

        double menorNota = notas.stream()
                .min(Double::compare).get();

        System.out.printf("A menor nota foi %.1f\n", menorNota);

        double maiorNota = notas.stream()
                .max(Double::compare).get();

        System.out.printf("A Maior nota foi %.1f", maiorNota);


    }
}
