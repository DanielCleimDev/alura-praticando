package StringRegex;

import PraticandoHerPolimInter.SistemaEscolar.Modelos.Docente;

public class FormatandoNumeros {
    public static void main(String[] args) {
        String numero = "19,0532";
        System.out.println("R$ " + numero.substring(0, numero.indexOf(",") + 3));
        System.out.printf("R$ %.2f", Double.parseDouble(numero.replace(",",".")));
        String valorFormatado = String.format("R$ %.2f", Double.parseDouble(numero.replace(",",".")));
        System.out.println("\nValor formatado: " + valorFormatado);
    }
}
