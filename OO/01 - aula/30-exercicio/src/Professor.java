public class Professor extends Pessoa {

    private double salario;

    public Professor(String nome, String cpf, String dataNascimento, double salario) {
        super(nome, cpf, dataNascimento);

        if (salario > 0) {
            this.salario = salario;
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
}
