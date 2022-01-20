import java.util.ArrayList;
import java.util.Scanner;

public class LivroDemo {

  public static void main(String[] args) {
    Livro livro = new Livro("", "", "12345678-9", "", 1);
    ArrayList<Livro> livros = new ArrayList<Livro>();
    Scanner input = new Scanner(System.in);

    int op = -1;

    do {
      Livro.menu();
      System.out.println("Escolha uma opção: ");
      op = input.nextInt();
      limparBuffer(input);

      switch (op) {
        case 1:
          System.out.println("Bem-vindo(a) ao cadastro de livros");
          livro.cadastrarLivro(livros);
          break;
        case 2:
          System.out.println("Escolha o título a procurar: ");
          String tituloProcurado = input.nextLine();
          System.out.println(livro.buscarLivro(livros, tituloProcurado));
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
