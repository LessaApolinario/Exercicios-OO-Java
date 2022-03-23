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

    public double sacar(double quantia) throws SaldoInsuficienteException,
            QuantiaIndisponivelException {
        double saldoAtual = this.getSaldo();

        if (saldoAtual <= 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque!");
        }

        if (quantia > saldoAtual) {
            throw new QuantiaIndisponivelException("Quantidade indisponível para saque!");
        }

        saldoAtual -= quantia;
        System.out.println("Saque realizado com sucesso!");

        return saldoAtual;
    }

    public double depositar(double quantia) throws SaldoInsuficienteException,
            QuantiaNegativaException {
        double saldoAtual = this.getSaldo();

        if (saldoAtual <= 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque!");
        }

        if (quantia < 0) {
            throw new QuantiaNegativaException("A quantidade a ser depositada não pode ser negativa...");
        }

        saldoAtual += quantia;

        System.out.println("Depósito realizado com sucesso!");
        return saldoAtual;
    }
}
