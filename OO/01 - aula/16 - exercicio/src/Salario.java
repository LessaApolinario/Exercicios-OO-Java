public class Salario {

  double salario;

  public double obterImposto() {
    double imposto = 0;

    if (salario <= 2000) {
      System.out.println("Isento de imposto");

      return imposto;
    } else if (salario >= 2000.01 && salario <= 3500) {
      return salario + (salario * 0.15);
    } else if (salario >= 3500.01 && salario <= 5000) {
      return salario + (salario * 0.22);
    } else {
      return salario + (salario * 0.3);
    }
  }
}
