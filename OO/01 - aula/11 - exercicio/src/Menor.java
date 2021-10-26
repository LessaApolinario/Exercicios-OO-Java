import java.util.Scanner;

public class Menor {

  int valor;

  public void menorDigitado() {
    Scanner input = new Scanner(System.in);
    int menor = 0;

    for (int i = 0; i < 30; i++) {
      System.out.print("Digite um valor: ");
      valor = input.nextInt();

      if (i == 0) {
        menor = valor;
      }

      if (valor < menor) {
        menor = valor;
      }
    }

    System.out.println("Menor = " + menor);
  }
}
