package desafio.bancoDigital;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        double saldo = 0;
    }

    @Override
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            saldo -= valor;
            System.out.println(String.format("Saque de R$%.2f realizado", valor));
            return true;
        }
        System.out.println("Operação não realizada! Saldo menor que o valor de saque.");
        return false;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.printf("R$%.2f depositado!\n", valor);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
            System.out.println("Valor depositado!");
        } else {
            System.out.println("Operação negada! Valor a ser transferido é maior que o saldo em conta.");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
