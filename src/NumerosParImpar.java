import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosParImpar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String lido;
        int numero;

        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        while (true){
            System.out.println("Digite um número (ou 'S' para encerrar):");
            lido = leitor.nextLine();

            if (lido.equals("S") || lido.equals("s")){
                break;
            }

            //("-?\\d+") Expressão regex para validar se é um número
            if(lido.matches("-?\\d+")) {
                numero = Integer.parseInt(lido);

                if (numero % 2 == 0) {
                    par.add(numero);
                } else {
                    impar.add(numero);
                }
            }else{
                System.out.println("O valor " + lido + " não é um número válido.\n");
            }
        }

        System.out.print("Números par:\n{");
        for(int valor: par){
            System.out.print(valor + " ,");
        }
        System.out.print(" };\n");
        System.out.println("Quantidade de números par: " + par.size());

        System.out.print("Números impar: \n{");
        for (int valor: impar){
            System.out.print(valor + " ,");
        }
        System.out.print(" };\n");
        System.out.println("Quantidade de números impar: " + impar.size());

        leitor.close();

    }
}
