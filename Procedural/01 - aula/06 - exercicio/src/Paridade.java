import java.util.Scanner;

public class Paridade {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Informe um número: ");
    int numero = input.nextInt();

    if (numero % 2 == 0) {
      System.out.println("Par!");
    } else {
      System.out.println("Impar!");
    }
  }
}
