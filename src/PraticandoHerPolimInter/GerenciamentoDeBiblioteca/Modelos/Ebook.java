package PraticandoHerPolimInter.GerenciamentoDeBiblioteca.Modelos;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String titulo, int ano, String formato) {
        super(titulo, ano);
        this.formato = formato;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Ebook: %s, Formato: %s\n", geraCodigo(), getTitulo(), formato);
    }
}
