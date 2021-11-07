import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    IdadePessoa pessoa = new IdadePessoa();

    System.out.println("digite os nomes e as idades das pessoas: ");

    for (int i = 0; i < pessoa.nomes.length; i++) {
      System.out.println("Nome: ");
      String nome = input.next();
      pessoa.nomes[i] = nome;

      System.out.println("Idade: ");
      int idade = input.nextInt();
      pessoa.idades[i] = idade;
    }

    System.out.println(
      "O nome da pessoa mais velha é " + pessoa.pessoaMaisVelha()
    );
    System.out.println(
      "O nome da pessoa mais nova é " + pessoa.pessoaMaisNova()
    );
    System.out.println(
      "A quantidade de pessoas maiores de 18 anos é " + pessoa.maiorDeIdade()
    );
  }
}
