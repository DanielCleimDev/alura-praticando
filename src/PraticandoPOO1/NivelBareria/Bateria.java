package PraticandoPOO1.NivelBareria;

public class Bateria {
    private int nivelBateria;

    public void setNivelBateria(int nivelBateria) {
        if(nivelBateria>=0 && nivelBateria<=100){
            this.nivelBateria = nivelBateria;
            statusBateria();
        }else {
            System.out.println("Nível Inválido");
        }
    }
    private void statusBateria(){
        if(nivelBateria<20){
            System.out.println("Bateria Fraca");
        }else if (nivelBateria<79){
            System.out.println("Bateria Ok");
        }else {
            System.out.println("Bateria Cheia");
        }
    }
}
