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
                    realizarLogin(op);
                    break;
                case 0:
                    System.out.println("Você saiu!");
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
        String tipoConta = in.nextLine();

        try {
            Cliente clienteCadastrado = gerenciadorDeClientes.cadastrarCliente(nome, cpf);
            ArrayList<Conta> contas = gerenciadorDeContas.getContas();

            if (tipoConta.equals("CC")) {
                abrirDialogoAbrirContaCorrente(clienteCadastrado, contas);
            } else if (tipoConta.equals("CP")) {
                abrirDialogoAbrirContaPoupanca(clienteCadastrado, contas);
            }
        } catch (NullPointerException error) {
            System.out.println(error.getMessage());
            System.out.println("O o cliente não foi cadastrado!");
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

    public static void abrirDialogoSacar() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o seu cpf? ");
        String cpf = in.nextLine();

        try {
            Cliente cliente = gerenciadorDeClientes.buscarCliente(cpf);

            System.out.println("Digite a senha da sua conta: ");
            String senha = in.nextLine();

            Conta contaValida = gerenciadorDeContas.buscarConta(cliente);
            boolean eSenhaValida = gerenciadorDeContas.validarSenhaContaCliente(senha, contaValida);

            if (eSenhaValida) {
                System.out.println("Qual é a quantia a ser sacada? ");
                double quantia = in.nextDouble();

                try {
                    contaValida.sacar(quantia);
                    System.out.println("Sacando...");
                } catch (SaldoInsuficienteException error) {
                    System.out.println(error.getMessage());
                } catch (QuantiaIndisponivelException error) {
                    System.out.println(error.getMessage());
                }
            }
        } catch (NullPointerException error) {
            System.out.println(error.getMessage());
            System.out.println("O cliente não foi encontrado!");
        }
    }

    public static void abrirDialogoDepositar() {
        Scanner in = new Scanner(System.in);

        System.out.println("cpf: ");
        String cpf = in.nextLine();

        try {
            Cliente cliente = gerenciadorDeClientes.buscarCliente(cpf);

            System.out.println("Senha: ");
            String senha = in.nextLine();

            Conta contaValida = gerenciadorDeContas.buscarConta(cliente);
            boolean eSenhaValida = gerenciadorDeContas.validarSenhaContaCliente(senha, contaValida);

            if (eSenhaValida) {
                System.out.println("Quantia: ");
                double quantia = in.nextDouble();

                try {
                    contaValida.depositar(quantia);
                    System.out.println("Depositando...");
                } catch (SaldoInsuficienteException error) {
                    System.out.println(error.getMessage());
                } catch (QuantiaNegativaException error) {
                    System.out.println(error.getMessage());
                }
            }
        } catch (NullPointerException error) {
            System.out.println(error.getMessage());
            System.out.println("O cliente não foi encontrado!");
        }
    }

    public static void realizarLogin(int op) {
        Scanner in = new Scanner(System.in);

        System.out.println("CPF: ");
        String cpf = in.nextLine();

        System.out.println("Senha: ");
        String senha = in.nextLine();

        try {
            Cliente cliente = gerenciadorDeClientes.buscarCliente(cpf);
            Conta conta = gerenciadorDeContas.buscarConta(cliente);
            boolean autenticacaoCliente = gerenciadorDeContas.validarSenhaContaCliente(senha, conta);

            if (autenticacaoCliente) {
                do {
                    menuConta();
                    op = in.nextInt();
                    limparBuffer(in);

                    switch (op) {
                        case 1:
                            abrirDialogoSacar();
                            break;
                        case 2:
                            abrirDialogoDepositar();
                            break;
                        case 0:
                            System.out.println("Saindo da conta...");
                            break;
                    }
                } while (op != 0);
            }
        } catch (NullPointerException error) {
            System.out.println(error.getMessage());
            System.out.println("O cliente não foi encontrado...");
        }
    }

    public static void menu() {
        System.out.println("1. Cadastrar Cliente (Incluindo Conta corrente ou Poupança)");
        System.out.println("2. Realizar login");
        System.out.println("0. Sair");
    }

    public static void menuConta() {
        System.out.println("1. Saque");
        System.out.println("2. Depósito");
        System.out.println("0. Sair");
    }

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
