package com.lessaapolinario.classes;

public class TrabalhadorHorista extends Trabalhador {

    private int totalHorasTrabalhar;
    private double salarioHora;

    public TrabalhadorHorista(String nome, String cadastro, double salario, int idade, String endereco, int totalHorasTrabalhar, double salarioHora) {
        super(nome, cadastro, salario, idade, endereco);
        this.totalHorasTrabalhar = totalHorasTrabalhar;
        this.salarioHora = salarioHora;
    }

    public int getTotalHorasTrabalhar() {
        return totalHorasTrabalhar;
    }

    public void setTotalHorasTrabalhar(int totalHorasTrabalhar) {
        this.totalHorasTrabalhar = totalHorasTrabalhar;
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
        return this.getTotalHorasTrabalhar() * this.getSalarioHora();
    }
}
