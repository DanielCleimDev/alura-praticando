package PraticandoHerPolimInter.GerenciamentoDeBiblioteca.Modelos;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, int ano, String autor) {
        super(titulo, ano);
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Livro: %s, Autor: %s\n", geraCodigo(), getTitulo(), autor);
    }
}
