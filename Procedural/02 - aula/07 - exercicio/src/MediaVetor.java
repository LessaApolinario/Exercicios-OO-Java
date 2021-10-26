import java.util.Scanner;

public class MediaVetor {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Qual e o tamanho do vetor? ");
    int tamanho = input.nextInt();

    double[] array = new double[tamanho];

    for (int i = 0; i < array.length; i++) {
      System.out.print("Qual e o valor do elemento? ");
      double valor = input.nextDouble();

      array[i] = valor;
    }

    double resultado = calculaMediaVetor(array);

    System.out.println("A media do vetor e == " + resultado);
  }

  public static double calculaMediaVetor(double[] vetor) {
    int soma = 0;

    for (int i = 0; i < vetor.length; i++) {
      soma += vetor[i];
    }

    return soma / vetor.length;
  }
}
