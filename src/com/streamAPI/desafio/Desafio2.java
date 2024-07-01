package com.streamAPI.desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        /*Desafio 2 - Imprima a soma dos números pares da lista: Utilizando a Stream API,
        realize a soma dos números pares da lista e exiba o resultado no console.*/

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPares = numeros.stream()
                .filter(new java.util.function.Predicate<Integer>() {
                    @Override
                    public boolean test(Integer n) {
                        return n % 2 == 0;
                    }
                })
                .mapToInt(new java.util.function.ToIntFunction<Integer>() {
                    @Override
                    public int applyAsInt(Integer n) {
                        return n;
                    }
                })
                .sum();

        System.out.println("A soma dos números pares é: " + somaPares);
    }
}
