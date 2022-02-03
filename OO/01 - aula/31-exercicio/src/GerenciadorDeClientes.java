import java.util.ArrayList;

public class GerenciadorDeClientes {

    private ArrayList<Cliente> clientes;

    public GerenciadorDeClientes() {
        this.clientes = new ArrayList<>();
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente c : clientes) {
            String cpfProcurado = c.getCpf();

            if (cpf.equals(cpfProcurado)) {
                return c;
            }
        }

        return null;
    }

    public void cadastrarCliente(String nome, String cpf, String dataNascimento, ContaCorrente contaCorrente,
            ContaPoupanca contaPoupanca) {
        Cliente cliente = new Cliente(nome, cpf, dataNascimento, contaCorrente, contaPoupanca);

        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }
}
