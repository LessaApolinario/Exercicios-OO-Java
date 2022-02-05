package funcionarios;

public class Gerente extends Funcionario {

    public Gerente(String nome, String cpf, double salario, String dataNascimento) {
        super(nome, cpf, salario, dataNascimento);
    }

    public double calcularSalario() {
        double salario = super.getSalario() + 2000;
        return salario;
    }
}
