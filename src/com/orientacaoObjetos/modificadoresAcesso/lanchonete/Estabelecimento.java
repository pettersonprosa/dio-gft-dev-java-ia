package com.orientacaoObjetos.modificadoresAcesso.lanchonete;

import com.orientacaoObjetos.modificadoresAcesso.lanchonete.area.cliente.Cliente;
import com.orientacaoObjetos.modificadoresAcesso.lanchonete.atendimento.Atendente;
import com.orientacaoObjetos.modificadoresAcesso.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();

        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();;
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Atendente atendente = new Atendente();
        atendente.servindoMesa();

        atendente.receberPagamento();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

    }
}