package com.lessaapolinario;

import com.lessaapolinario.managers.GerenciadorDeTrabalhadorHorista;
import com.lessaapolinario.managers.GereneciadorDeTrabalhadorIntegral;

import java.util.Scanner;

public class Main {

    static GereneciadorDeTrabalhadorIntegral gereneciadorDeTrabalhadorIntegral = new GereneciadorDeTrabalhadorIntegral();
    static GerenciadorDeTrabalhadorHorista gerenciadorDeTrabalhadorHorista = new GerenciadorDeTrabalhadorHorista();

    public static void main(String[] args) {

    }

    public static void abrirDialogoCadastrarTrabalhadorIntegral() {
        Scanner in = new Scanner(System.in);

        System.out.println("Nome?");
        String nome = in.nextLine();

        System.out.println("Cadastro?");
        String cadastro = in.nextLine();

        System.out.println("Salário?");
        double salario = in.nextDouble();

        System.out.println("Idade?");
        int idade = in.nextInt();

        System.out.println("Endereço?");
        String endereco = in.nextLine();

        gereneciadorDeTrabalhadorIntegral
            .cadastrarTrabalhadorIntegral(nome, cadastro, salario, idade, endereco);
    }

    public static void menu() {
        System.out.println("##############################");
        System.out.println("1 - Cadastrar trabalhador Integral");
        System.out.println("2 - Cadastrar trabalhador Horista");
        System.out.println("3 - Obter salário trabalhador integral (pelo numero de cadastro)");
        System.out.println("4 – Obter salário trabalhador horista");
        System.out.println("5 – Obter ficha do trabalhador integral");
        System.out.println("6 – Obter ficha do trabalhador horista");
        System.out.println("7 – Obter maior salário entre os trabalhadores integrais");
        System.out.println("8 – Obter maior idade entre os trabalhadores horistas");
        System.out.println("0 – SAIR");
        System.out.println("##############################");
        System.out.println(">");
    }
}
