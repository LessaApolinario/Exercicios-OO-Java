import java.util.Scanner;

public class Main {

    static GerenciadorDeClientes gerenciadorDeClientes = new GerenciadorDeClientes();
    static GerenciadorDeContas gerenciadorDeContas = new GerenciadorDeContas();

    public static void main(String[] args) {
        abrirDialogoCadastrarCliente();
        abrirDialogoSacar();
    }

    public static void abrirDialogoCadastrarCliente() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o nome do cliente? ");
        String nome = in.nextLine();

        System.out.println("Qual é o cpf do cliente? ");
        String cpf = in.nextLine();

        System.out.println("Qual é a data de nascimento do cliente? ");
        String dataNascimento = in.nextLine();

        // Abrindo a conta corrente
        System.out.println("Qual é o número da conta corrente? ");
        int numeroConta = in.nextInt();

        System.out.println("Qual é a taxa da conta corrente? ");
        double taxa = in.nextDouble();

        System.out.println("Qual é o saldo da conta corrente? ");
        double saldo = in.nextDouble();
        limparBuffer(in);

        System.out.println("Qual é o nome do banco da conta corrente? ");
        String banco = in.nextLine();

        ContaCorrente cc = gerenciadorDeContas.abrirContaCorrente(numeroConta, taxa, saldo, banco);

        // Abrindo a conta poupança
        System.out.println("Qual é o número da conta poupança? ");
        int numeroContaPoupanca = in.nextInt();

        System.out.println("Qual é a taxa da conta poupança? ");
        double taxaContaPoupanca = in.nextDouble();

        System.out.println("Qual é o saldo da conta poupança? ");
        double saldoContaPoupanca = in.nextDouble();
        limparBuffer(in);

        System.out.println("Qual é o nome do banco da conta poupança? ");
        String bancoContaPoupanca = in.nextLine();

        ContaPoupanca cp = gerenciadorDeContas.abrirContaPoupanca(numeroContaPoupanca, taxaContaPoupanca,
                saldoContaPoupanca, bancoContaPoupanca);

        gerenciadorDeClientes.cadastrarCliente(nome, cpf, dataNascimento, cc, cp);
    }

    public static void abrirDialogoSacar() {
        Scanner in = new Scanner(System.in);

        // O cpf deve ter tamanho/length 14 e não pode ser vazio
        System.out.println("Qual é o cpf do cliente? ");
        String cpf = in.nextLine();

        Cliente clienteProcurado = gerenciadorDeClientes.buscarCliente(cpf);

        System.out.println("Qual é a quantia a ser sacada? ");
        double quantiaSaque = in.nextDouble();
        /**
         * O método sacar está na classe ContaCorrente,
         * que por sua vez pode ser uma conta de um determinado cliente,
         * logo podemos procurá-la através da busca de um cliente.
         */
        double saque = clienteProcurado.getContaCorrente().sacar(quantiaSaque, clienteProcurado);

        clienteProcurado.getContaCorrente().setSaldo(saque);
    }

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
