import java.util.ArrayList;
import java.util.Scanner;

public class IMCDemo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    IMC imc = new IMC(1, 1, "");
    ArrayList<IMC> lista = new ArrayList<IMC>();

    int op = -1;

    do {
      imc.menu();
      System.out.println("Escolha uma opção: ");
      op = input.nextInt();
      limparBuffer(input);

      switch (op) {
        case 1:
          System.out.println("Qual é o nome da pessoa? ");
          String nome = input.nextLine();

          System.out.println("Qual é a altura da pessoa? ");
          double altura = input.nextDouble();

          System.out.println("Qual é o peso da pessoa? ");
          double peso = input.nextDouble();

          imc = new IMC(peso, altura, nome);

          lista.add(imc);

          System.out.println("Pessoa cadastrada com sucesso!");
          break;
        case 2:
          imc.abaixoDoPeso(lista);
          break;
        case 3:
          imc.dentroDoPesoIdeal(lista);
          break;
        case 4:
          imc.acimaDoPeso(lista);
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
