import java.util.Scanner;

public class Main {

    static GerenciadorDeFuncionarios gerenciadorDeFuncionarios = new GerenciadorDeFuncionarios();

    public static void main(String[] args) {

    }

    public static void abrirDialogCadastarFuncionario() {
        Scanner in = new Scanner(System.in);

        System.out.println(
            "String nome, String cpf, String dataNascimento, double salario"
        );

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
}
