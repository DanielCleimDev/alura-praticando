import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TrabalhandoComData {
    public static void main(String[] args) {
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataPrimeiraParcela = LocalDate.of(2025, 5, 15);
        LocalDate dataSegundaParcela = dataPrimeiraParcela.plusDays(30);

        if (dataPrimeiraParcela.isEqual(LocalDate.now())) {
            System.out.println("Hoje é o dia do vencimento");
        } else {
            System.out.println("Ainda não está no dia do vencimento");
        }

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data compra formatada: " + dataCompra.format(formato));

        ZonedDateTime dataConclusaoCompra = ZonedDateTime.now();
        ZonedDateTime dataCompraNy = dataConclusaoCompra.withZoneSameInstant(ZoneId.of("America/New_York"));

        LocalTime inicio = LocalTime.of(9, 0);
        LocalTime fim = LocalTime.of(17, 30);
        Duration duracao = Duration.between(inicio, fim);
        System.out.println("Duração do expediente: " + duracao.toHours() +
                " horas e " + duracao.toMinutesPart() + " minutos.");

        LocalDate dataPagamento = LocalDate.parse("2025-10-30");
        LocalDate dataPag2 = dataCompra.plusDays(45);
        //Period periodo = Period.between(dataCompra, dataPag2);

        long totalDias = ChronoUnit.DAYS.between(dataCompra, dataPag2);

        System.out.println("Data da compra: " + dataCompra + "\nData Pagamento: " + dataPag2 + "\nDiferença em dias: " + totalDias);

        LocalDateTime dataAtual = LocalDateTime.now();
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy H:mm", Locale.of("pt", "BR"));
        System.out.println(dataAtual.format(formato2));
    }
}
