package PraticandoPOO1.ControleSenha;

public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Daniel");
        usuario.setSenha("1234", "abc");
        usuario.setSenha("1234", "623");
    }
}
