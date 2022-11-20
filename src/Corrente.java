public class Corrente extends Conta {
    public Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        super.transferir(valor, contaDestino);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta-Corrente :\n");
        super.imprimirExtrato();
    }
}
