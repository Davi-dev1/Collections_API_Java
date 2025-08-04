package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {


    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>(); // esse array list vai estar vazio aqui para conseguir guardar objetos, ou seja ele ficará aqui "esperando "
    } //esse construtor serve para quando sempre que chamar um obejeto do tipo list tarefa ele já ter criado uma lista vazia para conseguir adicionar elementos, para remover, para obter o numero total de onjetos e por ai vaiiii

    public void adcionarTarefas(String descricao) {
//o void não retorna nada blzzzzz
        tarefaList.add(new Tarefa(descricao));
    }

    public void RemoverTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }// basicamente aqui serve para dizer que se tiver tarefas de mesmo nome, o código permite o acesso dela e  remove a outra
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroToTalTarefas() {
        return tarefaList.size();
        //basicamente o size funciona como aquele comando do javascript que verifica a quantidade de elementos que tem dentro do array.
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é : " + listaTarefa.obterNumeroToTalTarefas());

        listaTarefa.adcionarTarefas("Tarefa 1 ");
        listaTarefa.adcionarTarefas("Tarefa 1 ");
        listaTarefa.adcionarTarefas("Tarefa 2 ");
        System.out.println("O número total de elementos na lista é : " + listaTarefa.obterNumeroToTalTarefas());

    listaTarefa.RemoverTarefa("Tarefa 2 ");
        System.out.println("O número total de elementos na lista é : " + listaTarefa.obterNumeroToTalTarefas());
//no terminal mostra tarefa 1 , tarefa 1 porque a tarefa 2 foi removida(observe a linha 48);

    listaTarefa.obterDescricoesTarefas();

    }
}