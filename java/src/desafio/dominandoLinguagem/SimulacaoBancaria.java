package desafio.dominandoLinguagem;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        Double valorTransacao;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {

                case 1: //deposito
                    valorTransacao = scanner.nextDouble(); //valor transacao => deposito
                    saldo += valorTransacao;
                    System.out.println(String.format("Saldo atual: %.1f", saldo));
                    break;

                case 2: //saque
                    valorTransacao = scanner.nextDouble(); //valor transacao => saque
                    if (valorTransacao <= saldo) {
                        saldo -= valorTransacao;
                        System.out.println(String.format("Saldo atual: %.1f", saldo));
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3: // imprime saldo
                    System.out.println(String.format("Saldo atual: %.1f", saldo));
                    break;

                case 0: // encerra programa
                    System.out.println("Programa encerrado.");
                    continuar = false; // Atualiza a variável de controle para encerrar o loop
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
