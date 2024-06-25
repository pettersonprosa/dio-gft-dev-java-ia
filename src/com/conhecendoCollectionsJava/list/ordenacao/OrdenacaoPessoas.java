package com.conhecendoCollectionsJava.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaPessoasOrdenadaPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(listaPessoasOrdenadaPorIdade);
        return listaPessoasOrdenadaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaPessoasOrdenadaPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(listaPessoasOrdenadaPorAltura, new ComparatorPorAltura());
        return listaPessoasOrdenadaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Nome 3", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 4", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Nome 1", 17, 1.56);
        ordenacaoPessoas.adicionarPessoa("Nome 2", 25, 1.70);

        // Exibindo a lista de pessoas adicionadas
        System.out.println(ordenacaoPessoas.listaPessoas);

        // Ordenando e exibindo por idade
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        // Ordenando e exibindo por altura
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }

}
