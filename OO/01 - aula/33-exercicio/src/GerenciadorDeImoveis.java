import java.util.ArrayList;

public class GerenciadorDeImoveis {

    private ArrayList<Casa> casas;
    private ArrayList<Apartamento> apartamentos;

    public GerenciadorDeImoveis() {
        this.casas = new ArrayList<>();
        this.apartamentos = new ArrayList<>();
    }

    public Casa registrarCasa(String rua, String numero, String bairro, String cidade, String estado, String cep,
            boolean estaAlugado,
            boolean estaMobiliado) {
        Casa c = new Casa(rua, numero, bairro, cidade, estado, cep, estaAlugado, estaMobiliado);

        casas.add(c);

        System.out.println("Casa registrada com sucesso!");

        return c;
    }

    public Apartamento registrarApartamento(String rua, String numero, String bairro, String cidade, String estado,
            String cep, boolean estaAlugado,
            boolean estaMobiliado, String nomePredio) {
        Apartamento ap = new Apartamento(rua, numero, bairro, cidade, estado, cep, estaAlugado, estaMobiliado,
                nomePredio);

        apartamentos.add(ap);

        System.out.println("Aspartamento registrado com sucesso!");

        return ap;
    }
}
