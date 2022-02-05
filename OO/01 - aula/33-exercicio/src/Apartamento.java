public class Apartamento extends Imovel {

    private String nomePredio;

    public Apartamento(String rua, String numero, String bairro, String cidade, String estado, String cep,
            boolean estaAlugado, boolean estaMobiliado, String nomePredio) {
        super(rua, numero, bairro, cidade, estado, cep, estaAlugado, estaMobiliado);

        if (!nomePredio.equals("")) {
            this.nomePredio = nomePredio;
        }
    }

    public String getNomePredio() {
        return nomePredio;
    }

    public void setNomePredio(String nomePredio) {
        if (!nomePredio.equals("")) {
            this.nomePredio = nomePredio;
        }
    }

}
