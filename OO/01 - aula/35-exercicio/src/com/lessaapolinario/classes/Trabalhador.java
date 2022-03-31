package com.lessaapolinario.classes;

public abstract class Trabalhador {

    private String nome;
    private String cadastro;
    private double salario;
    private int idade;
    private String endereco;

    public Trabalhador(String nome, String cadastro, double salario, int idade, String endereco) {
        this.nome = nome;
        this.cadastro = cadastro;
        this.salario = salario;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCadastro() {
        return cadastro;
    }

    public void setCadastro(String cadastro) {
        this.cadastro = cadastro;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Trabalhador{" +
            "nome='" + nome + '\'' +
            ", cadastro='" + cadastro + '\'' +
            ", salario=" + salario +
            ", idade=" + idade +
            ", endereco='" + endereco + '\'' +
            '}';
    }
}
