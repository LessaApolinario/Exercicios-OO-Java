public class Pessoa {

    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf, String dataNascimento) {
        if (!nome.equals("")) {
            this.nome = nome;
        }

        if (!cpf.equals("") && cpf.length() == 14) {
            this.cpf = cpf;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (!nome.equals("")) {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (!cpf.equals("") && cpf.length() == 14) {
            this.cpf = cpf;
        }
    }
}

