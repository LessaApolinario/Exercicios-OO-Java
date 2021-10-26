import java.util.Scanner;

public class Media {

  double altura;

  public void mediaAlturas() {
    Scanner input = new Scanner(System.in);
    double total = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite uma altura: ");
      altura = input.nextDouble();

      total += altura;
    }

    System.out.println("A média das alturas é " + (total / 10));
  }
}
