package com.lessaapolinario.exceptions;

public class TrabalhadorNaoEncontradoException extends NullPointerException {

    public TrabalhadorNaoEncontradoException() {
        super("O trabalhador não foi encontrado");
    }
}
