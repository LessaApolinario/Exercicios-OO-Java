package gerenciadores;

import funcionarios.Funcionario;
import funcionarios.Gerente;

public class GerenciadorDeFuncionarios {

    public Funcionario adicionarFuncionario(String nome, String cpf, double salario, String dataNascimento) {
        Funcionario f = new Funcionario(nome, cpf, salario, dataNascimento);
        return f;
    }

    public Gerente adicionarGerente(String nome, String cpf, double salario, String dataNascimento) {
        Gerente g = new Gerente(nome, cpf, salario, dataNascimento);
        return g;
    }
}
