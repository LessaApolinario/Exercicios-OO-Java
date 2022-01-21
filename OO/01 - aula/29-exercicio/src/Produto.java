import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Produto {

  private String nome;
  private int codigo;
  private double preco;
  private int quantidade;

  public Produto(String nome, int codigo, double preco, int quantidade) {
    this.nome = nome;

    if (codigo >= 0) {
      this.codigo = codigo;
    }

    if (preco > 0) {
      this.preco = preco;
    }

    if (quantidade > 0) {
      this.quantidade = quantidade;
    }
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setCodigo(int codigo) {
    if (codigo >= 0) {
      this.codigo = codigo;
    }
  }

  public int getCodigo() {
    return codigo;
  }

  public void setPreco(double preco) {
    if (preco > 0) {
      this.preco = preco;
    }
  }

  public double getPreco() {
    return preco;
  }

  public void setQuantidade(int quantidade) {
    if (quantidade >= 0) {
      this.quantidade = quantidade;
    }
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void cadastrarProduto(ArrayList<Produto> produtos) {
    Scanner input = new Scanner(System.in);

    System.out.println("Qual é o nome do produto? ");
    setNome(input.nextLine());

    System.out.println("Qual é o código do produto? ");
    setCodigo(input.nextInt());

    System.out.println("Qual é o preço do produto? ");
    setPreco(input.nextDouble());

    System.out.println("Qual é a quantidade do produto? ");
    setQuantidade(input.nextInt());

    Produto p = new Produto(
      getNome(),
      getCodigo(),
      getPreco(),
      getQuantidade()
    );

    produtos.add(p);

    System.out.println("Produto cadastrado com sucesso!");
  }

  public boolean buscarProduto(ArrayList<Produto> produtos, String nome) {
    for (Produto p : produtos) {
      if (nome.equals(p.getNome())) {
        // Se o produto for encontrado!
        return true;
      }
    }

    // Se o produto não for encontrado!
    return false;
  }

  public void listarProdutos(ArrayList<Produto> produtos) {
    for (Produto p : produtos) {
      System.out.println(p.toString());
    }
  }

  public String efetuarVenda(
    ArrayList<Produto> produtos,
    String produtoProcurado,
    int quantidadeDesejada
  ) {
    for (int i = 0; i < produtos.size(); i++) {
      int estoqueAtual = produtos.get(i).getQuantidade();

      /**
       * retorna true se a quantidade do produto estiver disponível
       * no estoque, caso contrário retorna false!
       */
      boolean possuiEstoqueProduto = quantidadeDesejada <= estoqueAtual;

      if (possuiEstoqueProduto) {
        // Atualiza o valor do estoqueAtual!
        produtos.get(i).setQuantidade(estoqueAtual -= quantidadeDesejada);
        // Caso a venda seja realizada com sucesso!

        System.out.println(
          "O produto " + produtoProcurado + " foi vendido com sucesso!"
        );
        return "Estoque atual: " + estoqueAtual;
      }
    }

    // Caso a venda não possa ser realizada por falta de estoque!
    return "Quantidade indisponível!";
  }

  @Override
  public String toString() {
    return (
      "\n--------------------\n" +
      "Informações do produto: " +
      "\n" +
      "Nome: " +
      getNome() +
      "\n" +
      "Código: " +
      getCodigo() +
      "\n" +
      "Preço: " +
      getPreco() +
      "\n" +
      "Quantidade: " +
      getQuantidade() +
      "\n--------------------\n"
    );
  }

  public static void menu() {
    System.out.println("\n--------------------");
    System.out.println("1. Cadastrar produto");
    System.out.println("2. Buscar produto (procurar produto pelo nome)");
    System.out.println("3. Listar todos os produtos disponíveis");
    System.out.println("4. Efetuar a venda de um produto");
    System.out.println("0. Sair");
    System.out.println("--------------------\n");
  }
}
