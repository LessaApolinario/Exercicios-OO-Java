package com.lessaapolinario.managers;

import com.lessaapolinario.classes.TrabalhadorIntegral;
import com.lessaapolinario.interfaces.ManipulaTrabalhadorIntegral;

import java.util.ArrayList;

public class GerenciadorDeTrabalhadorIntegral implements ManipulaTrabalhadorIntegral {
    private ArrayList<TrabalhadorIntegral> trabalhadores;

    public GerenciadorDeTrabalhadorIntegral() {
        this.trabalhadores = new ArrayList<>();
    }

    public ArrayList<TrabalhadorIntegral> getTrabalhadores() {
        return trabalhadores;
    }

    @Override
    public TrabalhadorIntegral cadastrarTrabalhadorIntegral(String nome, String cadastro, double salario, int idade, String endereco) {
        TrabalhadorIntegral ti = new TrabalhadorIntegral(nome, cadastro, salario, idade, endereco);
        trabalhadores.add(ti);
        return ti;
    }

    @Override
    public TrabalhadorIntegral buscarTrabalhadorIntegral(String cadastro) {
        for (TrabalhadorIntegral ti : trabalhadores) {
            String cadastroIntegral = ti.getCadastro();

            if (cadastroIntegral.equals(cadastro)) {
                return ti;
            }
        }

        return null;
    }

    @Override
    public double obterMaiorSalarioIntegrais() {
        double maiorSalario = 0;

        for (int i = 0; i < trabalhadores.size(); i++) {
            double salarioAtual = trabalhadores.get(i).getSalario();

            if (i == 0) {
                maiorSalario = salarioAtual;
            }

            if (salarioAtual > maiorSalario) {
                maiorSalario = salarioAtual;
            }
        }

        return maiorSalario;
    }
}
