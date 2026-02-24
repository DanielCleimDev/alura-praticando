package PraticandoHerPolimInter.ControleDispositivos.Modelos;

public class ArCondicionado implements Controlavel{
    private boolean ligado = false;

    @Override
    public void ligar() {
        if (ligado){
            System.out.println("O Ar Condicionado já esta ligado!");
        }else {
            ligado = true;
            System.out.println("O Ar Condicionado foi ligado!");
        }
    }

    @Override
    public void desligar() {
        if(ligado){
            ligado = false;
            System.out.println("O Ar Condicionado foi desligado!");
        }else {
            System.out.println("O Ar Condicionado já esta desligado!");
        }
    }
}
