package StringRegex;

import java.util.Scanner;

public class StringContem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        String string = sc.nextLine();

        System.out.println("Digite uma palavra que o texto contenha: ");
        String encontrar = sc.nextLine();
        if (string.contains(encontrar)) {
            System.out.printf("A palavra \"%s\" está presente no texto.\n", encontrar);
        }else {
            System.out.printf("A palavra digitada '%s' não foi encontrada\n", encontrar);
        }

    }
}
