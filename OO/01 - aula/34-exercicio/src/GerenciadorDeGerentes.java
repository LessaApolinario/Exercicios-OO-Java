import java.util.ArrayList;

public class GerenciadorDeGerentes {

    private ArrayList<Gerente> gerentes;

    public GerenciadorDeGerentes() {
        this.gerentes = new ArrayList<>();
    }

    public Gerente buscarGerente(String cpf) {
        for (Gerente g : gerentes) {
            String cpfProcurado = g.getCpf();

            if (cpfProcurado.equals(cpf)) {
                return g;
            }
        }

        return null;
    }

    public Gerente cadastrarGerente(String nome, String cpf,
            String dataNascimento, double salario, String departamento) {
        Gerente g = new Gerente(nome, cpf, dataNascimento, salario, departamento);

        return g;
    }

    public void obterSalarioGerente(String cpf) {
        try {
            Funcionario funcionarioProcurado = this.buscarGerente(cpf);
            double salarioGerente = funcionarioProcurado.getSalario();
            System.out.println("O salário do funcionário " +
                    funcionarioProcurado.getNome() + " é " + salarioGerente);
        } catch (NullPointerException error) {
            System.out.println(error.getMessage());
            System.out.println("O gerente não foi encontrado!");
        }
    }
}
