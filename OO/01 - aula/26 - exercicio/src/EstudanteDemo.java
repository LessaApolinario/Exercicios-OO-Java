import java.util.Scanner;

public class EstudanteDemo {

  public static void main(String[] args) {
    Estudante estudante = new Estudante("", 0, "", 0, 0);
    Estudante[] estudantes = new Estudante[2];
    Scanner input = new Scanner(System.in);

    // Inicializando o array de objetos pelo constructor
    estudantes[0] = new Estudante("", 2, "", 7, 8);
    estudantes[1] = new Estudante("", 3, "", 8, 9);
    int op = -1;

    for (int i = 0; op != 0; i++) {
      estudante.menu();
      op = input.nextInt();

      switch (op) {
        case 1:
          try {
            estudante.cadastrarEstudante();
            estudantes[i] =
              new Estudante(
                estudante.getNome(),
                estudante.getNumMatricula(),
                estudante.getEndereco(),
                estudante.getNota1(),
                estudante.getNota2()
              );
          } catch (ArrayIndexOutOfBoundsException exception) {
            Estudante[] novoEstudanteArray = new Estudante[estudantes.length +
            1];

            System.arraycopy(
              estudantes,
              0,
              novoEstudanteArray,
              0,
              estudantes.length
            );

            estudantes = novoEstudanteArray;
            estudantes[i] =
              new Estudante(
                estudante.getNome(),
                estudante.getNumMatricula(),
                estudante.getEndereco(),
                estudante.getNota1(),
                estudante.getNota2()
              );
          }

          System.out.println("Estudante cadastrado com sucesso!");

          break;
        case 2:
          System.out.println("Digite o nome do estudante: ");
          String nomeDoEstudante = input.nextLine();
          estudante.consultarMediaEstudante(estudantes, nomeDoEstudante);
          break;
        case 3:
          // Continuar
          break;
      }
    }
  }

  public static void limparBuffer(Scanner sc) {
    if (sc.hasNextLine()) {
      sc.nextLine();
    }
  }
}
