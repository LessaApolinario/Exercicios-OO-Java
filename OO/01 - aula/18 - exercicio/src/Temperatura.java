public class Temperatura {

  double K;
  double F;
  int opcao;

  public void menu() {
    System.out.println("1. Transformar de Fahrenheit para Celsius");
    System.out.println("2. Transformar de Kelvin para Celsius");
  }

  public double fahrenheitParaCelsius() {
    return 5 * (F - 32) / 9;
  }

  public double kelvinParaCelsius() {
    return K - 273;
  }
}
