package com.orientacaoObjetos.getterSetter;

public class Escola {
    public static void main(String[] args) {
        Aluno joao = new Aluno();

        joao.setNome("João");
        joao.setIdade(20);
        joao.setSexo("M");

        System.out.println(String.format("O aluno %s tem %d anos.", joao.getNome(), joao.getIdade()));
    }
}
