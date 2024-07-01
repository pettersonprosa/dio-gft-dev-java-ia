package desafio.bancoDigital;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cliente joao = new Cliente("João", "00123", 32);
        Cliente roberto = new Cliente("Roberto", "456123", 23);

        // abrindo conta corrente joao
        Banco.abrirConta(joao, "cc");
        Banco.getContas(); //listando contas

        // abrindo conta corrente roberto
        Banco.abrirConta(roberto, "cc");
        Banco.getContas(); // listando contas

        // testando conta joao
        System.out.println("");// testando conta roberto
        List<Conta> contas = Banco.getContas();
        Conta c1 = contas.get(0);
        System.out.println(c1.getCliente().getNome());
        c1.depositar(25000);
        c1.sacar(5000);
        c1.imprimirInfosComuns();

        System.out.println("");// testando conta roberto
        Conta c2 = contas.get(1);
        System.out.println(c2.getCliente().getNome());
        c2.depositar(1000);
        c2.sacar(5000);
        c2.imprimirInfosComuns();

        // transferindo dinheiro da conta do joao(c1) para o roberto (c2)
        System.out.println("");// testando conta roberto
        c1.transferir(4000, c2);

        // imprimindo informações das contas
        System.out.println("");// testando conta roberto
            c1.imprimirInfosComuns();
        c2.imprimirInfosComuns();

    }
}

