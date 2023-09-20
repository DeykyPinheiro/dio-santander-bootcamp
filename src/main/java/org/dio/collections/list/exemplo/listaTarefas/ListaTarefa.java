package org.dio.collections.list.exemplo.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    List<Tarefa> listaTarefa = new ArrayList<>();


    public ListaTarefa() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicioanrTarefa(Tarefa tarefa) {
        this.listaTarefa.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasRemover = new ArrayList<>();
        for (Tarefa t : this.listaTarefa) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemover.add(t);
            }
        }
        this.listaTarefa.removeAll(tarefasRemover);
    }

    public int totalTarefas() {
        return this.listaTarefa.size();
    }

    public void obterDescricaoTarefa() {
        System.out.println(this.listaTarefa);
    }


    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("total de tarefas: " + listaTarefa.totalTarefas());

        Tarefa t1 = new Tarefa("t1");
        Tarefa t2 = new Tarefa("t1");
        Tarefa t3 = new Tarefa("t3");
        listaTarefa.adicioanrTarefa(t1);
        listaTarefa.adicioanrTarefa(t2);
        listaTarefa.adicioanrTarefa(t3);
        System.out.println("total de tarefas: " + listaTarefa.totalTarefas());

        listaTarefa.removerTarefa("t1");
        System.out.println("total de tarefas: " + listaTarefa.totalTarefas());



        listaTarefa.adicioanrTarefa(t2);
        listaTarefa.adicioanrTarefa(t3);
        listaTarefa.obterDescricaoTarefa();

    }


}
