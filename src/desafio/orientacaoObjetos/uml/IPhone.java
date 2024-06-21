package desafio.orientacaoObjetos.uml;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    @Override
    public void ligar(String numero) {
        System.out.println("Lingando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendido!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A música " + musica + " foi selecioada");
    }
}
