import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static GerenciadorDeImoveis gerenciadorDeImoveis = new GerenciadorDeImoveis();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int op = -1;

        do {
            menu();
            System.out.println("Escolha uma opção: ");
            op = in.nextInt();
            limparBuffer(in);

            switch (op) {
                case 1:
                    abrirDialogoRegistrarCasa();
                    break;
                case 2:
                    abrirDialogoRegistrarApartamento();
                    break;
                case 3:
                    listarNaoAlugados(gerenciadorDeImoveis.getImoveis());
                    break;
                case 4:
                    listarMobiliados(gerenciadorDeImoveis.getImoveis());
            }

        } while (op != 0);
    }

    public static void abrirDialogoRegistrarCasa() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o nome da rua da casa? ");
        String rua = in.nextLine();

        System.out.println("Qual é o número da casa? ");
        String numero = in.nextLine();

        System.out.println("Qual é o bairro da casa? ");
        String bairro = in.nextLine();

        System.out.println("Qual é a cidade da casa? ");
        String cidade = in.nextLine();

        System.out.println("Qual é o estado da casa? ");
        String estado = in.nextLine();

        System.out.println("Qual é o cep da rua da casa? ");
        String cep = in.nextLine();

        System.out.println("A casa está alugada? ");
        String respostaAlugada = in.nextLine();

        boolean estaAlugado = respostaAlugada.equals("Sim") || respostaAlugada.equals("sim") ? true : false;

        System.out.println("A casa está mobiliada? ");
        String respostaMobiliada = in.nextLine();

        boolean estaMobiliado = respostaMobiliada.equals("Sim") || respostaMobiliada.equals("sim") ? true : false;

        gerenciadorDeImoveis.registrarCasa(rua, numero, bairro, cidade, estado, cep, estaAlugado, estaMobiliado);
    }

    public static void abrirDialogoRegistrarApartamento() {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual é o nome da rua do apartamento? ");
        String rua = in.nextLine();

        System.out.println("Qual é o número do apartamento? ");
        String numero = in.nextLine();

        System.out.println("Qual é o bairro do apartamento? ");
        String bairro = in.nextLine();

        System.out.println("Qual é a cidade do apartamento? ");
        String cidade = in.nextLine();

        System.out.println("Qual é o estado do apartamento? ");
        String estado = in.nextLine();

        System.out.println("Qual é o cep da rua do apartamento? ");
        String cep = in.nextLine();

        System.out.println("O apartamento está alugada? ");
        String respostaAlugado = in.nextLine();

        boolean estaAlugado = respostaAlugado.equals("Sim") || respostaAlugado.equals("sim") ? true : false;

        System.out.println("O apartamento está mobiliado? ");
        String respostaMobiliada = in.nextLine();

        boolean estaMobiliado = respostaMobiliada.equals("Sim") || respostaMobiliada.equals("sim") ? true : false;

        System.out.println("Qual é o nome do prédio do apartamento? ");
        String nomePredio = in.nextLine();

        gerenciadorDeImoveis.registrarApartamento(rua, numero, bairro, cidade, estado, cep, estaAlugado, estaMobiliado,
                nomePredio);
    }

    public static void listarNaoAlugados(ArrayList<Imovel> imoveis) {
        for (Imovel imovel : imoveis) {
            boolean alugado = imovel.isEstaAlugado();

            if (!alugado) {
                System.out.println("Rua (não alugado): " + imovel.getRua());
            }
        }
    }

    public static void listarMobiliados(ArrayList<Imovel> imoveis) {
        for (Imovel imovel : imoveis) {
            boolean mobiliado = imovel.isEstaMobiliado();

            if (mobiliado) {
                System.out.println(imovel.toString());
            }
        }
    }

    public static void menu() {
        System.out.println("1. Registrar Casa");
        System.out.println("2. Registrar Apartamento");
        System.out.println("3. Listar Imóveis não alugados (pelo nome da rua)");
        System.out.println("4. Listar todos os Imóveis mobiliados");
        System.out.println("0. Sair");
    }

    public static void limparBuffer(Scanner sc) {
        if (sc.hasNextLine()) {
            sc.nextLine();
        }
    }
}
