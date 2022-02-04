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

        if (saldoAtual > 0 && (quantia <= saldoAtual)) {
            saldoAtual -= quantia;

            System.out.println("Saque realizado com sucesso!");
            return saldoAtual;
        }

        System.out.println("O saldo deve ser positivo e a quantia deve ser menor que o saldo!");
        return -1;
    }

    public double depositar(double quantia, Cliente c) {
        double saldoAtual = c.getContaCorrente().getSaldo();

        if ((saldoAtual > 0) && (quantia > 0)) {
            saldoAtual += quantia;

            System.out.println("Depósito realizado com sucesso!");
        }

        System.out.println("A quantia deve ser maior que zero e o saldo positivo!");
        return -1;
    }
}
