import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Retangulo retangulo = new Retangulo();

    System.out.println("Qual é o primeiro lado? ");
    retangulo.b = input.nextDouble();

    System.out.println("Qual é o segundo lado? ");
    retangulo.h = input.nextDouble();

    retangulo.menu();
    retangulo.opcao = input.nextInt();

    if (retangulo.opcao == 1) {
      System.out.println("A área do retângulo é == " + retangulo.calcularArea());
    }

    if (retangulo.opcao == 2) {
      System.out.println("O perímetro do retângulo é == " + retangulo.calcularPerimetro());
    }
  }
}
