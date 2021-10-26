import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Paridade paridade = new Paridade();

    System.out.print("Digite um valor: ");
    paridade.numero = input.nextInt();

    String paridadeDoNumeroDigitado = paridade.paridadeValor();

    System.out.println(
      "O número " + paridade.numero + " é " + paridadeDoNumeroDigitado
    );
  }
}
