public class Funcionario {

    private String nome;
    private String cpf;
    private double salario;
    private String dataNascimento;

    public Funcionario(String nome, String cpf, double salario, String dataNascimento) {
        if (!nome.equals("")) {
            this.nome = nome;
        }

        if (!cpf.equals("") && cpf.length() == 14) {
            this.cpf = cpf;
        }

        if (salario > 0) {
            this.salario = salario;
        }

        if (!dataNascimento.equals("")) {
            this.dataNascimento = dataNascimento;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if (!dataNascimento.equals("")) {
            this.dataNascimento = dataNascimento;
        }
    }

    @Override
    public String toString() {
        return "\n--------------------\n" + "Informações do funcionário: \n" + "Nome: " + getNome() + "\n" + "CPF: "
                + getCpf() + "\n" + "Salário: " + getSalario() + "\n" + "Data de nascimento: " + getDataNascimento()
                + "\n--------------------\n";
    }
}
