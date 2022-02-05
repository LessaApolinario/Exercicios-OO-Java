import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static GerenciadorDeImoveis gerenciadorDeImoveis = new GerenciadorDeImoveis();

    public static void main(String[] args) {

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
}
