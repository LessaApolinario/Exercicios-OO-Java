import java.util.Scanner;

public class MaiorNumero {

  int numero;

  public void maiorDaLista() {
    Scanner input = new Scanner(System.in);
    int i = 0;
    int maior = 0;

    while (numero != -1) {
      System.out.print("Digite um número: ");
      numero = input.nextInt();

      if (i == 0) {
        maior = numero;
      }

      if (numero > maior) {
        maior = numero;
      }

      i++;
    }

    System.out.println("Maior = " + maior);
  }
}
