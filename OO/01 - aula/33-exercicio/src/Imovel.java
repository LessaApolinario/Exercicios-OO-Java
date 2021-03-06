public class Imovel {

    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private boolean estaAlugado;
    private boolean estaMobiliado;

    public Imovel(String rua, String numero, String bairro, String cidade, String estado, String cep,
            boolean estaAlugado, boolean estaMobiliado) {

        if (!rua.equals("")) {
            this.rua = rua;
        }

        if (!numero.equals("")) {
            this.numero = numero;
        }

        if (!bairro.equals("")) {
            this.bairro = bairro;
        }

        if (!cidade.equals("")) {
            this.cidade = cidade;
        }

        if (!estado.equals("")) {
            this.estado = estado;
        }

        if (!cep.equals("") && cep.length() == 9) {
            this.cep = cep;
        }

        this.estaAlugado = estaAlugado;
        this.estaMobiliado = estaMobiliado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if (!rua.equals("")) {
            this.rua = rua;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (!numero.equals("")) {
            this.numero = numero;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if (!bairro.equals("")) {
            this.bairro = bairro;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (!cidade.equals("")) {
            this.cidade = cidade;
        }
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (!estado.equals("")) {
            this.estado = estado;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (!cep.equals("") && cep.length() == 9) {
            this.cep = cep;
        }
    }

    public boolean isEstaAlugado() {
        return estaAlugado;
    }

    public void setEstaAlugado(boolean estaAlugado) {
        this.estaAlugado = estaAlugado;
    }

    public boolean isEstaMobiliado() {
        return estaMobiliado;
    }

    public void setEstaMobiliado(boolean estaMobiliado) {
        this.estaMobiliado = estaMobiliado;
    }

    @Override
    public String toString() {
        String mensagem = "";
        mensagem += "\n--------------------\n";
        mensagem += "Rua: " + getRua() + "\n";
        mensagem += "N??mero: " + getNumero() + "\n";
        mensagem += "Bairro: " + getBairro() + "\n";
        mensagem += "Cidade: " + getCidade() + "\n";
        mensagem += "Estado: " + getEstado() + "\n";
        mensagem += "Cep: " + getCep() + "\n";

        if (isEstaAlugado()) {
            mensagem += "Est?? alugado\n";
        } else {
            mensagem += "N??o est?? alugado\n";
        }

        if (isEstaMobiliado()) {
            mensagem += "Est?? mobiliado\n";
        } else {
            mensagem += "N??o est?? mobiliado\n";
        }

        mensagem += "\n--------------------\n";

        return mensagem;
    }
}
