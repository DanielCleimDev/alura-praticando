package PraticandoPOO1.AtualizandoAcesso;

public class Funcionario {
    private String nome;
    private String cargo;
    private int acesso;

    public Funcionario(String nome, String cargo, int acesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.acesso = acesso;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setAcesso(int acesso) {
        this.acesso = acesso;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", acesso=" + acesso +
                '}';
    }
}
