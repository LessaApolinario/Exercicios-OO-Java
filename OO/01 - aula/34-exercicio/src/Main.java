import java.util.Scanner;

public class Main {

    static GerenciadorDeFuncionarios gerenciadorDeFuncionarios = new GerenciadorDeFuncionarios();
    static GerenciadorDeGerentes gerenciadorDeGerentes = new GerenciadorDeGerentes();

    public static void main(String[] args) {

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

        System.out.println("Departamento: ");
        String departamento = in.nextLine();

        gerenciadorDeGerentes.cadastrarGerente(nome, cpf, dataNascimento, salario, departamento);
        System.out.println("Gerente cadastrado com sucesso!");
    }
}
