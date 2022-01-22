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

        if (quantidade >= 0) {
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

    public int diminuirQuantidade(int estoque, int quantidadeDesejada) {
        estoque -= quantidadeDesejada;
        setQuantidade(estoque);

        return estoque;
    }

    @Override
    public String toString() {
        return ("\n--------------------\n" +
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
                "\n--------------------\n");
    }

}
