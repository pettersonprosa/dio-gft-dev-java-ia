package com.controleFluxo;

public class ResultadoEscolar {
    public static void main(String[] args) {
        double nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Em recuperação!");
        } else{
            System.out.println("Reprovado!");
        }

        // Condição ternário - Exemplo anterior
		System.out.println("=== Exemplo condição ternária ===");
		String resultado = nota >=7 ? "Aprovado t!" : nota >=5 && nota <7 ? "Em Recuperação t!" : "Reprovado t!";
		System.out.println(resultado);
    
        
        // FOR
        String alunos [] = {"JOAO", "JERONIMO", "TIROSCO"};

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    
    }

}
