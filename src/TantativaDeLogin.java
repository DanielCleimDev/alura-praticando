import java.util.Scanner;

public class TantativaDeLogin {
    public static void main(String[] args) {
        int senhaCorreta = 1234;
        int tentativas = 3;
        Scanner leitor = new Scanner(System.in);

        while (tentativas>0){
            System.out.println("Informe a senha: ");
            int senha = leitor.nextInt();

            if(senha == senhaCorreta){
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            }else{
                tentativas--;
                if(tentativas == 0){
                    System.out.println("Conta bloqueada temporariamente.");
                }else {
                    System.out.println("Senha incorreta. Você tem " + tentativas + " tentativas restantes. \n");
                }

            }
        }
        leitor.close();
    }

}
