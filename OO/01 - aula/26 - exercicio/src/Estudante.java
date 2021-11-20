import java.util.Scanner;

public class Estudante {

  private String nome;
  private int numMatricula;
  private String endereco;
  private double nota1;
  private double nota2;

  public Estudante(
    String nome,
    int numMatricula,
    String endereco,
    double nota1,
    double nota2
  ) {
    this.nome = nome;

    if (numMatricula > 0) {
      this.numMatricula = numMatricula;
    }

    this.endereco = endereco;

    if (nota1 >= 0 && nota1 <= 10) {
      this.nota1 = nota1;
    }

    if (nota2 >= 0 && nota2 <= 10) {
      this.nota2 = nota2;
    }
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNumMatricula(int numMatricula) {
    if (numMatricula > 0) {
      this.numMatricula = numMatricula;
    }
  }

  public int getNumMatricula() {
    return numMatricula;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setNota1(double nota1) {
    if (nota1 >= 0 && nota1 <= 10) {
      this.nota1 = nota1;
    }
  }

  public double getNota1() {
    return nota1;
  }

  public void setNota2(double nota2) {
    if (nota2 >= 0 && nota2 <= 10) {
      this.nota2 = nota2;
    }
  }

  public double getNota2() {
    return nota2;
  }

  public void cadastrarEstudante() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o nome do aluno: ");
    setNome(input.nextLine());

    System.out.println("Digite o número da matrícula: ");
    setNumMatricula(input.nextInt());
    limparBuffer(input);

    System.out.println("Digite o endereço do aluno: ");
    setEndereco(input.nextLine());

    System.err.println("Digite a primeira nota: ");
    setNota1(input.nextDouble());

    System.err.println("Digite a segunda nota: ");
    setNota2(input.nextDouble());
  }

  public double mediaEstudante() {
    return (getNota1() + getNota2()) / 2;
  }

  public double mediaDaTurma(Estudante[] estudanteArray, int numAlunos) {
    int total = 0;

    for (int i = 0; i < estudanteArray.length; i++) {
      total += estudanteArray[i].getNota1() + estudanteArray[i].getNota2();
    }

    return (double) total / (numAlunos * estudanteArray.length);
  }

  public void reprovados(Estudante[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].mediaEstudante() < 7) {
        System.out.println(
          "O aluno " +
          array[i].getNome() +
          " está reprovado com média igual a " +
          array[i].mediaEstudante()
        );
      }
    }
  }

  public void menu() {
    System.out.println("1. Cadastrar um estudante");
    System.out.println("2. Calcular média de um estudante");
    System.out.println("3. Consultar matricula de um estudante");
    System.out.println("4. Consultar endereço de um estudante");
    System.out.println("5. Calcular a média da turma");
    System.out.println("6. Exibir os nomes dos estudantes reprovados");
    System.out.println("0. Sair");
  }

  public void consultarMediaEstudante(Estudante[] array, String nomeDigitado) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].getNome().equals(nomeDigitado)) {
        System.out.println(
          "A média do estudante " +
          array[i].getNome() +
          " é " +
          array[i].mediaEstudante()
        );
      }
    }
  }

  public void consutraMatriculaEstudante(
    Estudante[] array,
    int numeroDaMatricula
  ) {
    int inicio = 0;
    int meio = 0;
    int fim = array.length - 1;

    while (inicio <= fim) {
      meio = (fim + inicio) / 2;

      if (array[meio].getNumMatricula() == numeroDaMatricula) {
        System.out.println(
          "A matrícula do aluno " +
          array[meio].getNome() +
          " é " +
          array[meio].getNumMatricula()
        );
        break;
      }

      if (array[meio].getNumMatricula() < numeroDaMatricula) {
        inicio = meio + 1;
      } else {
        fim = meio - 1;
      }

      if (inicio > fim) {
        System.out.println(
          "A matrícula " + numeroDaMatricula + " não foi encontrada!"
        );
      }
    }
  }

  public void consultarEnderecoEstudante(
    Estudante[] array,
    String enderecoDigitado
  ) {
    for (int i = 0; i < array.length; i++) {
      if (array[i].getEndereco().equals(enderecoDigitado)) {
        System.out.println(
          "O endereço do aluno " +
          array[i].getNome() +
          " é " +
          array[i].getEndereco()
        );
      }
    }
  }

  public static void limparBuffer(Scanner sc) {
    if (sc.hasNextLine()) {
      sc.nextLine();
    }
  }
}
