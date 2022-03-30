package com.lessaapolinario.interfaces;

import com.lessaapolinario.classes.TrabalhadorHorista;

public interface ManipulaTrabalhadorHorista {

    TrabalhadorHorista cadastrarTrabalhadorHorista(String nome, String cadastro, double salario, int idade, String endereco, int totalHorasTrabalhar, double salarioHora);

    TrabalhadorHorista buscarTrabalhadorHorista(String cadastro);
}
