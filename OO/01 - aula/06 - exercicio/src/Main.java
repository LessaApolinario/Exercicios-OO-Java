import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Operacao operacao = new Operacao();

    System.out.print("Qual é o primeiro número? ");
    operacao.numero1 = input.nextDouble();

    System.out.print("Qual é o segundo número? ");
    operacao.numero2 = input.nextDouble();

    System.out.print("Escolha uma opção: ");
    operacao.opcao = input.nextInt();

    operacao.menu();
  }
}
