import java.util.Scanner;

public class Temperatura {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Escolha uma opcao: ");
    int op = input.nextInt();

    if (op == 1) {
      System.out.print("Informe a temperatura em Fahrenheit: ");
      double fahrenheit = input.nextDouble();

      double resultado = fahrenheitParaCelsius(fahrenheit);

      System.out.println("Temperatura em Celsius == " + resultado);
    } else if (op == 2) {
      System.out.print("Informe a temperatura em Kelvin: ");
      double kelvin = input.nextDouble();

      double resultado = kelvinParaCelsius(kelvin);

      System.out.println("Temperatura em Celsius == " + resultado);
    }
  }

  public static double fahrenheitParaCelsius(double tempF) {
    return 5 * (tempF - 32) / 9;
  }

  public static double kelvinParaCelsius(double tempK) {
    return tempK - 273;
  }
}
