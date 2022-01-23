import java.util.ArrayList;

public class GerenciadorDePessoas {

    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;

    // Gerando ArrayLists vazios
    public GerenciadorDePessoas() {
        this.alunos = new ArrayList<>();
        this.professores = new ArrayList<>();
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }
}
