import java.util.ArrayList;

public class GerenciadorDeProdutos {
    private ArrayList<Produto> produtos;

    public GerenciadorDeProdutos() {
        produtos = new ArrayList<>();
    }

    /// TODO: fix efetuarVenda
    /// BUG: não diminui a quantidade
    /// FIXME: debugar esse método e o método diminuirQuantidade
    public String efetuarVenda(String produtoProcurado, int quantidadeDesejada) {
        Produto produto = buscarProduto(produtoProcurado);

        // retorna o estoqueAtual do produto encontrado
        int estoqueAtual = produto.getQuantidade();

        /**
         * retorna true se a quantidade do produto estiver disponível
         * no estoque, caso contrário retorna false!
         */
        boolean possuiEstoqueProduto = quantidadeDesejada <= estoqueAtual;

        if (possuiEstoqueProduto) {
            // Atualiza o valor do estoqueAtual!
            produto.diminuirQuantidade(estoqueAtual, quantidadeDesejada);

            System.out.println("O produto " + produtoProcurado + " foi vendido com sucesso!");

            // Caso a venda seja realizada com sucesso!
            return "Estoque atual: " + estoqueAtual;
        }

        // Caso a venda não possa ser realizada por falta de estoque!
        return "Quantidade indisponível!";
    }

    public Produto buscarProduto(String nome) {
        for (Produto p : produtos) {
            if (nome.equals(p.getNome())) {
                // Se o produto for encontrado!
                return p;
            }
        }

        // Se o produto não for encontrado!
        // Se não encontrar o objeto, retornar null
        System.out.println("O produto " + nome + " não existe!");
        return null;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void cadastrarProduto(String nome, int codigo, double preco, int quantidade) {
        Produto p = new Produto(nome, codigo, preco, quantidade);

        produtos.add(p);
    }
}
