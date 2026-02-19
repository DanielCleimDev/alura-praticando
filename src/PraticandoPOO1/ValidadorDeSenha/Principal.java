package PraticandoPOO1.ValidadorDeSenha;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Validador usuario = new Validador("Daniel", "DN-adm");
        String login;
        String senha;

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o login: ");
            login = leitor.nextLine();
            System.out.println("Informe a senha: ");
            senha = leitor.nextLine();

            if(usuario.validador(login,senha)){
                System.out.println("Usuário logado com sucesso!");
                break;
            } else if (i == 2) {
                System.out.println("Terceira tentativa, acesso bloqueado.");
            }else{
                System.out.println("Senha incorreta. Tentativas restantes: " + (2 - i) + "\n");
            }
        }
        leitor.close();
    }
}
