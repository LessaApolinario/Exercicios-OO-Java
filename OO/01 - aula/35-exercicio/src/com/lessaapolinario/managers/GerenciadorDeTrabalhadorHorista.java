package com.lessaapolinario.managers;

import com.lessaapolinario.classes.TrabalhadorHorista;
import com.lessaapolinario.interfaces.ManipulaTrabalhadorHorista;

import java.util.ArrayList;

public class GerenciadorDeTrabalhadorHorista implements ManipulaTrabalhadorHorista {
    private ArrayList<TrabalhadorHorista> trabalhadores;

    public GerenciadorDeTrabalhadorHorista() {
        this.trabalhadores = new ArrayList<>();
    }

    @Override
    public TrabalhadorHorista cadastrarTrabalhadorHorista(String nome, String cadastro, double salario, int idade, String endereco, int totalHorasTrabalhar, double salarioHora) {
        TrabalhadorHorista th = new TrabalhadorHorista(nome, cadastro, salario, idade, endereco, totalHorasTrabalhar, salarioHora);
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
}
