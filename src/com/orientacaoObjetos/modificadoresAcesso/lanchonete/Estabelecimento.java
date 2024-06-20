package com.orientacaoObjetos.lanchonete;

import com.orientacaoObjetos.lanchonete.area.cliente.Cliente;
import com.orientacaoObjetos.lanchonete.atendimento.Atendente;
import com.orientacaoObjetos.lanchonete.atendimento.cozinha.Almoxarife;
import com.orientacaoObjetos.lanchonete.atendimento.cozinha.Cozinheiro;

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