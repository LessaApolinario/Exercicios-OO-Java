import java.util.Scanner;

public class Main {

    static GerenciadorDePessoas gerenciadorDePessoas = new GerenciadorDePessoas();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int op = -1;

        do {
            Main.menu();
            System.out.println("Escolha uma opção: ");
            op = in.nextInt();
            limparBuffer(in);

            switch (op) {
                case 1:
                    abrirDialogoCadastrarAluno();
                    break;
                case 2:
                    abrirDialogoCadastrarProfessor();
                    break;
                case 3:
                    System.out.println("Qual é o CPF do aluno? ");
                    String cpf = in.nextLine();

                    Aluno alunoEncontrado = gerenciadorDePessoas.buscarAluno(cpf);

                    Professor p = new Professor("João", "123.456.789-01", "01/01/1970", 2000);
                    System.out.println(p.obterMediaAluno(alunoEncontrado));
                    break;
                case 4:
                    System.out.println("Qual é o CPF do aluno? ");
                    cpf = in.nextLine();

                    gerenciadorDePessoas.obterInformacoesAluno(cpf);
                    break;
                case 5:
                    System.out.println("Qual é o cpf do professor? ");
                    cpf = in.nextLine();

                    gerenciadorDePessoas.obterInformacoesProfessor(cpf);
                    break;
            }

        } while (op != 0);
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

        gerenciadorDePessoas.cadastrarAluno(nome, cpf, dataNascimento, nota1, nota2, nota3, nota4);
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

        gerenciadorDePessoas.cadastrarProfessor(nome, cpf, dataNascimento, salario);
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

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
