public abstract class Conta {

    private Cliente cliente;
    private String senha;
    private int numeroConta;
    private double taxa;
    private double saldo;
    private String banco;

    public Conta(String senha, int numeroConta, double taxa, double saldo, String banco) {
        if (!senha.equals("")) {
            this.senha = senha;
        }

        if (numeroConta > 0) {
            this.numeroConta = numeroConta;
        }

        if (taxa >= 0) {
            this.taxa = taxa;
        }

        if (saldo >= 0) {
            this.saldo = saldo;
        }

        if (!banco.equals("")) {
            this.banco = banco;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (!senha.equals("")) {
            this.senha = senha;
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta > 0) {
            this.numeroConta = numeroConta;
        }
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        if (taxa >= 0) {
            this.taxa = taxa;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        if (!banco.equals("")) {
            this.banco = banco;
        }
    }

    public double sacar(double quantia) {
        double saldoAtual = this.getSaldo();

        if (saldoAtual > 0 && (quantia <= saldoAtual)) {
            saldoAtual -= quantia;

            System.out.println("Saque realizado com sucesso!");
            return saldoAtual;
        }

        System.out.println("O saldo deve ser positivo e a quantia deve ser menor ou igual ao saldo!");
        return -1;
    }

    public double depositar(double quantia) {
        double saldoAtual = this.getSaldo();

        if ((saldoAtual > 0) && (quantia > 0)) {
            saldoAtual += quantia;

            System.out.println("Depósito realizado com sucesso!");
            return saldoAtual;
        }

        System.out.println("A quantia deve ser maior que zero e o saldo positivo!");
        return -1;
    }
}
