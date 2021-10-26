import java.util.Scanner;

public class Vogais {

  // Escreva um programa com um método que receba uma String e retorne o
  // número de vogais dessa String.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite uma palavra: ");
    String string = input.next();

    int resultado = numeroDeVogais(string);

    System.out.println(
      "A quantidade de vogais em " + string + " é " + resultado
    );
  }

  public static int numeroDeVogais(String palavra) {
    int quantidadeVogais = 0;

    if (palavra.contains("a")) {
      quantidadeVogais++;
    }

    if (palavra.contains("e")) {
      quantidadeVogais++;
    }

    if (palavra.contains("i")) {
      quantidadeVogais++;
    }

    if (palavra.contains("o")) {
      quantidadeVogais++;
    }

    if (palavra.contains("u")) {
      quantidadeVogais++;
    }

    return quantidadeVogais;
  }
}
