package ColecoesStreams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VerificandoChave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idCliente;

        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        while (true){
            System.out.println("Informe o id do cleinte: ");
            idCliente = Integer.parseInt(sc.nextLine());

            if (clientes.containsKey(idCliente)){
                System.out.printf("O nome do cliente com ID %d é: %s", idCliente, clientes.get(idCliente));
                break;
            } else {
                System.out.printf("Cliente com ID %d não encontrado.\n", idCliente);
            }
        }

        sc.close();
    }
}
