package StringRegex;

import java.util.Scanner;

public class ValidandoSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha;

        String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        while (true){
            System.out.println("Senha: ");
            senha = sc.nextLine();

            if (senha.matches(regex)) {
                System.out.println("A senha é válida.");
                break;
            } else {
                System.out.println("A senha não é válida.");
            }
            System.out.println("digite (0) para sair ou (1) para continuar: ");
            senha = sc.nextLine();
            if(senha.equals("0")) break;
        }
        sc.close();
    }
}
