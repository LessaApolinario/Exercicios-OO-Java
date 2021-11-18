import java.util.Scanner;

public class EstudanteDemo {

  public static void main(String[] args) {
    Estudante estudante = new Estudante("", 0, "", 0, 0);
    Estudante[] estudantes = new Estudante[2];

    // Inicializando o array de objetos pelo constructor
    estudantes[0] = new Estudante("", 2, "", 7, 8);
    estudantes[1] = new Estudante("", 3, "", 8, 9);
  }

  public static void limparBuffer(Scanner sc) {
    if (sc.hasNextLine()) {
      sc.nextLine();
    }
  }
}
