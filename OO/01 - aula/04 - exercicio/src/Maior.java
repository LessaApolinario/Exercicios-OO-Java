public class Maior {

  int numero1;
  int numero2;
  int numero3;

  public int maiorValor() {
    int maior = numero1;

    if (numero2 > maior) {
      maior = numero2;
    }

    if (numero3 > maior) {
      maior = numero2;
    }

    return maior;
  }
}
