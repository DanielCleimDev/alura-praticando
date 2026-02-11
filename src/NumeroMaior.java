public class NumeroMaior {
    public static void main(String[] args) {
        int[] numeros = {52,30,88,98,67};
        int resultado = numeros[0];
        for(int numero: numeros){
            System.out.println("Resultado antes: " + resultado);
            if(numero > resultado){
                resultado = numero;
            }
            System.out.println("Numero atual da lista: " + numero);
            System.out.println("Resultado depois: " + resultado + "\n");
        }
        System.out.println("O número maior da lista {52,30,88,98,67} é: " + resultado);

    }
}
