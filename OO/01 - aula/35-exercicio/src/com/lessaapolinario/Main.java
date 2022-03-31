package com.lessaapolinario;

import com.lessaapolinario.classes.Trabalhador;
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

    public static void abrirDialogoCadastrarTrabalhadorHorista() {
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

        System.out.println("Horas trabalhadas?");
        int horasTrabalhadas = in.nextInt();

        System.out.println("Salário por hora?");
        double salarioHora = in.nextDouble();

        gerenciadorDeTrabalhadorHorista
            .cadastrarTrabalhadorHorista(nome, cadastro, salario, idade, endereco, horasTrabalhadas, salarioHora);
    }

    public static void obterSalarioTrabalhadorIntegral() {
        Scanner in = new Scanner(System.in);

        System.out.println("Cadastro?");
        String cadastro = in.nextLine();

        try {
            Trabalhador trabalhadorProcurado = gereneciadorDeTrabalhadorIntegral.buscarTrabalhadorIntegral(cadastro);
            double salarioProcurado = trabalhadorProcurado.getSalario();
            System.out.println("Salário do Integral: " + salarioProcurado);
        } catch (NullPointerException error) {
            System.out.println(error.getMessage());
            System.out.println("Trabalhador não encontrado!");
        }
    }

    public static void obterSalarioTrabalhadorHorista() {
        Scanner in = new Scanner(System.in);

        System.out.println("Cadastro?");
        String cadastro = in.nextLine();

        try {
            Trabalhador trabalhadorProcurado = gerenciadorDeTrabalhadorHorista.buscarTrabalhadorHorista(cadastro);
            double salarioProcurado = trabalhadorProcurado.getSalario();
            System.out.println("Salário do Horista: " + salarioProcurado);
        } catch (NullPointerException error) {
            System.out.println(error.getMessage());
            System.out.println("Trabalhador não encontrado!");
        }
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
