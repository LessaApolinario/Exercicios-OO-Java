import java.util.Scanner;

public class MediaVetor {

  int tamanho;

  public double media(int v[]) {
    int total = 0;

    for (int i = 0; i < v.length; i++) {
      total += v[i];
    }

    return (double) (total / v.length);
  }
}
