import java.util.Scanner;

public class ContaDemo {

  public static void main(String[] args) {
    Conta conta = new Conta("", 1, 0);
    Conta[] contas = new Conta[1];

    for (int i = 0; i < contas.length; i++) {
      contas[i] = new Conta("", 1, 0);
    }

    Scanner input = new Scanner(System.in);
    int op = -1;
    int i = 0;

    do {
      System.out.println("Escolha uma opção: ");
      op = input.nextInt();

      switch (op) {
        case 1:
          conta.cadastrarCliente();

          try {
            contas[i] =
              new Conta(
                conta.getNome(),
                conta.getNumeroConta(),
                conta.getSaldo()
              );
          } catch (ArrayIndexOutOfBoundsException exception) {
            Conta[] novaConta = new Conta[contas.length + 1];

            System.arraycopy(contas, 0, novaConta, 0, contas.length);

            contas = novaConta;
            contas[i] =
              new Conta(
                conta.getNome(),
                conta.getNumeroConta(),
                conta.getSaldo()
              );
          } finally {
            System.out.println("Cliente cadastrado com sucesso!");
            i++;
          }
          break;
      }
    } while (op != 0);
  }
}
