package desafio.dominandoDesafiosCodigosIntermediariosJava;

import java.util.Scanner;

public class DesafioCofresSeguros {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
        if (tipoCofre.equalsIgnoreCase("digital")) {
            System.out.println("Tipo: Cofre Digital");

            // Lê a senha que será definida para o cofre
            int senhaParaCofre = scanner.nextInt();

            System.out.println("Metodo de abertura: Senha");

            // Cria o cofre com a senha definida
            CofreDigital cd = new CofreDigital(senhaParaCofre);

            // Lê a senha que digitada para o usuário abrir o cofre
            int senhaUsuario = scanner.nextInt();

            // Verifica se senha que o usuário verificou é a mesma que foi definida no cofre
            if (cd.validarSenha(senhaUsuario)){
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else {
            System.out.println("Tipo: Cofre Fisico");
            System.out.println("Metodo de abertura: Chave");
        }
    }
}
abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {

    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {

    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }

}