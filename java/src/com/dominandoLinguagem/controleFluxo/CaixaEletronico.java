package com.dominandoLinguagem.controleFluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 540;
        double saque = 510;

        if (saldo >= saque) {
            saldo -= saque;
            System.out.println("Saldo =" + " R$" + saldo);
        } else {
            System.out.println("Operação inválida! Valor do saque maior que valor do saldo.");
        }

    }
}
