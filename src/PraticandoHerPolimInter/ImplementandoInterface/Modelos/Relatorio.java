package PraticandoHerPolimInter.ImplementandoInterface.Modelos;

public class Relatorio implements Imprimivel{
    private String titulo;
    private String conteudo;

    public Relatorio(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    @Override
    public void imprimir() {
        System.out.printf(
                "Título: %s\n" +
                "Conteúdo: %s\n",
                titulo, conteudo
        );
    }
}
