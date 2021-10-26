import java.util.Scanner;

public class Maior {

  int valor;

  public int maiorDigitado() {
    Scanner input = new Scanner(System.in);
    int maior = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite um valor: ");
      valor = input.nextInt();

      if (i == 0) {
        maior = valor;
      }

      if (valor > maior) {
        maior = valor;
      }
    }

    System.out.println("Maior = " + maior);

    return maior;
  }
}
