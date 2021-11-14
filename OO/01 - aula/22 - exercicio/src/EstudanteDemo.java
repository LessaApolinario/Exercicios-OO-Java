import java.util.Scanner;

public class EstudanteDemo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Estudante estudante = new Estudante("", 0, "", 0, 0, 0, 0);
    int op = -1;

    while (op != 0) {
      estudante.menu();
      System.out.println("Escolha uma opção: ");
      op = input.nextInt();

      switch (op) {
        case 1:
          estudante.criarEstudante();
          break;
        case 2:
          System.out.println(
            "O estudante " +
            estudante.getNome() +
            " obteve a média " +
            estudante.calcMedia()
          );
          break;
        case 3:
          System.out.println(
            "O número da matrícula do estudante " +
            estudante.getNome() +
            " é " +
            estudante.getNumeroMatricula()
          );
          break;
        case 4:
          System.out.println(
            "O endereço do estudante " +
            estudante.getNome() +
            " é " +
            estudante.getEndereco()
          );
          break;
        case 0:
          System.out.println("Você saiu!");
          input.close();
          break;
      }
    }
  }
}
