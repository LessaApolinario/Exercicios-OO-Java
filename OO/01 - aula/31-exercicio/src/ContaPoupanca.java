public class ContaPoupanca extends Conta {

    public ContaPoupanca(String senha, int numeroConta, double taxa, double saldo, String banco) {
        super(senha, numeroConta, taxa, saldo, banco);
    }

    // Adiciona uma quantia ao saldo, que por sua vez é uma porcentagem!
    public double atualizar(double taxa) {
        double saldo = super.getSaldo();
        saldo += saldo * (taxa / 100);

        return saldo;
    }
}
