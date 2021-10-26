import java.util.Scanner;

public class Maior {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Informe o primeiro valor: ");
    double num1 = input.nextDouble();

    double maior = num1;

    System.out.print("Informe o segundo valor: ");
    double num2 = input.nextDouble();

    if (num2 > maior) {
      maior = num2;
    }

    System.out.print("Informe o terceiro valor: ");
    double num3 = input.nextDouble();

    if (num3 > maior) {
      maior = num3;
    }

    System.out.printf("Maior == %.2f\n", maior);
  }
}
