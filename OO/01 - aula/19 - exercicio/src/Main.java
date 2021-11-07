import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    MediaVetor medvet = new MediaVetor();

    System.out.print("Qual é o tamanho do vetor? ");
    medvet.tamanho = input.nextInt();

    int[] vet = new int[medvet.tamanho];

    System.out.println("Informe os valores do vetor: ");

    for (int i = 0; i < vet.length; i++) {
      vet[i] = input.nextInt();
    }

    System.out.println("A média do vetor é " + medvet.media(vet));
  }
}
