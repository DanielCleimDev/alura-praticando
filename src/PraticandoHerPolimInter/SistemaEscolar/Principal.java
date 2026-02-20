package PraticandoHerPolimInter.SistemaEscolar;

import PraticandoHerPolimInter.SistemaEscolar.Modelos.Aluno;
import PraticandoHerPolimInter.SistemaEscolar.Modelos.Docente;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Daniel", 42, 7.5);
        Aluno aluno2 = new Aluno("Gabriel", 11, 9.5);
        Docente docente1 = new Docente("Layne", 21, "Português");
        Docente docente2 = new Docente("Maria", 55, "Matemática");

        aluno1.exibirDados();
        aluno2.exibirDados();
        docente1.exibirDados();
        docente2.exibirDados();
    }
}
