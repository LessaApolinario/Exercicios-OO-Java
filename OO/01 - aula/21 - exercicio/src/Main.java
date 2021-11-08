import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Igualdade igualdade = new Igualdade();

    System.out.println("Digite as palavras: ");

    for (int i = 0; i < igualdade.palavras.length; i++) {
      igualdade.palavras[i] = input.next();
    }

    System.out.println("Digite os nomes: ");

    for (int i = 0; i < igualdade.nomes.length; i++) {
      igualdade.nomes[i] = input.next();
    }

    if (igualdade.arraysIguais() == true) {
      System.out.println("Arrays iguais!");
    } else {
      System.out.println("Arrays diferentes");
    }
  }
}
