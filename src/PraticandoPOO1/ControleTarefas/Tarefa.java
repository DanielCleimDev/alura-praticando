package PraticandoPOO1.ControleTarefas;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(){}

    public Tarefa(String descricao, boolean concluida) {
        this.descricao = descricao;
        this.concluida = concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public void concluida(int status){
        if(status == 1){
            concluida = true;
        }else {
            concluida = false;
        }
    }

    @Override
    public String toString() {
        String traduzido;
        if(concluida){
            traduzido = "sim";
        }else{
            traduzido = "não";
        }
        return " descricao= '" + descricao + '\'' +
                ", concluida= " + traduzido +
                ' ';
    }
}
