public class Conta {

    private int numeroConta;
    private double taxa;
    private double saldo;
    private String banco;

    public Conta(int numeroConta, double taxa, double saldo, String banco) {
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
}
