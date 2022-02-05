import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static GerenciadorDeFuncionarios gerenciadorDeFuncionarios = new GerenciadorDeFuncionarios();

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
                    abrirDialogoAdicionarFuncionario();
                    break;
                case 2:
                    abrirDialogoAdicionarGerente();
                    break;
                case 3:
                    listarFuncionarios(gerenciadorDeFuncionarios.getFuncionarios());
                    break;
                case 4:
                    mostrarSalarioGerente();
                    break;
            }
        } while (op != 0);
    }

    public static void abrirDialogoAdicionarFuncionario() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o nome do funcionário? ");
        String nome = in.nextLine();

        System.out.println("Qual é o cpf do funcionário? ");
        String cpf = in.nextLine();

        System.out.println("Qual é o salário do funcionário? ");
        double salario = in.nextDouble();
        limparBuffer(in);

        System.out.println("Qual é a data de nascimento do funcionário? ");
        String dataNascimento = in.nextLine();

        gerenciadorDeFuncionarios.adicionarFuncionario(nome, cpf, salario, dataNascimento);
    }

    public static void abrirDialogoAdicionarGerente() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o nome do gerente? ");
        String nome = in.nextLine();

        System.out.println("Qual é o cpf do gerente? ");
        String cpf = in.nextLine();

        System.out.println("Qual é o salário do gerente? ");
        double salario = in.nextDouble();
        limparBuffer(in);

        System.out.println("Qual é a data de nascimento do gerente? ");
        String dataNascimento = in.nextLine();

        gerenciadorDeFuncionarios.adicionarGerente(nome, cpf, salario, dataNascimento);
    }

    public static void listarFuncionarios(ArrayList<Funcionario> funcionarios) {
        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
    }

    public static void mostrarSalarioGerente() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o cpf do gerente? ");
        String cpf = in.nextLine();

        Gerente gerenteProcurado = gerenciadorDeFuncionarios.buscarGerente(cpf);

        if (gerenteProcurado != null) {
            // O salário do gerente é igual ao getSalario() + 2000!
            System.out.println("O salário do gerente é " + gerenteProcurado.calcularSalario());
        }
    }

    public static void menu() {
        System.out.println("1. Adicionar Funcionário");
        System.out.println("2. Adicionar Gerente");
        System.out.println("3. Listar todos os funcionários");
        System.out.println("4. Mostrar o salário do gerente (procurar pelo CPF)");
        System.out.println("0. Sair");
    }

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
