public class GerenciadorDeContas {

    public ContaCorrente abrirContaCorrente(String senha, int numeroConta, double taxa, double saldo, String banco) {
        ContaCorrente cc = new ContaCorrente(senha, numeroConta, taxa, saldo, banco);

        return cc;
    }

    public ContaPoupanca abrirContaPoupanca(String senha, int numeroConta, double taxa, double saldo, String banco) {
        ContaPoupanca cp = new ContaPoupanca(senha, numeroConta, taxa, saldo, banco);

        return cp;
    }
}
