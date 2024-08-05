package desafio.designPatterns.factoryMethod;

public class Homem extends Pessoa {

    public Homem(String nome, String sexo){
        this.setNome(nome);
        this.setSexo(sexo);
        System.out.println("Olá seu " + this.getNome());
    }
}
