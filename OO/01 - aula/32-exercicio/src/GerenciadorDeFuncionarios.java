import java.util.ArrayList;

public class GerenciadorDeFuncionarios {

    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Gerente> gerentes;


    public GerenciadorDeFuncionarios() {
        this.funcionarios = new ArrayList<>();
        this.gerentes = new ArrayList<>();
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public ArrayList<Gerente> getGerentes() {
        return gerentes;
    }

    public Funcionario adicionarFuncionario(String nome, String cpf, double salario, String dataNascimento) {
        Funcionario f = new Funcionario(nome, cpf, salario, dataNascimento);

        funcionarios.add(f);

        System.out.println("Funcionário cadastrado com sucesso!");
        return f;
    }

    public Gerente adicionarGerente(String nome, String cpf, double salario, String dataNascimento) {
        Gerente g = new Gerente(nome, cpf, salario, dataNascimento);

        gerentes.add(g);

        System.out.println("Gerente cadastrado com sucesso!");
        return g;
    }

    public Gerente buscarGerente(String cpf) {
        for (Gerente c : gerentes) {
            String cpfProcurado = c.getCpf();

            if (cpfProcurado.equals(cpf)) {
                return c;
            }
        }

        return null;
    }
}
