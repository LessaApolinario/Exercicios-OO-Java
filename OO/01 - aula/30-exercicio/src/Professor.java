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

    // O professor é quem calcula as notas dos alunos e mostra a média!
    public String obterMediaAluno(Aluno aluno) {
        double mediaAluno = (aluno.getNota1() + aluno.getNota2() + aluno.getNota3() + aluno.getNota4()) / 4;

        return "A média do aluno " + aluno.getNome() + " é: " + mediaAluno;
    }
}
