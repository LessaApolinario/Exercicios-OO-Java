import java.util.Scanner;

public class Triangulo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Informe o primeiro lado: ");
    int lado1 = input.nextInt();

    System.out.print("Informe o segundo lado: ");
    int lado2 = input.nextInt();

    System.out.print("Informe o terceiro lado: ");
    int lado3 = input.nextInt();

    if (lado1 == lado2 && lado2 == lado3) {
      System.out.println("Equilátero!");
    } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
      System.out.println("Escaleno!");
    } else {
      System.out.println("Isósceles!");
    }
  }
}
