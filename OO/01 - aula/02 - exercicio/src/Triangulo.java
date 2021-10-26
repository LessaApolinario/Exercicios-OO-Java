public class Triangulo {

  int lado1;
  int lado2;
  int lado3;

  public String verificarTipo() {
    if ((lado1 == lado2) && (lado2 == lado3)) {
      return "Equilátero";
    } else if ((lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3)) {
      return "Escaleno";
    } else {
      return "Isósceles";
    }
  }
}
