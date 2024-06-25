package com.conhecendoCollectionsJava.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()){
            for (Livro livro: listaLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    listaPorAutor.add(livro);
                }
            }
        }
        return listaPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaLivroPorIntervalorAno = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro livro: listaLivros){
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    listaLivroPorIntervalorAno.add(livro);
                }
            }
        }
        return listaLivroPorIntervalorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro listaLivroPorTitulo = null;
        if (!listaLivros.isEmpty()) {
            for (Livro livro: listaLivros){
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    listaLivroPorTitulo = livro;
                    break;
                }
            }
        }
        return listaLivroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 4", 1992);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println("Pesquisa por intervalor de anos:");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }

}
