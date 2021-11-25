import java.util.ArrayList;
import java.util.Scanner;

public class Conta {

  private String nome;
  private int numeroConta;
  private double saldo;

  public Conta(String nome, int numeroConta, double saldo) {
    this.nome = nome;

    if (numeroConta > 0) {
      this.numeroConta = numeroConta;
    }

    if (saldo >= 0) {
      this.saldo = saldo;
    }
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNumeroConta(int numeroConta) {
    if (numeroConta > 0) {
      this.numeroConta = numeroConta;
    }
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setSaldo(double saldo) {
    if (saldo >= 0) {
      this.saldo = saldo;
    }
  }

  public double getSaldo() {
    return saldo;
  }

  public void cadastrarCliente(ArrayList<Conta> contas) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o nome do cliente: ");
    nome = input.nextLine();
    setNome(nome);

    System.out.println("Digite o número da conta: ");
    numeroConta = input.nextInt();
    setNumeroConta(numeroConta);

    System.out.println("Digite o saldo do cliente: ");
    saldo = input.nextDouble();
    setSaldo(saldo);

    Conta c = new Conta(nome, numeroConta, saldo);
    contas.add(c);

    System.out.println("Cliente cadastrado com sucesso!");
  }

  public void menu() {
    System.out.println("1. Cadastrar Cliente");
    System.out.println("2. Consultar dados de um cliente");
    System.out.println("3. Verificar saldo");
    System.out.println("4. Efetuar saque da conta");
    System.out.println("5. Efetuar depósito na conta");
    System.out.println("0. Sair");
  }

  public void consultarCliente(String nomeCliente, ArrayList<Conta> contas) {
    for (int i = 0; i < contas.size(); i++) {
      if (nomeCliente.equals(contas.get(i).getNome())) {
        System.out.println(
          "O cliente " +
          contas.get(i).getNome() +
          " com o número da conta " +
          contas.get(i).getNumeroConta() +
          " possui " +
          contas.get(i).getSaldo() +
          " R$ na conta."
        );
      }
    }
  }

  public void verificarSaldo(String nomeCliete, ArrayList<Conta> contas) {
    for (int i = 0; i < contas.size(); i++) {
      if (nomeCliete.equals(contas.get(i).getNome())) {
        System.out.println(
          "O saldo do cliente " +
          contas.get(i).getNome() +
          " é " +
          contas.get(i).getSaldo() +
          " R$."
        );
      }
    }
  }

  public void efetuarSaque(
    double quantia,
    ArrayList<Conta> contas,
    String nomeCliente
  ) {
    for (int i = 0; i < contas.size(); i++) {
      if (nomeCliente.equals(contas.get(i).getNome())) {
        if (quantia <= contas.get(i).getSaldo()) {
          double novoSaldo = contas.get(i).getSaldo();
          contas.get(i).setSaldo(novoSaldo -= quantia);

          System.out.println("Saque realizado com sucesso!");
        }
      }
    }
  }

  public void efetuarDeposito(
    double quantia,
    ArrayList<Conta> contas,
    String nomeCliente
  ) {
    for (int i = 0; i < contas.size(); i++) {
      if (nomeCliente.equals(contas.get(i).getNome())) {
        if (quantia > 0.0) {
          double novoSaldo = contas.get(i).getSaldo();
          contas.get(i).setSaldo(novoSaldo += quantia);

          System.out.println("Depósito realizado com sucesso!");
        }
      }
    }
  }
}
