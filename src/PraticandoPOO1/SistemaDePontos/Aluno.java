package PraticandoPOO1.SistemaDePontos;

public class Aluno {
    private String aluno;
    private int pontos = 0;
    private int nivel;

    public Aluno(String aluno) {
        this.aluno = aluno;
    }

    private void calcularNivel(){
        this.nivel = (this.pontos+100)/100;
    }

    public void ganharPontos(int pontos){
        this.pontos += pontos;
        calcularNivel();
    }

    public String exibirStatus(){
        return "Aluno: " + this.aluno + ", pontos: " + this.pontos +
                ", nível: " + this.nivel;
    }
}
