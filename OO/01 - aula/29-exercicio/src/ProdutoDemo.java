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

          /**
           * retorna true se o produto estiver cadastrado ou retorna false caso contrário!
           * */
          boolean existeNoEstoque = produto.buscarProduto(
            produtos,
            produtoDesejado
          );

          if (existeNoEstoque) {
            System.out.println("Qual a quantidade desejada do produto? ");
            int quantidadeDesejada = input.nextInt();

            String realizarVenda = produto.efetuarVenda(
              produtos,
              produtoDesejado,
              quantidadeDesejada
            );

            System.out.println(realizarVenda);
          } else {
            System.out.println(
              "O produto " + produtoDesejado + " não existe no estoque!"
            );
          }
          break;
        case 0:
          System.out.println("Obrigado pela preferência, volte sempre!");
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
