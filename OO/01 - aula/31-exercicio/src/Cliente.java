public class Cliente extends Pessoa {

    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public Cliente(String nome, String cpf, String dataNascimento, ContaCorrente contaCorrente,
            ContaPoupanca contaPoupanca) {
        super(nome, cpf, dataNascimento);

        if (contaCorrente != null) {
            this.contaCorrente = contaCorrente;
        }

        if (contaPoupanca != null) {
            this.contaPoupanca = contaPoupanca;
        }
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        if (contaCorrente != null) {
            this.contaCorrente = contaCorrente;
        }
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        if (contaPoupanca != null) {
            this.contaPoupanca = contaPoupanca;
        }
    }
}
