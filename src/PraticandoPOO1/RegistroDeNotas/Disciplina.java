package PraticandoPOO1.RegistroDeNotas;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String disciplita;
    private List<Double> notas;
    private int qtdInvalidas;

    public Disciplina(String disciplita) {
        this.disciplita = disciplita;
        this.notas = new ArrayList<>();
        this.qtdInvalidas = 0;
    }
    public void novaNota(Double nota){
        if(nota> 0 && nota <=10){
            notas.add(nota);
        }else {
            this.qtdInvalidas +=1;
            System.out.println("Nota inválida ignorada: " + nota + "\n");
        }
    }

    private double calculoMedia(){
        double soma = 0;
        for(Double nota:notas){
            soma += nota;
        }
        return soma/notas.size();
    }
    public double getMedia(){
        if(!notas.isEmpty()){
            return Math.round(calculoMedia());
        }
        return 0;
    }

    public String getDisciplita() {
        return disciplita;
    }

    public int getQtdInvalidas() {
        return qtdInvalidas;
    }

    public int qtdNotasValidas(){
        return notas.size();
    }
}
