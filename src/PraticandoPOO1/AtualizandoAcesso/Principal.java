package PraticandoPOO1.AtualizandoAcesso;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Daniel", "Desenvolvedor Jr", 1);
        System.out.println(funcionario);
        System.out.println("Atualizando Cargo");
        funcionario.setCargo("Desenvolvedor Pleno");
        funcionario.setAcesso(2);
        System.out.println(funcionario);
    }
}
