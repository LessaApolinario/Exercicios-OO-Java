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

            /// TODO: Refactor this menu
            switch (op) {
                case 1:
                    abrirDialogoCadastrarCliente();
                    break;
                case 2:
                    // abrirDialogoSacarContaCorrente();
                    break;
                case 3:
                    // abrirDialogoSacarContaPoupanca();
                    break;
                case 4:
                    // abrirDialogoDepositarContaCorrente();
                    break;
                case 5:
                    // abrirDialogoDepositarContaPoupanca();
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

    /// TODO: Refactor sacar and depositar
    public static void abrirDialogoSacar() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o seu cpf? ");
        String cpf = in.nextLine();

        Cliente cliente = gerenciadorDeClientes.buscarCliente(cpf);

        if (cliente != null) {
            System.out.println("Digite a senha da sua conta: ");
            String senha = in.nextLine();

            Conta contaValida = gerenciadorDeContas.buscarConta(cliente);
            boolean eSenhaValida = gerenciadorDeContas.validarSenhaContaCliente(senha, contaValida);

            if (contaValida != null && eSenhaValida == true) {
                System.out.println("Qual é a quantia a ser sacada? ");
                double quantia = in.nextDouble();

                try {
                    contaValida.sacar(quantia);
                } catch (SaldoInsuficienteException error) {
                    System.out.println(error.getMessage());
                } catch (QuantiaIndisponivelException error) {
                    System.out.println(error.getMessage());
                }
            }
        }
    }

    public static void menu() {
        System.out.println("1. Cadastrar Cliente (Incluindo Conta corrente ou Poupança)");
        System.out.println("0. Sair");
    }

    public static void submenu() {
        System.out.println("1. Saque");
        System.out.println("2. Depósito");
    }

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
