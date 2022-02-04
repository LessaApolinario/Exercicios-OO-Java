public class ContaCorrente extends Conta {

    public ContaCorrente(int numeroConta, double taxa, double saldo, String banco) {
        super(numeroConta, taxa, saldo, banco);
    }

    // Subtrai uma quantia do saldo, que por sua vez é uma porcentagem!
    public double atualizar(double taxa) {
        double saldo = super.getSaldo();
        saldo -= saldo * (taxa / 100);

        return saldo;
    }

    public double sacar(double quantia, Cliente c) {
        double saldoAtual = c.getContaCorrente().getSaldo();

        if (quantia <= saldoAtual) {
            saldoAtual -= quantia;

            System.out.println("Saque realizado com sucesso!");
            return saldoAtual;
        }

        System.out.println("Quantia muito alta, impossível sacar!");
        return -1;
    }
}
