import java.util.Scanner;

public class Idade {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] nomesP = new String[10];
    int[] idadesP = new int[10];

    for (int i = 0; i < nomesP.length; i++) {
      System.out.print("Informe um nome: ");
      String nome = input.next();

      nomesP[i] = nome;
    }

    for (int i = 0; i < idadesP.length; i++) {
      System.out.print("Informe uma idade: ");
      int idade = input.nextInt();

      idadesP[i] = idade;
    }

    String maior = pessoaMaisVelha(nomesP, idadesP);

    System.out.println("Pessoa mais velha == " + maior);

    String menor = pessoaMaisNova(nomesP, idadesP);

    System.out.println("Pessoa mais nova == " + menor);

    int numPessoas = pessoasAcimaDe18anos(idadesP);

    System.out.println(
      "Quantidade de pessoas acima dos 18 anos == " + numPessoas
    );
  }

  public static String pessoaMaisVelha(String[] nomes, int[] idades) {
    int maior = idades[0];
    String nome = nomes[0];

    for (int i = 0; i < idades.length; i++) {
      if (idades[i] > maior) {
        nome = nomes[i];
      }
    }

    return nome;
  }

  public static String pessoaMaisNova(String[] nomes, int[] idades) {
    int menor = idades[0];
    String nome = nomes[0];

    for (int i = 0; i < idades.length; i++) {
      if (idades[i] < menor) {
        nome = nomes[i];
      }
    }

    return nome;
  }

  public static int pessoasAcimaDe18anos(int[] idades) {
    int quantidadePessoas = 0;

    for (int i = 0; i < idades.length; i++) {
      if (idades[i] > 18) {
        quantidadePessoas++;
      }
    }

    return quantidadePessoas;
  }
}
