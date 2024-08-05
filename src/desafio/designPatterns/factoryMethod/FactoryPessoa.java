package desafio.designPatterns.factoryMethod;

public class FactoryPessoa {

    public Pessoa getPessoa(String nome, String sexo) {
        if (sexo.equals("M"))
            return new Homem(nome, sexo);
        else if (sexo.equals("F"))
            return new Mulher(nome, sexo);
         else
            return null;
    }
}
