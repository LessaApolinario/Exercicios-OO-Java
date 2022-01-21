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
    if (quantidade > 0) {
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

  public String buscarProduto(ArrayList<Produto> produtos, String nome) {
    for (Produto p : produtos) {
      if (nome.equals(p.getNome())) {
        String produtoEncontrado = p.getNome();
        return "O produto " + produtoEncontrado + " existe no estoque.";
      }
    }

    return "O produto " + nome + " não existe no estoque!";
  }

  // TODO listarProdutos

  // TODO efetuarVenda

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
