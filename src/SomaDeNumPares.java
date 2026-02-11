import java.util.Scanner;

public class SomaDeNumPares {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Deseja somar os números pares de 1 até qual número?");
        int numero = leitor.nextInt();
        int soma = 0;
        for (int i = 0; i <= numero ; i++) {
            if((i % 2) == 0){
                soma += i;
            }
        }
        System.out.println("A soma dos números pares de 1 até " + numero +
                "\n É de: " + soma);
        leitor.close();
    }
}
