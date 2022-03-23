import java.util.ArrayList;

public class GerenciadorDeContas {

    private ArrayList<Conta> contas;

    public GerenciadorDeContas() {
        this.contas = new ArrayList<>();
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public ContaCorrente abrirContaCorrente(String senha, int numeroConta, double taxa, double saldo, String banco) {
        ContaCorrente cc = new ContaCorrente(senha, numeroConta, taxa, saldo, banco);

        contas.add(cc);

        System.out.println("Conta corrente aberta com sucesso!");
        return cc;
    }

    public ContaPoupanca abrirContaPoupanca(String senha, int numeroConta, double taxa, double saldo, String banco) {
        ContaPoupanca cp = new ContaPoupanca(senha, numeroConta, taxa, saldo, banco);

        contas.add(cp);

        System.out.println("Conta poupança aberta com sucesso!");
        return cp;
    }

    public boolean validarSenhaContaCliente(String senha, Conta c) {
        String senhaCliente = c.getSenha();

        if (senha.equals(senhaCliente)) {
            return true;
        }

        return false;
    }

    public Conta buscarConta(Cliente cliente) {
        for (Conta conta : contas) {
            Cliente clienteProcurado = conta.getCliente();

            if (cliente.equals(clienteProcurado)) {
                return conta;
            }
        }

        return null;
    }
}
