package com.orientacaoObjetos.polimorfismo;

import com.orientacaoObjetos.polimorfismo.apps.FacebookMessenger;
import com.orientacaoObjetos.polimorfismo.apps.MSNMessenger;
import com.orientacaoObjetos.polimorfismo.apps.ServicoMensagemInstantanea;
import com.orientacaoObjetos.polimorfismo.apps.Telegram;

public class ComputadorMateus {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido="tlg";

        if(appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if(appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if(appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }


        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
