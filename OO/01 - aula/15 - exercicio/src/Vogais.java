public class Vogais {

  String palavra;

  public int contarVogais() {
    int contadorVogais = 0;

    for (int i = 0; i < palavra.length(); i++) {
      char c = palavra.charAt(i);

      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        contadorVogais++;
      }
    }

    return contadorVogais;
  }
}
