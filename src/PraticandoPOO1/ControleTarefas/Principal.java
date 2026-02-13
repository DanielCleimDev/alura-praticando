package PraticandoPOO1.ControleTarefas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa();
        String descricao;
        boolean concluida;

        List<Tarefa> tarefas = new ArrayList<>();

        Scanner leitor = new Scanner(System.in);

        do {
            System.out.println("Informe a Descrição da Tarefa: ");
            descricao = leitor.nextLine();
            System.out.println("A Tarefa esta concluída? se sim digite (1) se não digite (0): ");
            if(Integer.parseInt(leitor.nextLine()) == 1){
                concluida = true;
            }else {
                concluida = false;
            }
            tarefas.add(new Tarefa(descricao, concluida));

            System.out.println("Deseja incluir uma nova tarefa? digite (1) para sim ou (0) para não: ");
        } while (Integer.parseInt(leitor.nextLine()) != 0);

        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("Id: " + i + " Tarefa: " + tarefas.get(i) + "\n");
        }

        System.out.println("Deseja Atualizar o Status de uma tarefa? digite (1) para sim ou (0) para não: ");
        int controle = Integer.parseInt(leitor.nextLine());

        while (controle != 0){
            int id;
            System.out.println("Informe o id da tarefa: ");
            id = Integer.parseInt(leitor.nextLine());
            Tarefa tarefaAtualizada = tarefas.get(id);
            System.out.println(tarefaAtualizada);
            System.out.println("A tarefa esta concluída? Digite (1) para sim ou (0) para não: ");
            tarefaAtualizada.concluida(Integer.parseInt(leitor.nextLine()));
            System.out.println(tarefaAtualizada);

            System.out.println("Deseja Atualizar o Status de outra tarefa? digite (1) para sim ou (0) para não: ");
            controle = Integer.parseInt(leitor.nextLine());
        }

        for (Tarefa t: tarefas){ System.out.println(t);}


        leitor.close();
    }
}
