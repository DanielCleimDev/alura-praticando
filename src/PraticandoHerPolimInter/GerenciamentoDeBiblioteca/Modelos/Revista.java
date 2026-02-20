package PraticandoHerPolimInter.GerenciamentoDeBiblioteca.Modelos;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, int ano, int edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Revista: %s, Edição: %s\n", geraCodigo(), getTitulo(), edicao);
    }
}
