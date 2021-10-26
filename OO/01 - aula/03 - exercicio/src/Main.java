import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Alturas alturas = new Alturas();

    System.out.print("Qual é a primeira altura? ");
    alturas.altura1 = input.nextDouble();

    System.out.print("Qual é a segunda altura? ");
    alturas.altura2 = input.nextDouble();

    System.out.print("Qual é a terceira altura? ");
    alturas.altura3 = input.nextDouble();

    double media = alturas.calcMedia();

    System.out.println("A média das alturas é " + media);
  }
}
