package PraticandoPOO1.ControleNotas;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double media(){
        return (nota1+nota2)/2;
    }
    public String situacao(){
        if(media() >= 7){
            return "Aprovado";
        }
        return "Reprovado";
    }

    @Override
    public String toString() {
        return  "Nome= " + nome +
                "\nNota1= " + nota1 +
                "\nNota2= " + nota2 +
                "\nMedia= " + media() +
                "\nSituação= " + situacao();
    }
}
