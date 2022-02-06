import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static GerenciadorDeClientes gerenciadorDeClientes = new GerenciadorDeClientes();
    static GerenciadorDeContas gerenciadorDeContas = new GerenciadorDeContas();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int op = -1;

        do {
            menu();
            System.out.println("Escolha uma opção: ");
            op = in.nextInt();
            limparBuffer(in);

            switch (op) {
                case 1:
                    abrirDialogoCadastrarCliente();
                    break;
                case 2:
                    abrirDialogoSacarContaCorrente();
                    break;
                case 3:
                    abrirDialogoSacarContaPoupanca();
                    break;
                case 4:
                    abrirDialogoDepositarContaCorrente();
                    break;
                case 5:
                    abrirDialogoDepositarContaPoupanca();
                    break;
            }
        } while (op != 0);
    }

    public static void abrirDialogoCadastrarCliente() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o nome do cliente? ");
        String nome = in.nextLine();

        System.out.println("Qual é o cpf do cliente? ");
        String cpf = in.nextLine();

        gerenciadorDeClientes.cadastrarCliente(nome, cpf);

        System.out.println("Qual é o tipo de conta? (CC ou CP)? ");
        String tipoDeConta = in.nextLine();

        Cliente clienteCadastrado = gerenciadorDeClientes.cadastrarCliente(nome, cpf);

        if (clienteCadastrado != null) {
            ArrayList<Conta> contas = gerenciadorDeContas.getContas();

            if (tipoDeConta.equals("CC")) {
                abrirDialogoAbrirContaCorrente(clienteCadastrado, contas);
            } else if (tipoDeConta.equals("CP")) {
                abrirDialogoAbrirContaPoupanca(clienteCadastrado, contas);
            }
        }
    }

    public static void abrirDialogoAbrirContaCorrente(Cliente c, ArrayList<Conta> contas) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o número da conta corrente? ");
        int numeroConta = in.nextInt();

        System.out.println("Qual é a taxa da conta corrente? ");
        double taxa = in.nextDouble();

        System.out.println("Qual é o saldo da conta corrente? ");
        double saldo = in.nextDouble();
        limparBuffer(in);

        System.out.println("Qual é o nome do banco da conta corrente? ");
        String banco = in.nextLine();

        System.out.println("Qual é a senha da conta corrente? ");
        String senha = in.nextLine();

        ContaCorrente conta = gerenciadorDeContas.abrirContaCorrente(senha, numeroConta, taxa, saldo, banco);
        c.addContaCorrente(conta, contas); // Adicionando a conta do cliente
    }

    public static void abrirDialogoAbrirContaPoupanca(Cliente c, ArrayList<Conta> contas) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o número da conta poupança? ");
        int numeroConta = in.nextInt();

        System.out.println("Qual é a taxa da conta poupança? ");
        double taxa = in.nextDouble();

        System.out.println("Qual é o saldo da conta poupança? ");
        double saldo = in.nextDouble();
        limparBuffer(in);

        System.out.println("Qual é o nome do banco da conta poupança? ");
        String banco = in.nextLine();

        System.out.println("Qual é a senha da conta poupança? ");
        String senha = in.nextLine();

        ContaPoupanca conta = gerenciadorDeContas.abrirContaPoupanca(senha, numeroConta, taxa, saldo, banco);
        c.addContaPoupanca(conta, contas);
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
            System.out.println("Saldo atual (conta corrente) : " + contaCorrenteCliente.getSaldo());
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
            System.out.println("Saldo atual (conta poupança): " + contaPoupancaCliente.getSaldo());
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
            System.out.println("Saldo atual (conta corrente) : " + contaCorrenteCliente.getSaldo());
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
            System.out.println("Saldo atual (conta poupança): " + contaPoupancaCliente.getSaldo());
        }
    }

    public static void menu() {
        System.out.println("1. Cadastrar Cliente (Incluindo Conta corrente e Poupança)");
        System.out.println("2. Saque da conta corrente (Procurar pelo CPF do Cliente)");
        System.out.println("3. Saque da poupança (Procurar pelo CPF do Cliente)");
        System.out.println("4. Depósito da conta corrente (Procurar pelo CPF do Cliente)");
        System.out.println("5. Depósito da poupança (Procurar pelo CPF do Cliente)");
        System.out.println("0. Sair");
    }

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
