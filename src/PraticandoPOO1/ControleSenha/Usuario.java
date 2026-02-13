package PraticandoPOO1.ControleSenha;

public class Usuario {
    private String usuario;
    private String senha = "1234";

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSenha(String senhaAtual, String novaSenha){
        if(senhaAtual.equals(this.senha)){
            this.senha = novaSenha;
            System.out.println("Senha Alterada com sucesso!");
        }else {
            System.out.println("Senha incorreta.");
        }
    }
}
