package com.lessaapolinario.managers;

import com.lessaapolinario.classes.TrabalhadorIntegral;
import com.lessaapolinario.interfaces.ManipulaTrabalhadorIntegral;

import java.util.ArrayList;

public class GereneciadorDeTrabalhadorIntegral implements ManipulaTrabalhadorIntegral {
    private ArrayList<TrabalhadorIntegral> trabalhadores;

    public GereneciadorDeTrabalhadorIntegral() {
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
}
