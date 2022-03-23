import java.util.ArrayList;

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

    public void addContaPoupanca(ContaPoupanca conta, ArrayList<Conta> contas) {
        contas.add(conta);
    }

    public void addContaCorrente(ContaCorrente conta, ArrayList<Conta> contas) {
        contas.add(conta);
    }

    public ArrayList<Conta> getContasPoupanca(ArrayList<Conta> contas) {
        ArrayList<Conta> contasPoupanca = new ArrayList<>();

        for (Conta conta : contas) {
            if (conta instanceof ContaPoupanca) {
                /// BUG: Conta cannot resolve for a ContaPoupanca type
                contasPoupanca.add(conta);
            }
        }

        return contasPoupanca;
    }

    public ArrayList<Conta> getContasCorrente(ArrayList<Conta> contas) {
        ArrayList<Conta> contasCorrente = new ArrayList<>();

        for (Conta conta : contas) {
            if (conta instanceof ContaCorrente) {
                contasCorrente.add(conta);
            }
        }

        return contasCorrente;
    }
}
