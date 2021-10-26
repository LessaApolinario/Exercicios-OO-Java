import java.util.Scanner;

public class Altura {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Informe a primeira altura: ");
    double altura1 = input.nextDouble();

    System.out.print("Informe a segunda altura: ");
    double altura2 = input.nextDouble();

    System.out.print("Informe a terceira altura: ");
    double altura3 = input.nextDouble();

    double alturaMedia = (altura1 + altura2 + altura3) / 3;

    System.out.printf("Média das alturas == %.2f\n", alturaMedia);
  }
}
