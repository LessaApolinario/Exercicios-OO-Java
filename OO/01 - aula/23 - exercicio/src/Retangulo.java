import java.util.Scanner;

public class Retangulo {

  private double B;
  private double H;

  public Retangulo(double B, double H) {
    if (B >= 0) {
      this.B = B;
    }

    if (H >= 0) {
      this.H = H;
    }
  }

  public void setB(double B) {
    if (B >= 0) {
      this.B = B;
    }
  }

  public double getB() {
    return B;
  }

  public void setH(double H) {
    if (H >= 0) {
      this.H = H;
    }
  }

  public double getH() {
    return H;
  }

  public void menu() {
    System.out.println("1. Criar um retângulo (Digitar valor de B e H)");
    System.out.println("2. Calcular Área");
    System.out.println("3. Calcular Perímetro");
    System.out.println("0. Sair");
  }

  public void criarRetangulo() {
    Scanner input = new Scanner(System.in);

    System.out.println("Qual é o tamanho da base? ");
    setB(input.nextDouble());

    System.out.println("Qual é o tamanho da altura? ");
    setH(input.nextDouble());

    System.out.println("Retângulo criado com sucesso!");
  }

  public double areaRetangulo() {
    return getB() * getH();
  }

  public double perimetroRetangulo() {
    return (2 * getB()) + (2 * getH());
  }
}
