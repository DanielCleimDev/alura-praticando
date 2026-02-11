import java.util.Scanner;

public class PedidoDeNome {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;

        while (true){
            System.out.println("Digite seu nome: ");
            nome = leitor.nextLine();

            if(nome.length()>=3){
                System.out.println(nome + " Cadastrado com sucesso!");
                break;
            }else{
                System.out.println("Nome inválido, Digite novamente.");
            }
        }
        leitor.close();
    }
}
