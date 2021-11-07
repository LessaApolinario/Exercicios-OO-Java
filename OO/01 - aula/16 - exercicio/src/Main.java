import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Salario salarioFunc = new Salario();

    System.out.print("Qual é o salário do funcionário? ");
    salarioFunc.salario = input.nextDouble();

    System.out.println("O imposto a pagar vale == " + salarioFunc.obterImposto());
  }
}
