public class Cliente extends Pessoa {

    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public Cliente(String nome, String cpf, String dataNascimento, ContaCorrente contaCorrente,
            ContaPoupanca contaPoupanca) {
        super(nome, cpf, dataNascimento);
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
    }
}
