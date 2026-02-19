package PraticandoPOO1.SistemaDePontos;

public class Pricipal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Daniel");
        aluno.ganharPontos(50);
        System.out.println(aluno.exibirStatus()+ "\n");
        aluno.ganharPontos(150);
        System.out.println(aluno.exibirStatus()+ "\n");
        aluno.ganharPontos(1500);
        System.out.println(aluno.exibirStatus()+ "\n");
        aluno.ganharPontos(300);
        System.out.println(aluno.exibirStatus()+ "\n");

    }
}
