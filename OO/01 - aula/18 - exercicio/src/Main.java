import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Temperatura temp = new Temperatura();

    temp.menu();
    temp.opcao = input.nextInt();

    if (temp.opcao == 1) {
      System.out.print("Informe a temperatura em Fahrenheit: ");
      temp.F = input.nextDouble();

      System.out.println(
        "A temperatura " +
        temp.F +
        " °F" +
        " em Celsius é " +
        temp.fahrenheitParaCelsius() +
        " °C"
      );
    }

    if (temp.opcao == 2) {
      System.out.print("Informe a temperatura em Kelvin: ");
      temp.K = input.nextDouble();

      System.out.println(
        "A temperatura " +
        temp.K +
        " K" +
        " em Celsius é " +
        temp.kelvinParaCelsius() +
        " °C"
      );
    }
  }
}
