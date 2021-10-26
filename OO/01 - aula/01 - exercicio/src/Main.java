import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Pessoa pessoa = new Pessoa();

    System.out.print("Qual é o ano de nascimento? ");
    pessoa.anoNascimento = input.nextInt();

    System.out.print("Qual é o ano atual? ");
    pessoa.anoAtual = input.nextInt();

    int idade = pessoa.calcularIdade();

    System.out.println("A idade é " + idade);
  }
}
