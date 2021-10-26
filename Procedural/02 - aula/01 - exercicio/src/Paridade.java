import java.util.Scanner;

public class Paridade {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int valor = input.nextInt();

    String resultado = parOuImpar(valor);

    System.out.println("O número " + valor + " é " + resultado);
  }

  public static String parOuImpar(int numero) {
    return numero % 2 == 0 ? "Par" : "Impar";
  }
}
