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
}
