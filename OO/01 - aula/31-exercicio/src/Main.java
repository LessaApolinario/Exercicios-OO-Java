import java.util.Scanner;

public class Main {

    static GerenciadorDeClientes gerenciadorDeClientes = new GerenciadorDeClientes();
    static GerenciadorDeContas gerenciadorDeContas = new GerenciadorDeContas();

    public static void main(String[] args) {

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

    public static void abrirDialogoSacarContaCorrente() {
        Scanner in = new Scanner(System.in);

        // O cpf deve ter tamanho/length 14 e não pode ser vazio
        System.out.println("Qual é o cpf do cliente? ");
        String cpf = in.nextLine();

        Cliente clienteProcurado = gerenciadorDeClientes.buscarCliente(cpf);

        if (clienteProcurado != null) {
            System.out.println("Qual é a quantia a ser sacada? ");
            double quantiaSaque = in.nextDouble();

            /**
             * O método sacar está na classe ContaCorrente,
             * que por sua vez pode ser uma conta de um determinado cliente,
             * logo podemos procurá-la através da busca de um cliente.
             */
            ContaCorrente contaCorrenteCliente = clienteProcurado.getContaCorrente();
            double saque = contaCorrenteCliente.sacar(quantiaSaque, clienteProcurado);
            contaCorrenteCliente.setSaldo(saque);
        }
    }

    public static void abrirDialogoSacarContaPoupanca() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o cpf do cliente? ");
        String cpf = in.nextLine();

        Cliente clienteProcurado = gerenciadorDeClientes.buscarCliente(cpf);

        if (clienteProcurado != null) {
            System.out.println("Qual é a quantia a ser sacada? ");
            double quantiaSaque = in.nextDouble();

            // Recebendo a conta do cliente
            ContaPoupanca contaPoupancaCliente = clienteProcurado.getContaPoupanca();
            // realizando o depósito
            double saque = contaPoupancaCliente.sacar(quantiaSaque, clienteProcurado);
            // atualizando o saldo da conta poupança do cliente
            contaPoupancaCliente.setSaldo(saque);
        }
    }

    public static void abrirDialogoDepositarContaCorrente() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o cpf do cliente? ");
        String cpf = in.nextLine();

        Cliente clienteProcurado = gerenciadorDeClientes.buscarCliente(cpf);

        if (clienteProcurado != null) {
            System.out.println("Qual é a quantia a ser depositada?");
            double quantiaDeposito = in.nextDouble();

            ContaCorrente contaCorrenteCliente = clienteProcurado.getContaCorrente();
            double deposito = contaCorrenteCliente.depositar(quantiaDeposito, clienteProcurado);
            contaCorrenteCliente.setSaldo(deposito);
        }
    }

    public static void abrirDialogoDepositarContaPoupanca() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o cpf do cliente? ");
        String cpf = in.nextLine();

        Cliente clienteProcurado = gerenciadorDeClientes.buscarCliente(cpf);

        if (clienteProcurado != null) {
            System.out.println("Qual é a quantia a ser depositada? ");
            double quantiaDeposito = in.nextDouble();

            ContaPoupanca contaPoupancaCliente = clienteProcurado.getContaPoupanca();
            double deposito = contaPoupancaCliente.depositar(quantiaDeposito, clienteProcurado);
            contaPoupancaCliente.setSaldo(deposito);
        }
    }

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
