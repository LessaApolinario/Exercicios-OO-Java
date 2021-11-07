public class IdadePessoa {

  int[] idades = new int[3];
  String[] nomes = new String[3];

  public String pessoaMaisVelha() {
    int maior = idades[0];
    String maisVelha = nomes[0];

    for (int i = 0; i < idades.length; i++) {
      if (idades[i] > maior) {
        maisVelha = nomes[i];
      }
    }

    return maisVelha;
  }

  public String pessoaMaisNova() {
    int menor = idades[0];
    String maisNova = nomes[0];

    for (int i = 0; i < idades.length; i++) {
      if (idades[i] < menor) {
        maisNova = nomes[i];
      }
    }

    return maisNova;
  }

  public int maiorDeIdade() {
    int cont = 0;

    for (int i = 0; i < idades.length; i++) {
      if (idades[i] > 18) {
        cont++;
      }
    }

    return cont;
  }
}
