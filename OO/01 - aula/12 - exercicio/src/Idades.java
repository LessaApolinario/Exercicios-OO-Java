import java.util.Scanner;

public class Idades {

  int idade;

  public void mediaIdades() {
    Scanner input = new Scanner(System.in);
    int total = 0;
    int i = 0;

    while (idade != -1) {
      total += idade;
      i++;

      System.out.print("Digite uma idade (-1 para sair): ");
      idade = input.nextInt();
    }

    if (i != 0) {
      double media = (double) total / i;

      System.out.println("Média das idades = " + media);
    } else {
      System.out.println("Nenhuma idade foi digitada!");
    }
  }
}
