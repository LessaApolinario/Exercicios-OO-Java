package com.lessaapolinario;

import com.lessaapolinario.classes.Trabalhador;
import com.lessaapolinario.managers.GerenciadorDeTrabalhadorHorista;
import com.lessaapolinario.managers.GerenciadorDeTrabalhadorIntegral;

import java.util.Scanner;

public class Main {

    static GerenciadorDeTrabalhadorIntegral gerenciadorDeTrabalhadorIntegral = new GerenciadorDeTrabalhadorIntegral();
    static GerenciadorDeTrabalhadorHorista gerenciadorDeTrabalhadorHorista = new GerenciadorDeTrabalhadorHorista();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op = -1;

        do {
            menu();
            op = in.nextInt();
            limparBuffer(in);

            switch (op) {
                case 1:
                    abrirDialogoCadastrarTrabalhadorIntegral();
                    break;
                case 2:
                    abrirDialogoCadastrarTrabalhadorHorista();
                    break;
                case 3:
                    obterSalarioTrabalhadorIntegral();
                    break;
                case 4:
                    obterSalarioTrabalhadorHorista();
                    break;
                case 5:
                    obterFichaTrabalhadorIntegral();
                    break;
                case 6:
                    obterFichaTrabalhadorHorista();
                    break;
                case 7:
                    gerenciadorDeTrabalhadorIntegral.obterMaiorSalarioIntegrais();
                    break;
                case 8:
                    gerenciadorDeTrabalhadorHorista.obterMaiorSalarioHoristas();
                    break;
            }
        } while (op != 0);
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
        limparBuffer(in);

        System.out.println("Endereço?");
        String endereco = in.nextLine();

        gerenciadorDeTrabalhadorIntegral
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
        limparBuffer(in);

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
            Trabalhador trabalhadorProcurado = gerenciadorDeTrabalhadorIntegral.buscarTrabalhadorIntegral(cadastro);
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

    public static void obterFichaTrabalhadorIntegral() {
        Scanner in = new Scanner(System.in);

        System.out.println("Cadastro?");
        String cadastro = in.nextLine();

        try {
            Trabalhador trabalhadorIntegral = gerenciadorDeTrabalhadorIntegral.buscarTrabalhadorIntegral(cadastro);
            System.out.println(trabalhadorIntegral.toString());
        } catch (NullPointerException error) {
            System.out.println(error.getMessage());
            System.out.println("Trabalhador não encontrado!");
        }
    }

    public static void obterFichaTrabalhadorHorista() {
        Scanner in = new Scanner(System.in);

        System.out.println("Cadastro?");
        String cadastro = in.nextLine();

        try {
            Trabalhador trabalhadorHorista = gerenciadorDeTrabalhadorHorista.buscarTrabalhadorHorista(cadastro);
            System.out.println(trabalhadorHorista.toString());
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

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
