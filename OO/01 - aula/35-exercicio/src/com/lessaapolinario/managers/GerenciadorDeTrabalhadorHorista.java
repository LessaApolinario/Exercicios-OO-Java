package com.lessaapolinario.managers;

import com.lessaapolinario.classes.TrabalhadorHorista;
import com.lessaapolinario.interfaces.ManipulaTrabalhadorHorista;

import java.util.ArrayList;

public class GerenciadorDeTrabalhadorHorista implements ManipulaTrabalhadorHorista {
    private ArrayList<TrabalhadorHorista> trabalhadores;

    public GerenciadorDeTrabalhadorHorista() {
        this.trabalhadores = new ArrayList<>();
    }

    public ArrayList<TrabalhadorHorista> getTrabalhadores() {
        return trabalhadores;
    }

    @Override
    public TrabalhadorHorista cadastrarTrabalhadorHorista(String nome, String cadastro, double salario, int idade, String endereco, int horasTrabalhadas, double salarioHora) {
        TrabalhadorHorista th = new TrabalhadorHorista(nome, cadastro, salario, idade, endereco, horasTrabalhadas, salarioHora);
        trabalhadores.add(th);
        return th;
    }

    @Override
    public TrabalhadorHorista buscarTrabalhadorHorista(String cadastro) {
        for (TrabalhadorHorista th : trabalhadores) {
            String cadastroHorista = th.getCadastro();

            if (cadastroHorista.equals(cadastro)) {
                return th;
            }
        }

        return null;
    }

    @Override
    public int obterMaiorIdadeHoristas() {
        int maiorIdade = 0;

        for (int i = 0; i < trabalhadores.size(); i++) {
            int idadeAtual = trabalhadores.get(i).getIdade();

            if (i == 0) {
                maiorIdade = idadeAtual;
            }

            if (idadeAtual > maiorIdade) {
                maiorIdade = idadeAtual;
            }
        }

        return maiorIdade;
    }
}
