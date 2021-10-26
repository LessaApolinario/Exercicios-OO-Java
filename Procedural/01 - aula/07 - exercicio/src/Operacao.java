import java.util.Scanner;

public class Operacao {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Informe o primeiro número: ");
    double num1 = input.nextDouble();

    System.out.print("Informe o segundo número: ");
    double num2 = input.nextDouble();

    System.out.print("Escolha uma operação: ");
    int operacao = input.nextInt();

    if (operacao == 1) {
      System.out.printf("Soma == %.2f\n", num1 + num2);
    } else if (operacao == 2) {
      System.out.printf("Subtração == %.2f\n", num1 - num2);
    } else if (operacao == 3) {
      System.out.printf("Multiplicação == %.2f\n", num1 * num2);
    } else if (operacao == 4) {
      if (num2 != 0) {
        System.out.printf("Divisão == %.2f\n", num1 / num2);
      }
    }
  }
}
