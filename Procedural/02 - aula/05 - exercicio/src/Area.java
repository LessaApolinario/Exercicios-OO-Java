import java.util.Scanner;

public class Area {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Escolha uma opcao: ");
    int opcao = input.nextInt();

    System.out.print("Informe a largura: ");
    double largura = input.nextDouble();

    System.out.print("Informe a altura: ");
    double altura = input.nextDouble();

    if (opcao == 1) {
      double resultado = calculaArea(largura, altura);

      System.out.println("A area do retangulo e " + resultado);
    } else if (opcao == 2) {
      double resultado = calculaPerimetro(largura, altura);

      System.out.println("O perimetro do retangulo e " + resultado);
    }
  }

  public static double calculaArea(double b, double h) {
    return b * h;
  }

  public static double calculaPerimetro(double b, double h) {
    return 2 * b + 2 * h;
  }
}
