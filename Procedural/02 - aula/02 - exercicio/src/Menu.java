import java.util.Scanner;

public class Menu {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Informe a opcao: ");
    int opcao = input.nextInt();

    System.out.print("Informe o primeiro valor: ");
    int num1 = input.nextInt();

    System.out.print("Informe o segundo valor: ");
    int num2 = input.nextInt();

    switch (opcao) {
      case 1:
        System.out.println("A soma é " + soma(num1, num2));
        break;
      case 2:
        System.out.println("A diferenca é " + sub(num1, num2));
        break;
      case 3:
        System.out.println("A multiplicacao é " + mult(num1, num2));
        break;
      case 4:
        System.out.println("A divisao é " + div(num1, num2));
        break;
    }
  }

  public static int soma(int numero1, int numero2) {
    return numero1 + numero2;
  }

  public static int sub(int numero1, int numero2) {
    return numero1 - numero2;
  }

  public static int mult(int numero1, int numero2) {
    return numero1 * numero2;
  }

  public static int div(int numero1, int numero2) {
    return numero1 / numero2;
  }
}
