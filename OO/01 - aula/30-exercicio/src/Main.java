import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    public static void abrirDialogoCadastrarAluno() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o nome do novo aluno? ");
        String nome = in.nextLine();

        System.out.println("Qual é o CPF do novo aluno? ");
        String cpf = in.nextLine();

        System.out.println("Qual é a data de nascimento do novo aluno? ");
        String dataNascimento = in.nextLine();

        System.out.println("Qual é a nota 1 do novo aluno? ");
        double nota1 = in.nextDouble();

        System.out.println("Qual é a nota 2 do novo aluno? ");
        double nota2 = in.nextDouble();

        System.out.println("Qual é a nota 3 do novo aluno? ");
        double nota3 = in.nextDouble();

        System.out.println("Qual é a nota 4 do novo aluno? ");
        double nota4 = in.nextDouble();

        /// TODO: cadastrarAluno e passar os atributos
    }

    public static void abrirDialogoCadastrarProfessor() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o nome do novo professor? ");
        String nome = in.nextLine();

        System.out.println("Qual é o CPF do novo professor? ");
        String cpf = in.nextLine();

        System.out.println("Qual é a data de nascimento do novo professor? ");
        String dataNascimento = in.nextLine();

        System.out.println("Qual é o salário do novo professor? ");
        double salario = in.nextDouble();

        /// TODO: cadastrarProfessor e passar os atributos
    }

    public static void menu() {
        System.out.println("\n--------------------\n");
        System.out.println("1. Cadastrar Aluno");
        System.out.println("2. Cadastrar Professor");
        System.out.println("3. Obter média Aluno");
        System.out.println("4. Obter informações do Aluno");
        System.out.println("5. Obter informações do Professor");
        System.out.println("0. Sair");
        System.out.println("\n--------------------\n");
    }
}
