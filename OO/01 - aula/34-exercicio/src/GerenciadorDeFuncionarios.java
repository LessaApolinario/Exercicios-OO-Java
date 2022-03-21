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
}
