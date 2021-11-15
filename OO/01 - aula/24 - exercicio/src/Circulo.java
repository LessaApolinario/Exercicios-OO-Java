public class Circulo {

  private double r;

  public Circulo(double r) {
    if (r >= 0) {
      this.r = r;
    }
  }

  public void setRaio(double r) {
    if (r >= 0) {
      this.r = r;
    }
  }

  public double getRaio() {
    return r;
  }

  public double areaCirculo() {
    return Math.PI * Math.pow(getRaio(), 2);
  }

  public double perimetroCirculo() {
    return 2 * Math.PI * getRaio();
  }

  public void menu() {
    System.out.println("1. Criar um círculo (Digitar valor de r)");
    System.out.println("2. Calcular a Área");
    System.out.println("3. Calcular perímetro");
    System.out.println("0. Sair");
  }
}
