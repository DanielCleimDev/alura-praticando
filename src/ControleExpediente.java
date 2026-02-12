import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ControleExpediente {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        LocalTime horarioDeEntrada;
        long cargaHoraria;
        LocalTime horarioDeSaida;
        Duration tempoTrabalhado;
        Duration saldo;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");

        int controle =1;

        while (controle == 1){
            System.out.println("Informe o Horário de Entrada (HH:mm): ");
            horarioDeEntrada = LocalTime.parse(leitor.next(), formato);

            System.out.println("Informe a Carga horária: ");
            //cargaHoraria = Duration.ofHours(leitor.nextInt());
            cargaHoraria = leitor.nextLong();

            System.out.println("Informe o Horário de Saída: ");
            horarioDeSaida = LocalTime.parse(leitor.next(), formato);

            tempoTrabalhado = Duration.between(horarioDeEntrada,horarioDeSaida);
            saldo = tempoTrabalhado.minus(Duration.ofHours(cargaHoraria));

            System.out.println("Horário de entrada: " + horarioDeEntrada);
            System.out.println("Horário de saída previsto: " + horarioDeEntrada.plusHours(cargaHoraria));
            System.out.println("Horário real de saída: " + horarioDeSaida);
            System.out.println("Saldo de horas:" + saldo.toHours() + "h" + Math.abs(saldo.toMinutesPart()) + "min.");

            System.out.println("\nDigite (0) para Sair ou (1) para continuar: ");
            controle = leitor.nextInt();
        }





    }
}
