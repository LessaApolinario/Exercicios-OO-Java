import java.util.Scanner;

public class CirculoDemo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Circulo circulo = new Circulo(0);
    int op = -1;

    while (op != 0) {
      circulo.menu();
      System.out.println("Escolha uma opção: ");
      op = input.nextInt();

      switch (op) {
        case 1:
          System.out.println("Digite o valor do raio: ");
          circulo.setRaio(input.nextDouble());
          break;
        case 2:
          System.out.println("Área do círculo == " + circulo.areaCirculo());
          break;
        case 3:
          System.out.println(
            "Perímetro do círculo == " + circulo.perimetroCirculo()
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
