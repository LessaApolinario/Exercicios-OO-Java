import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static GerenciadorDeProdutos gerenciadorDeProdutos = new GerenciadorDeProdutos();

    public static void abrirDialogCadastrarProduto() {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o nome do produto? ");
        String nome = input.nextLine();

        System.out.println("Qual é o código do produto? ");
        int codigo = input.nextInt();

        System.out.println("Qual é o preço do produto? ");
        double preco = input.nextDouble();

        System.out.println("Qual é a quantidade do produto? ");
        int quantidade = input.nextInt();

        gerenciadorDeProdutos.cadastrarProduto(nome, codigo, preco, quantidade);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int op = -1;

        do {
            Main.menu();
            System.out.println("Escolha uma opção: ");
            op = input.nextInt();
            limparBuffer(input);

            switch (op) {
                case 1:
                    abrirDialogCadastrarProduto();
                    break;
                case 2:
                    System.out.println("Qual o produto procurado? ");
                    String produtoProcurado = input.nextLine();

                    Produto produtoEncontrado = gerenciadorDeProdutos.buscarProduto(produtoProcurado);
                    System.out.println("Produto: " + produtoEncontrado.toString());
                    break;
                case 3:
                    listarProdutos(gerenciadorDeProdutos.getProdutos());
                    break;
                case 4:
                    System.out.println("Qual o produto procurado? ");
                    String produtoDesejado = input.nextLine();

                    Produto produto = gerenciadorDeProdutos.buscarProduto(produtoDesejado);

                    String efetuarVenda = "";

                    if (produto != null) {
                        System.out.println("Qual a quantidade desejada do produto? ");
                        int quantidadeDesejada = input.nextInt();
                        efetuarVenda = gerenciadorDeProdutos.efetuarVenda(produtoDesejado, quantidadeDesejada);
                    }

                    System.out.println(efetuarVenda);
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

    public static void menu() {
        System.out.println("\n--------------------");
        System.out.println("1. Cadastrar produto");
        System.out.println("2. Buscar produto (procurar produto pelo nome)");
        System.out.println("3. Listar todos os produtos disponíveis");
        System.out.println("4. Efetuar a venda de um produto");
        System.out.println("0. Sair");
        System.out.println("--------------------\n");
    }

    public static void listarProdutos(ArrayList<Produto> produtos) {
        for (Produto p : produtos) {
            System.out.println(p.toString());
        }
    }
}
