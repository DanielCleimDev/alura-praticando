package ColecoesStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovendoElementos {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>(Arrays.asList("Joana", "Lucas", "Pedro", "Antônio"));

        System.out.println("Lista inicial:" + funcionarios);

        funcionarios.remove("Pedro");

        System.out.println("Lista após a exclusão:" + funcionarios);
    }
}
