import java.util.Scanner;

public class ArraysIguais {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] array = new int[5];
    int[] array2 = new int[5];

    for (int i = 0; i < array.length; i++) {
      System.out.print("Informe um valor para o array 1: ");
      int valor1 = input.nextInt();

      array[i] = valor1;
    }

    System.out.println();

    for (int i = 0; i < array2.length; i++) {
      System.out.print("Informe um valor para o array 2: ");
      int valor2 = input.nextInt();

      array2[i] = valor2;
    }

    boolean resultado = igualdadeArrays(array, array2);

    if (resultado == true) {
      System.out.println("Arrays iguais!");
    } else {
      System.out.println("Arrays diferentes!");
    }
  }

  public static boolean igualdadeArrays(int[] v1, int[] v2) {
    boolean igualdade = true;

    for (int i = 0; i < v1.length; i++) {
      if (v1[i] != v2[i]) {
        igualdade = false;
      }
    }

    return igualdade;
  }
}
