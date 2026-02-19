package PraticandoPOO1.FilmeAvaliacao;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String filme;
    private List<Integer> avaliacoes;
    private double mediaAvaliacoes;

    public Filme(String filme) {
        this.filme = filme;
        this.avaliacoes = new ArrayList<>();
        this.mediaAvaliacoes = 0;

    }

    public String getFilme() {
        return filme;
    }

    public void avaliar(int nota){
        if (nota > 0 && nota <=5){
            avaliacoes.add(nota);
            System.out.printf("O filme %s foi avaliado com a nota %d\n", this.filme, nota);
        }else {
            System.out.println("Informe uma nota entre 1 e 5");
        }

    }
    public double getMedia(){
        int auxiliar = 0;
        for(int nota: avaliacoes){
            auxiliar += nota;
        }
        if(avaliacoes.size() > 0 && auxiliar > 0){
            this.mediaAvaliacoes = auxiliar/avaliacoes.size();
        }
        return mediaAvaliacoes;
    }
}
