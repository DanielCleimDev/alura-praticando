import java.util.Scanner;

public class Pulando5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um até que número deseja contar: ");
        int numero = leitor.nextInt();

        for (int i = 1; i <= numero; i++) {
            if(i%10 == 5){
                continue;
            }
            System.out.print(i + " ");
        }
        leitor.close();
    }
}
