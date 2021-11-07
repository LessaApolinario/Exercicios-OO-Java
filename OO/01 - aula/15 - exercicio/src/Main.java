import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Vogais vogais = new Vogais();

    System.out.print("Digite uma palavra: ");
    vogais.palavra = input.nextLine();

    int contagemDeVogais = vogais.contarVogais();

    System.out.println(
      "Quantidade de vogais na string " +
      vogais.palavra +
      " = " +
      contagemDeVogais
    );
  }
}
