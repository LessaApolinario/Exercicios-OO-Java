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

  public void cadastrarCliente() {
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
  }
}
