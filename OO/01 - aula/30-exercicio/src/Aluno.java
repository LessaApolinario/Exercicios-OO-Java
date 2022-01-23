public class Aluno extends Pessoa {

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Aluno(String nome, String cpf, String dataNascimento, double nota1, double nota2, double nota3,
            double nota4) {
        super(nome, cpf, dataNascimento);

        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        }

        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }

        if (nota3 >= 0 && nota3 <= 10) {
            this.nota3 = nota3;
        }

        if (nota4 >= 0 && nota4 <= 10) {
            this.nota4 = nota4;
        }
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= 0 && nota1 <= 10) {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= 0 && nota2 <= 10) {
            this.nota2 = nota2;
        }
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if (nota3 >= 0 && nota3 <= 10) {
            this.nota3 = nota3;
        }
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        if (nota4 >= 0 && nota4 <= 10) {
            this.nota4 = nota4;
        }
    }

    @Override
    public String toString() {
        return "\n--------------------\n" + "Informações do aluno:\n" + "Nome: " + getNome() + "\n" + "CPF: " + getCpf()
                + "\n" + "Data de nascimento: " + getDataNascimento() + "\n" + "Nota 1: " + getNota1() + "\n"
                + "Nota 2: " + getNota2() + "\n" + "Nota 3: " + getNota3() + "\n" + "Nota 4: " + getNota4()
                + "\n--------------------\n";
    }
}
