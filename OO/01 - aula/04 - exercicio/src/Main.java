import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Maior maior = new Maior();

    System.out.print("Qual é o primeiro valor? ");
    maior.numero1 = input.nextInt();

    System.out.print("Qual é o segundo valor? ");
    maior.numero2 = input.nextInt();

    System.out.print("Qual é o terceiro valor? ");
    maior.numero3 = input.nextInt();

    int maiorValorDigitado = maior.maiorValor();

    System.out.println("O maior valor é " + maiorValorDigitado);
  }
}
