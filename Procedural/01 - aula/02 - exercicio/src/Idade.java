import java.util.Scanner;

public class Idade {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Informe o ano de nascimento: ");
    int anoNascimento = input.nextInt();

    System.out.print("Informe o ano atual: ");
    int anoAtual = input.nextInt();

    int idade = anoAtual - anoNascimento;

    System.out.printf("idade == %d\n", idade);
  }
}
