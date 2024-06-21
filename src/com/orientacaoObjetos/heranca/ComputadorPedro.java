package com.orientacaoObjetos.heranca;

public class ComputadorPedro {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

        ServicoMensagemInstantanea smi = new ServicoMensagemInstantanea();
        System.out.println("SMI");
        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
