import java.util.Scanner;

public class Imposto {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Informe o salário: ");
    double s = input.nextDouble();

    double resultado = impostoPagamento(s);

    System.out.println("O imposto vale " + resultado);
  }

  public static double impostoPagamento(double salario) {
    double imposto = 0;

    if (salario > 5000.01) {
      imposto = salario * 0.3;
    } else if (salario >= 3500.01 && salario < 5000.01) {
      imposto = salario * 0.22;
    } else if (salario >= 2000.01 && salario < 3500) {
      imposto = salario * 0.15;
    } else {
      imposto = 0;
    }

    return imposto;
  }
}
