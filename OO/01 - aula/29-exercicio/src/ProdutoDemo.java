import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoDemo {

  public static void main(String[] args) {
    Produto produto = new Produto("", 0, 1.0, 1);
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    Scanner input = new Scanner(System.in);

    int op = -1;

    do {
      Produto.menu();
      System.out.println("Escolha uma opção: ");
      op = input.nextInt();
      limparBuffer(input);

      switch (op) {
        case 1:
          produto.cadastrarProduto(produtos);
          break;
        case 2:
          System.out.println("Qual o produto procurado? ");
          String produtoProcurado = input.nextLine();

          System.out.println(produto.buscarProduto(produtos, produtoProcurado));
      }
    } while (op != 0);
  }

  public static void limparBuffer(Scanner sc) {
    if (sc.hasNextLine()) {
      sc.nextLine();
    }
  }
}
