public class ContaDemo {

  public static void main(String[] args) {
    Conta conta = new Conta("", 1, 0);
    Conta[] contas = new Conta[1];

    for (int i = 0; i < contas.length; i++) {
      contas[i] = new Conta("", 1, 0);
    }
  }
}
