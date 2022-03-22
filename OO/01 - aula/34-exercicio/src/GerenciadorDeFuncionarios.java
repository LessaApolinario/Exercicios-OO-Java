import java.util.ArrayList;

public class GerenciadorDeFuncionarios {

    private ArrayList<Funcionario> funcionarios;

    public GerenciadorDeFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public Funcionario buscarFuncionario(String cpf) {
        for (Funcionario f : funcionarios) {
            String cpfProcurado = f.getCpf();

            if (cpfProcurado.equals(cpf)) {
                return f;
            }
        }

        return null;
    }

    public Funcionario cadastrarFuncionario(String nome, String cpf,
            String dataNascimento, double salario) {
        Funcionario f = new Funcionario(nome, cpf, dataNascimento, salario);

        return f;
    }

    public void obterSalarioFuncionario(String cpf) {
        try {
            Funcionario funcionarioProcurado = this.buscarFuncionario(cpf);
            double salarioFuncionario = funcionarioProcurado.getSalario();
            System.out.println("O salário do funcionário " +
                    funcionarioProcurado.getNome() + " é " + salarioFuncionario);
        } catch (NullPointerException error) {
            System.out.println(error.getMessage());
            System.out.println("O funcionário não foi encontrado!");
        }
    }
}
