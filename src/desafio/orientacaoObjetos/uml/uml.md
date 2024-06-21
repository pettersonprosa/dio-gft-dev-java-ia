```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        #selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<interface>>
        #ligar(String numero)
        #atender()
        #iniciarCorreioVoz()
    }

    class NavegadorInternet {
        <<interface>>
        #exibirPagina(String url)
        #adicionarNovaAba()
        #atualizarPagina()
    }

    class IPhone {
        <<class>>
    }

    IPhone --> ReprodutorMusical
    IPhone --> AparelhoTelefonico
    IPhone --> NavegadorInternet
    
```