package com.orientacaoObjetos.construtor;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa();
        joao.setEndereco("Rua da Silva");

        Pessoa paulo = new Pessoa("Paulo", "012.345.678-90");

        System.out.println(joao.getNome());
        System.out.println(joao.getEndereco());

        System.out.println(paulo.getNome());
        System.out.println(paulo.getCpf());
        System.out.println(paulo.getEndereco());

    }
}
