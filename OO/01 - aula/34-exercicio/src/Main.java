import java.util.Scanner;

public class Main {

    static GerenciadorDeFuncionarios gerenciadorDeFuncionarios = new GerenciadorDeFuncionarios();
    static GerenciadorDeGerentes gerenciadorDeGerentes = new GerenciadorDeGerentes();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op = -1;

        do {
            menu();
            op = in.nextInt();
            limparBuffer(in);

            switch (op) {
                case 1:
                    abrirDialogCadastarFuncionario();
                    break;
                case 2:
                    abrirDialogCadastarGerente();
                    break;
                case 3:
                    abrirDialogObterSalarioFuncionario();
                    break;
                case 4:
                    abrirDialogObterSalarioGerente();
                    break;
                case 0:
                    System.out.println("Você saiu!");
                    break;
            }

        } while (op != 0);
    }

    public static void abrirDialogCadastarFuncionario() {
        Scanner in = new Scanner(System.in);

        System.out.println("Bem-vindo ao cadastro de funcionários!");
        System.out.println("Nome: ");
        String nome = in.nextLine();

        System.out.println("cpf: ");
        String cpf = in.nextLine();

        System.out.println("Data de nascimento: ");
        String dataNascimento = in.nextLine();

        System.out.println("Salário: ");
        double salario = in.nextDouble();

        gerenciadorDeFuncionarios.cadastrarFuncionario(nome, cpf, dataNascimento, salario);
        System.out.println("Funcionário cadastrado com sucesso!");
    }

    public static void abrirDialogCadastarGerente() {
        Scanner in = new Scanner(System.in);

        System.out.println("Bem-vindo ao cadastro de gerentes!");
        System.out.println("Nome: ");
        String nome = in.nextLine();

        System.out.println("cpf: ");
        String cpf = in.nextLine();

        System.out.println("Data de nascimento: ");
        String dataNascimento = in.nextLine();

        System.out.println("Salário: ");
        double salario = in.nextDouble();
        limparBuffer(in);

        System.out.println("Departamento: ");
        String departamento = in.nextLine();

        gerenciadorDeGerentes.cadastrarGerente(nome, cpf, dataNascimento, salario, departamento);
        System.out.println("Gerente cadastrado com sucesso!");
    }

    public static void abrirDialogObterSalarioFuncionario() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o cpf do funcionário? ");
        String cpf = in.nextLine();

        gerenciadorDeFuncionarios.obterSalarioFuncionario(cpf);
    }

    public static void abrirDialogObterSalarioGerente() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o cpf do gerente? ");
        String cpf = in.nextLine();

        gerenciadorDeGerentes.obterSalarioGerente(cpf);
    }

    public static void menu() {
        System.out.println("##############################");
        System.out.println("1. Adicionar Funcionário");
        System.out.println("2. Adicionar Gerente");
        System.out.println("3. Obter salário de Funcionário");
        System.out.println("4. Obter salário Gerente");
        System.out.println("0. Sair");
        System.out.println("##############################");
        System.out.println(">");
    }

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
