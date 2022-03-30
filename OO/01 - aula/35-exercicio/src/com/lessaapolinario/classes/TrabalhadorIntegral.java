package com.lessaapolinario.classes;

public class TrabalhadorIntegral extends Trabalhador {

    public TrabalhadorIntegral(String nome, String cadastro, double salario, int idade, String endereco) {
        super(nome, cadastro, salario, idade, endereco);
    }

    @Override
    public double getSalario() {
        double salario = super.getSalario();
        int idade = super.getIdade();
        /*
            Para trabalhadores até 30 anos,
            o aumento é de 16%, caso contrário
            é 25%.
        */
        if (idade <= 30) {
            salario += salario * 0.16;
        } else {
            salario += salario * 0.25;
        }

        return salario;
    }
}
