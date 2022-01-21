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

          boolean produtoExiste = produto.buscarProduto(
            produtos,
            produtoProcurado
          );

          if (produtoExiste) {
            System.out.println(
              "O produto " + produtoProcurado + " existe no estoque."
            );
          } else {
            System.out.println(
              "O produto " + produtoProcurado + " não existe no estoque!"
            );
          }
          break;
        case 3:
          produto.listarProdutos(produtos);
          break;
        case 4:
          System.out.println("Qual o produto procurado? ");
          String produtoDesejado = input.nextLine();

          System.out.println("Qual a quantidade desejada do produto? ");
          int quantidadeDesejada = input.nextInt();

          int realizarVenda = produto.efetuarVenda(
            produtos,
            produtoDesejado,
            quantidadeDesejada
          );

          if (realizarVenda > 0) {
            System.out.println(
              "O produto " + produtoDesejado + "foi vendido com sucesso!"
            );
            System.out.println(
              "O novo estoque para o produto" +
              produtoDesejado +
              " é = " +
              realizarVenda
            );
          } else {
            System.out.println("Quantidade indisponível");
            System.out.println(
              "O estoque atual para o produto " +
              produtoDesejado +
              " é = " +
              realizarVenda
            );
          }
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
