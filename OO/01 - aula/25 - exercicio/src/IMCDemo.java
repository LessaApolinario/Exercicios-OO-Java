import java.util.Scanner;

public class IMCDemo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    IMC[] imc = new IMC[5]; // Array de objetos

    // Inicializando os objetos
    for (int i = 0; i < imc.length; i++) {
      imc[i] = new IMC(1, 1, "");
    }

    double[] pesos = new double[5];
    double[] alturas = new double[5];
    String[] nomes = new String[5];

    int op = -1;

    for (int i = 0; i < imc.length || op != 0; i++) {
      imc[i].menu();
      System.out.println("Escolha uma opção: ");
      op = input.nextInt();

      switch (op) {
        case 1:
          break;
        case 2:
          for (int j = 0; j < imc.length; j++) {
            if (imc[j].calcIMC() < 18.5) {
              System.out.println(
                "A pessoa " + imc[j].getNome() + " está abaixo do peso"
              );
            }
          }
          break;
        case 3:
          for (int k = 0; k < imc.length; k++) {
            if (imc[k].calcIMC() > 18.5 && imc[k].calcIMC() < 25) {
              System.out.println(
                "A pessoa " + imc[k].getNome() + " está dentro do peso ideal"
              );
            }
          }
          break;
        case 4:
          for (int l = 0; l < imc.length; l++) {
            if (imc[l].calcIMC() >= 25) {
              System.out.println(
                "A pessoa " + imc[l].getNome() + " está acima do peso"
              );
            }
          }
          break;
        case 0:
          System.out.println("Você saiu!");
          input.close();
          break;
      }
    }
  }
}
