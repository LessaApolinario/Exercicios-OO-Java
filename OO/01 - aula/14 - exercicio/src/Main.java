import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Pares pares = new Pares();
    int totalPares = 0;

    while (true) {
      System.out.print("Digite um valor: ");
      pares.numero = input.nextInt();

      if (pares.numero < 0) {
        break;
      }

      totalPares += pares.contarPares();
    }

    System.out.println("Quantidade de números pares = " + totalPares);
  }
}
