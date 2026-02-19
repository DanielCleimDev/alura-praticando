package PraticandoPOO1.ValidadorDeSenha;

public class Validador {
    private String login;
    private String senha;

    public Validador(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public boolean validador(String login, String senha){
        return this.login.equals(login) && this.senha.equals(senha);
    }
}
