import java.util.ArrayList;

public class GerenciadorDeClientes {

    private ArrayList<Cliente> clientes;

    public Cliente buscarCliente(String cpf) {
        for (Cliente c : clientes) {
            String cpfProcurado = c.getCpf();

            if (cpf.equals(cpfProcurado)) {
                return c;
            }
        }

        return null;
    }
}
