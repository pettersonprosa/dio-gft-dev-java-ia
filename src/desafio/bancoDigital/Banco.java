package desafio.bancoDigital;

import java.util.ArrayList;
import java.util.List;

public abstract class Banco {
    private static String nome = "Banco X";
    private static List<Conta> contas = new ArrayList<>();

    public static String getNomeBanco() {
        return nome;
    }

    public static List<Conta> getContas() {
        return contas;
    }

    public static void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public static void abrirConta(Cliente cliente, String tipoConta) {

        if (tipoConta == "cc") { //conta corrente
            Conta cc = new ContaCorrente(cliente);
            contas.add(cc);
            System.out.println(String.format("Conta corrente de %s aberta!", cliente.getNome()));

        } else if (tipoConta == "cp") { // criando conta poupança
            Conta cp = new ContaPoupanca(cliente);
            contas.add(cp);
            System.out.println(String.format("Conta poupança de %s aberta!", cliente.getNome()));

        } else { // imprimindo mensagem de tipo de conta inválida
            System.out.printf("Tipo de conta a ser criada não existe", nome);
        }
    }

}
