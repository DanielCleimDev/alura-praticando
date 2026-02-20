package PraticandoHerPolimInter.GerenciamentoDeBiblioteca;

import PraticandoHerPolimInter.GerenciamentoDeBiblioteca.Modelos.Ebook;
import PraticandoHerPolimInter.GerenciamentoDeBiblioteca.Modelos.Livro;
import PraticandoHerPolimInter.GerenciamentoDeBiblioteca.Modelos.Revista;

public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro("Meu Livro", 2020, "Daniel");
        Revista revista = new Revista("Galileu", 2005, 235);
        Ebook ebook = new Ebook("Menino Maluquinho", 2001, "PDF");

        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();
    }
}
