public class Cliente {

    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        if (!nome.equals("")) {
            this.nome = nome;
        }

        this.cpf = cpf;
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
    /// TODO: implement these methodss
    /*
     * public void addContaPoupanca(ContaPoupanca conta) {
     * contas.add(conta)
     * }
     *
     * public void addContaCorrente(ContaCorrente conta) {
     * contas.add(conta)
     * }
     *
     * public ArrayList<ContaPoupanca> getContasPoupancas () {
     * ArrayList <ContaPoupanca> contasPoupanca = new ArrayList<>();
     *
     * for (Conta conta : contas) {
     * if (conta instanceof ContaPoupanca) {
     * contasPoupanca.add(conta)
     * }
     * }
     *
     * return contasPoupanca
     * }
     */
}
