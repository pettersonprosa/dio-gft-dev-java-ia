package desafio.designPatterns.factoryMethod;

public class Teste {
    public static void main(String[] args) {
        FactoryPessoa fPessoa = new FactoryPessoa();
        Pessoa pessoa = fPessoa.getPessoa("João", "M");
        System.out.println(pessoa.getClass());
    }
}
