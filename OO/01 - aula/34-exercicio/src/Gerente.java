public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, String cpf, String dataNascimento,
            double salario, String departamento) {
        super(nome, cpf, dataNascimento, salario);
        this.departamento = departamento;
        this.bonus();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void bonus() {
        double salario = super.getSalario();
        salario += 1500;
        super.setSalario(salario);
    }
}
