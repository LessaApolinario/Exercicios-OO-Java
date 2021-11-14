import java.util.Scanner;

public class Estudante {

  private String nome;
  private int numeroMatricula;
  private String endereco;
  private double nota1;
  private double nota2;
  private double nota3;
  private double nota4;

  public Estudante(
    String nome,
    int numeroMatricula,
    String endereco,
    double nota1,
    double nota2,
    double nota3,
    double nota4
  ) {
    this.nome = nome;

    if (numeroMatricula >= 0) {
      this.numeroMatricula = numeroMatricula;
    }

    this.endereco = endereco;

    if (nota1 >= 0 && nota1 <= 10) {
      this.nota1 = nota1;
    }

    if (nota2 >= 0 && nota2 <= 10) {
      this.nota2 = nota2;
    }

    if (nota3 >= 0 && nota3 <= 10) {
      this.nota3 = nota3;
    }

    if (nota4 >= 0 && nota4 <= 10) {
      this.nota4 = nota4;
    }
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNumeroMatricula(int numeroMatricula) {
    if (numeroMatricula >= 0) {
      this.numeroMatricula = numeroMatricula;
    }
  }

  public int getNumeroMatricula() {
    return numeroMatricula;
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

  public void setNota3(double nota3) {
    if (nota3 >= 0 && nota3 <= 10) {
      this.nota3 = nota3;
    }
  }

  public double getNota3() {
    return nota3;
  }

  public void setNota4(double nota4) {
    if (nota4 >= 0 && nota4 <= 10) {
      this.nota4 = nota4;
    }
  }

  public double getNota4() {
    return nota4;
  }

  public void menu() {
    System.out.println("1. Criar um estudante");
    System.out.println(
      "2. Calcular Média (Se o Aluno foi Aprovado, informe ao usuário)"
    );
    System.out.println("3. Obter número de matrícula");
    System.out.println("4. Obter Endereço");
    System.out.println("0. Sair");
  }

  public double calcMedia() {
    return (nota1 + nota2 + nota3 + nota4) / 4;
  }

  public void criarEstudante() {
    Scanner input = new Scanner(System.in);

    System.out.println("Qual é o nome do estudante? ");
    setNome(input.nextLine());

    System.out.println("Qual é o número da matrícula? ");
    setNumeroMatricula(input.nextInt());

    input.nextLine();

    System.out.println("Qual é o endereço do estudante? ");
    setEndereco(input.nextLine());

    System.out.println("Qual é a primeira nota? ");
    setNota1(input.nextDouble());

    System.out.println("Qual é a segunda nota? ");
    setNota2(input.nextDouble());

    System.out.println("Qual é a terceira nota? ");
    setNota3(input.nextDouble());

    System.out.println("Qual é a primeira nota? ");
    setNota4(input.nextDouble());

    System.out.println("Estudante criado com sucesso!");
  }
}
