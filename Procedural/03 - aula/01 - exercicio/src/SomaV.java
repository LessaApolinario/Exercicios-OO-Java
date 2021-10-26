import java.util.Scanner;

public class SomaV {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] vetor = new int[10];
    int soma = 0;

    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Informe um valor: ");
      int numero = input.nextInt();

      vetor[i] = numero;
      soma += vetor[i];
    }

    System.out.println("A soma do vetor e: " + soma);
  }
}
