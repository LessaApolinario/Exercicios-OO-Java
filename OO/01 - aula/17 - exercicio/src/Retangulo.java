public class Retangulo {

  double b;
  double h;
  int opcao;

  public void menu() {
    System.out.println("1. Calcular a área do retângulo");
    System.out.println("2. Calcular o perímetro do retângulo");
  }

  public double calcularArea() {
    return b * h;
  }

  public double calcularPerimetro() {
    return (2 * b) + (2 * h);
  }
}
