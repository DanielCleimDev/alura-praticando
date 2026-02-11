import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Calculadora de Fatorial \nInforme um número: ");
        int numero = leitor.nextInt();
        leitor.close();
        long resultado = numero;
        while (numero>1){
            numero--;
            resultado = resultado * numero;
            System.out.println(resultado);
        }
        System.out.println("O fatorial é: " + resultado);
    }
}
