package com.conhecendoCollectionsJava.list.operacoesBasicas;

public class Teste {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 2");
        listaTarefas.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 2");
        System.out.println("O número total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
