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

    @Override
    public String toString() {
        String mensagem = "";
        mensagem += "\n--------------------\n";
        mensagem += "Rua: " + super.getRua() + "\n";
        mensagem += "Número: " + super.getNumero() + "\n";
        mensagem += "Bairro: " + super.getBairro() + "\n";
        mensagem += "Cidade: " + super.getCidade() + "\n";
        mensagem += "Estado: " + super.getEstado() + "\n";
        mensagem += "Cep: " + super.getCep() + "\n";

        if (super.isEstaAlugado()) {
            mensagem += "Está alugado\n";
        } else {
            mensagem += "Não está alugado\n";
        }

        if (super.isEstaMobiliado()) {
            mensagem += "Está mobiliado\n";
        } else {
            mensagem += "Não está mobiliado\n";
        }

        mensagem += "Nome do prédio: " + this.getNomePredio() + "\n";
        mensagem += "\n--------------------\n";

        return mensagem;
    }

}
