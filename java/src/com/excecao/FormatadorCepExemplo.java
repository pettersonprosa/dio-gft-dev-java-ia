package com.excecao;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("12345-678");
            System.out.println("Dentro do Try...");
        } catch (CepInvalidoException e) {
            System.out.println("O CEP é inválido");
            e.printStackTrace();
        }
        System.out.println("Fim execução...");
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
