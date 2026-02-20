package PraticandoHerPolimInter.IdentificandoEstudante;

import PraticandoHerPolimInter.IdentificandoEstudante.Modelos.Aluno;
import PraticandoHerPolimInter.IdentificandoEstudante.Modelos.Bolsista;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel", "Regular");
        Bolsista bolsista = new Bolsista("Daniel");
        aluno.identificar();
        bolsista.identificar();
    }

}
