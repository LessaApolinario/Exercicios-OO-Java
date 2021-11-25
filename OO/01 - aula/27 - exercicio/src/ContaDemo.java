import java.util.ArrayList;
import java.util.Scanner;

public class ContaDemo {

  public static void main(String[] args) {
    Conta conta = new Conta("", 1, 0);
    ArrayList<Conta> contas = new ArrayList<Conta>();
    Scanner input = new Scanner(System.in);

    int op = -1;

    do {
      conta.menu();
      System.out.println("Escolha uma opção: ");
      op = input.nextInt();
      limparBuffer(input);

      switch (op) {
        case 1:
          conta.cadastrarCliente(contas);
          break;
        case 2:
          System.out.println("Qual é o nome do cliente? ");
          String nomeCliente = input.nextLine();
          conta.consultarCliente(nomeCliente, contas);
          break;
        case 3:
          System.out.println("Qual é o nome do cliente? ");
          nomeCliente = input.nextLine();
          conta.verificarSaldo(nomeCliente, contas);
          break;
        case 4:
          System.out.println("Qual é o nome do cliente? ");
          nomeCliente = input.nextLine();

          System.out.println("Qual a quantia a ser sacada? ");
          double quantia = input.nextDouble();
          conta.efetuarSaque(quantia, contas, nomeCliente);
          break;
        case 5:
          System.out.println("Qual é o nome do cliente? ");
          nomeCliente = input.nextLine();

          System.out.println("Qual a quantia a ser depositada? ");
          quantia = input.nextDouble();
          conta.efetuarDeposito(quantia, contas, nomeCliente);
          break;
        case 0:
          System.out.println("Você saiu!");
          break;
      }
    } while (op != 0);
  }

  public static void limparBuffer(Scanner sc) {
    if (sc.hasNextLine()) {
      sc.nextLine();
    }
  }
}
