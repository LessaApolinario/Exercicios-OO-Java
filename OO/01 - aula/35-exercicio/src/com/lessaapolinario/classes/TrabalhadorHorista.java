package com.lessaapolinario.classes;

public class TrabalhadorHorista extends Trabalhador {

    private int horasTrabalhadas;
    private double salarioHora;

    public TrabalhadorHorista(String nome, String cadastro, double salario, int idade, String endereco, int horasTrabalhadas, double salarioHora) {
        super(nome, cadastro, salario, idade, endereco);
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public double getSalario() {
        /*
            O salário do horista é igual ao total de horas trabalhadas
            vezes o salário por hora.
        */
        return this.getHorasTrabalhadas() * this.getSalarioHora();
    }

    @Override
    public String toString() {
        return "TrabalhadorHorista{" +
            "nome='" + super.getNome() + '\'' +
            ", cadastro='" + super.getCadastro() + '\'' +
            ", salario=" + this.getSalario() +
            ", idade=" + super.getIdade() +
            ", endereco='" + super.getEndereco() + '\'' +
            ", horasTrabalhadas=" + this.horasTrabalhadas +
            ", salarioHora=" + this.salarioHora +
            '}';
    }
}
