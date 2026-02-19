package PraticandoPOO1.FilmeAvaliacao;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme("Matrix");
        filme.avaliar(5);
        filme.avaliar(7);
        filme.avaliar(4);
        filme.avaliar(3);
        System.out.println("A avaliação atual do filme: " + filme.getFilme() + " é de " + filme.getMedia());
    }
}
