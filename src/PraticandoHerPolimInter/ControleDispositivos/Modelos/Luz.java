package PraticandoHerPolimInter.ControleDispositivos.Modelos;

public class Luz implements Controlavel{
    private boolean ligado = false;

    @Override
    public void ligar() {
        if (ligado){
            System.out.println("A luz já esta ligada!");
        }else {
            ligado = true;
            System.out.println("A luz foi ligada!");
        }
    }

    @Override
    public void desligar() {
        if(ligado){
            ligado = false;
            System.out.println("A luz foi desligada!");
        }else {
            System.out.println("A luz já esta desligada!");
        }
    }
}
