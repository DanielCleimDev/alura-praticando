package PraticandoPOO1.ControleTemperatura;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Setor setor = new Setor("Estufa1");

        while (true){
            System.out.println("Informe a Temperatura da " + setor.getLocal());
            setor.setTemperatura(leitor.nextDouble());
            System.out.println("Para informar uma nova temperatuar digite (1) para encerrar (0): ");
            if(leitor.nextInt() == 0){
                break;
            }
        }
        leitor.close();
        System.out.println(setor);
    }
}
