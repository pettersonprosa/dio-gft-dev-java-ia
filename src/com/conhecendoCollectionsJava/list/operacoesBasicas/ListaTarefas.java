package com.conhecendoCollectionsJava.list.operacoesBasicas;
import java.util.*;

public class ListaTarefas {

    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t: listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        listaTarefas.removeAll(tarefasParaRemover);
    }
    public int  obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas() {
        if (!listaTarefas.isEmpty()) {
            System.out.println(listaTarefas);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

}
