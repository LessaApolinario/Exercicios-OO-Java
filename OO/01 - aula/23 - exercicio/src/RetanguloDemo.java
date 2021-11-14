import java.util.Scanner;

public class RetanguloDemo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Retangulo retangulo = new Retangulo(0, 0);
    int op = -1;

    while (op != 0) {
      retangulo.menu();
      System.out.println("Escolha uma opção: ");
      op = input.nextInt();

      switch (op) {
        case 1:
          retangulo.criarRetangulo();
          break;
        case 2:
          System.out.println(
            "A área do retângulo equivale a: " + retangulo.areaRetangulo()
          );
          break;
        case 3:
          System.out.println(
            "O perímetro do retângulo equivale a " +
            retangulo.perimetroRetangulo()
          );
          break;
        case 0:
          System.out.println("Você saiu!");
          input.close();
          break;
      }
    }
  }
}
