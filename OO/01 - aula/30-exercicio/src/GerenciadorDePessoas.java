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
    public void cadastrarAluno(String nome, String cpf, String dataNascimento, double nota1, double nota2,
            double nota3, double nota4) {
        Aluno aluno = new Aluno(nome, cpf, dataNascimento, nota1, nota2, nota3, nota4);

        alunos.add(aluno);
    }

    // Cadastrando um professor
    public void cadastrarProfessor(String nome, String cpf, String dataNascimento, double salario) {
        Professor professor = new Professor(nome, cpf, dataNascimento, salario);

        professores.add(professor);
    }

    // Primeiro temos que buscar o aluno, para só então exibir as suas informações!
    public Aluno buscarAluno(String cpf) {
        for (Aluno aluno : alunos) {
            if (cpf.equals(aluno.getCpf())) {
                return aluno;
            }
        }

        return null;
    }

    // Exibindo as informações dos alunos
    public void obterInformacoesAluno(String cpf) {
        Aluno alunoProcurado = buscarAluno(cpf);

        System.out.println(alunoProcurado.toString());
    }

    // Buscando o professor
    public Professor buscarProfessor(String cpf) {
        for (Professor professor : professores) {
            if (cpf.equals(professor.getCpf())) {
                return professor;
            }
        }

        return null;
    }

    public void obterInformacoesProfessor(String cpf) {
        Professor professorProcurado = buscarProfessor(cpf);

        System.out.println(professorProcurado.toString());
    }
}
