package PraticandoPOO1.RegistroDeNotas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String controlador;
        Disciplina disciplina = new Disciplina("Matemática");

        while (true){
            System.out.println("Informe a nota: ");
            disciplina.novaNota(Double.parseDouble(sc.nextLine()));

            System.out.println("Deseja terminar? digite (S) para sim ou  (N) para não.");
            controlador = sc.nextLine();
            if(controlador.equalsIgnoreCase("S")){
                System.out.println("Disciplina: " + disciplina.getDisciplita() +
                        "\nTotal de notas válidas: " + disciplina.qtdNotasValidas() +
                        "\nTotal de notas inválidas: " + disciplina.getQtdInvalidas() +
                        "\nMédia: " + disciplina.getMedia());
                break;
            }
        }
        sc.close();
    }
}
