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

    // Cadastrando um aluno, observe que usamos também os atributos de pessoa
    public Aluno cadastrarAluno(String nome, String cpf, String dataNascimento, double nota1, double nota2,
            double nota3, double nota4) {
        Aluno aluno = new Aluno(nome, cpf, dataNascimento, nota1, nota2, nota3, nota4);

        return aluno;
    }

    // Cadastrando um professor
    public Professor cadastrarProfessor(String nome, String cpf, String dataNascimento, double salario) {
        Professor professor = new Professor(nome, cpf, dataNascimento, salario);

        return professor;
    }

    // Primeiro temos que buscar o aluno, para só então exibir as suas informações!
    public String buscarAluno(String cpf) {
        for (Aluno aluno : alunos) {
            if (cpf.equals(aluno.getCpf())) {
                String alunoEncontrado = aluno.getCpf();
                return alunoEncontrado;
            }
        }

        return "O aluno não foi encontrado!";
    }

    // Exibindo as informações dos alunos
    public void obterInformacoesAluno(Aluno aluno) {
        String  alunoProcurado = buscarAluno(aluno.getCpf());

        System.out.println(alunoProcurado.toString());
    }
}
