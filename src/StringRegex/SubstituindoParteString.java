package StringRegex;

import java.util.Scanner;

public class SubstituindoParteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Digite o texto: O gato caça o rato.");
            String texto = sc.nextLine();

            if(texto.contains("gato")){
                System.out.println("Informe outro animal para caçar o rato: ");
                String animal = sc.nextLine();
                System.out.println(texto.replace("gato",animal));
                break;
            }
            System.out.println("O texto não tem gato!");
        }
        sc.close();
    }
}
