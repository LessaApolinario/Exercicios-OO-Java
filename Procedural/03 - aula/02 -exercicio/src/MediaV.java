import java.util.Scanner;

public class MediaV {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] vetor = new int[10];

    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Informe um numero: ");
      int numero = input.nextInt();

      vetor[i] = numero;
    }

    System.out.println("Menor valor: " + menor(vetor));
    System.out.println("Maior valor: " + maior(vetor));
    System.out.println("Media: " + media(vetor));
  }

  public static int maior(int[] vet) {
    int maior = vet[0];

    for (int i = 0; i < vet.length; i++) {
      if (vet[i] > maior) {
        maior = vet[i];
      }
    }

    return maior;
  }

  public static int menor(int[] vet) {
    int menor = vet[0];

    for (int i = 0; i < vet.length; i++) {
      if (vet[i] < menor) {
        menor = vet[i];
      }
    }

    return menor;
  }

  public static double media(int[] vet) {
    int total = 0;

    for (int i = 0; i < vet.length; i++) {
      total += vet[i];
    }

    return (double) total / vet.length;
  }
}
