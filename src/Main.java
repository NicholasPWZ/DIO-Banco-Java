public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Banco DinDinMoney");

        Cliente cliente1 = new Cliente();
        cliente1.setName("Júlia Llantada");

        Conta corrente1 = new Corrente(cliente1);
        Conta poupanca1 = new Poupanca(cliente1);
        banco1.AdicionarConta(corrente1);
        banco1.AdicionarConta(poupanca1);

        corrente1.depositar(700);
        corrente1.sacar(300);

        poupanca1.depositar(200);

        corrente1.imprimirExtrato();
        poupanca1.imprimirExtrato();
        banco1.getContas();


    }
}
