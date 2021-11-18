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

  public void cadastrarEstudante(Estudante[] estudanteArray, int posicao) {
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

    estudanteArray[posicao] =
      new Estudante(nome, numMatricula, endereco, nota1, nota2);

    System.out.println("Estudante cadastrado com sucesso!");
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

  /**
   * Método para debugar,
   * será deletado assim que
   * o exercício tenha sido concluído!
   */
  public void display(Estudante[] estudanteArray, int posicao) {
    System.err.println(
      "Nome: " +
      estudanteArray[posicao].getNome() +
      "\n" +
      "Número: " +
      estudanteArray[posicao].getNumMatricula() +
      "\n" +
      "Endereço: " +
      estudanteArray[posicao].getEndereco() +
      "\n" +
      "Nota 1: " +
      estudanteArray[posicao].getNota1() +
      "\n" +
      "Nota 2: " +
      estudanteArray[posicao].getNota2()
    );
  }

  public static void limparBuffer(Scanner sc) {
    if (sc.hasNextLine()) {
      sc.nextLine();
    }
  }
}
