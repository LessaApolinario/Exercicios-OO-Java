public class GerenciadorDeContas {

    public ContaCorrente abrirContaCorrente(int numeroConta, double taxa, double saldo, String banco) {
        ContaCorrente cc = new ContaCorrente(numeroConta, taxa, saldo, banco);

        return cc;
    }

    public ContaPoupanca abrirContaPoupanca(int numeroConta, double taxa, double saldo, String banco) {
        ContaPoupanca cp = new ContaPoupanca(numeroConta, taxa, saldo, banco);

        return cp;
    }
}
