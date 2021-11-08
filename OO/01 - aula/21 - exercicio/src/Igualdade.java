public class Igualdade {

  String[] palavras = new String[5];
  String[] nomes = new String[5];

  public boolean arraysIguais() {
    for (int i = 0; i < palavras.length; i++) {
      if (!palavras[i].equals(nomes[i])) return false;
    }

    return true;
  }
}
