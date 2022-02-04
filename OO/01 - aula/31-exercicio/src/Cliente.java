public class Cliente {

    private String nome;
    private String cpf;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    public Cliente(String nome, String cpf, ContaCorrente contaCorrente,
            ContaPoupanca contaPoupanca) {
        if (!nome.equals("")) {
            this.nome = nome;
        }

        if (!cpf.equals("") && cpf.length() == 14) {
            this.cpf = cpf;
        }

        if (contaCorrente != null) {
            this.contaCorrente = contaCorrente;
        }

        if (contaPoupanca != null) {
            this.contaPoupanca = contaPoupanca;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }
}
