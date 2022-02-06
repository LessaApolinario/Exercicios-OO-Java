public class GerenciadorDeContas {

    public ContaCorrente abrirContaCorrente(String senha, int numeroConta, double taxa, double saldo, String banco) {
        ContaCorrente cc = new ContaCorrente(senha, numeroConta, taxa, saldo, banco);

        return cc;
    }

    public ContaPoupanca abrirContaPoupanca(String senha, int numeroConta, double taxa, double saldo, String banco) {
        ContaPoupanca cp = new ContaPoupanca(senha, numeroConta, taxa, saldo, banco);

        return cp;
    }

    /**
     *
     * @param senha - A senha que o cliente digitar.
     * @param c     - A conta do cliente, que pode ser poupança ou corrente.
     * @return - retorna false se a senha não existir e true se o cliente conseguir
     *         acessar.
     */
    public boolean validarSenhaContaCliente(String senha, Conta c) {
        String senhaCliente = c.getSenha();

        if (senha.equals(senhaCliente)) {
            return true;
        }

        return false;
    }
}
