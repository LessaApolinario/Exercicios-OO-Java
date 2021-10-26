import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Triangulo triangulo = new Triangulo();

    System.out.println("Qual é o primeiro lado? ");
    triangulo.lado1 = input.nextInt();

    System.out.println("Qual é o segundo lado? ");
    triangulo.lado2 = input.nextInt();

    System.out.println("Qual é o terceiro lado? ");
    triangulo.lado3 = input.nextInt();

    String tipoDoTriangulo = triangulo.verificarTipo();

    System.out.println("O triângulo é " + tipoDoTriangulo);
  }
}
