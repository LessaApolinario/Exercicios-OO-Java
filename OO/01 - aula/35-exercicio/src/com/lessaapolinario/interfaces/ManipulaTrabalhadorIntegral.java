package com.lessaapolinario.interfaces;

import com.lessaapolinario.classes.TrabalhadorIntegral;

public interface ManipulaTrabalhadorIntegral {

    TrabalhadorIntegral cadastrarTrabalhadorIntegral(String nome, String cadastro, double salario, int idade, String endereco);

    TrabalhadorIntegral buscarTrabalhadorIntegral(String cadastro);

    double obterMaiorSalarioIntegrais();
}
