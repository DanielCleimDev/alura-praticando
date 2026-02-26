package ColecoesStreams;

import java.util.List;
import java.util.stream.Collectors;

public class CriandoNovoArrayComNomesCurtos {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");
        List<String> funcionarioNomesCurtos = funcionarios.stream()
                .filter(f ->f.length()<6)
                .collect(Collectors.toList());

        System.out.println(funcionarioNomesCurtos);
    }
}
