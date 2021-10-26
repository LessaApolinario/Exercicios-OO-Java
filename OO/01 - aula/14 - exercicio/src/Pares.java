public class Pares {

  int numero;

  public String paridade() {
    return numero % 2 == 0 ? "Par" : "Impar";
  }

  public int contarPares() {
    int pares = 0;

    if (paridade() == "Par") {
      pares++;
    }

    return pares;
  }
}
