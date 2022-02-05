public class ContaCorrente extends Conta {

    public ContaCorrente(String senha, int numeroConta, double taxa, double saldo, String banco) {
        super(senha, numeroConta, taxa, saldo, banco);
    }

    // Subtrai uma quantia do saldo, que por sua vez é uma porcentagem!
    public double atualizar(double taxa) {
        double saldo = super.getSaldo();
        saldo -= saldo * (taxa / 100);

        return saldo;
    }
}
