import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeConvidados {
    public static void main(String[] args) {
        List<String> convidados = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        String valor;
        do {
            System.out.println("\nDigite o nome do convidado (ou 'v' para visualizar a lista, 's' para terminar):");
            valor = leitor.nextLine();

            final String nomeProcurado = valor;
            if(!convidados.stream().anyMatch(s -> s.equalsIgnoreCase(nomeProcurado))
                    && !valor.equalsIgnoreCase("v")
                    && !valor.equalsIgnoreCase("s")){
                convidados.add(valor);
                System.out.println("Adicionado: " +valor);
            }
            if(valor.equalsIgnoreCase("v")){
                System.out.print("Convidados: ");
                for(String nome: convidados){
                    System.out.print(nome + " ");
                }
            }

        }while (!valor.equalsIgnoreCase("s"));
        leitor.close();
        System.out.print("Lista: ");
        for(String nome: convidados){
            System.out.print(nome + " ");
        }

    }
}
