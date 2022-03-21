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
}
