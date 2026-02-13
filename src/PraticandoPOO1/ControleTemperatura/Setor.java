package PraticandoPOO1.ControleTemperatura;

import PraticandoPOO1.ZerandoSaldo.Principal;

public class Setor {
    private String local;
    private double temperatura;

    public Setor(String local) {
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        if(temperatura>37.5){
            System.out.println("Temperatura acima do Limite!");
        }
    }

    @Override
    public String toString() {
        return "Setor{" +
                "local='" + local + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}
