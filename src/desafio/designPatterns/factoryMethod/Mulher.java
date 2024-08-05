package desafio.designPatterns.factoryMethod;

public class Mulher extends Pessoa {

    public Mulher(String nome, String sexo){
        this.setNome(nome);
        this.setSexo(sexo);
        System.out.println("Olá dona " + this.getNome());
    }
}
