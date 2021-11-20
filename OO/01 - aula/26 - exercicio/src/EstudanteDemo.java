import java.util.Scanner;

public class EstudanteDemo {

  public static void main(String[] args) {
    Estudante estudante = new Estudante("", 1, "", 0, 0);
    Estudante[] estudantes = new Estudante[2];
    Scanner input = new Scanner(System.in);

    // Inicializando o array de objetos pelo constructor
    estudantes[0] = new Estudante("", 1, "", 0, 0);
    estudantes[1] = new Estudante("", 1, "", 0, 0);
    int op = -1;
    int i = 0;

    do {
      estudante.menu();
      op = input.nextInt();
      limparBuffer(input);

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
          i++;
          break;
        case 2:
          System.out.println("Digite o nome do estudante: ");
          String nomeDoEstudante = input.nextLine();
          estudante.consultarMediaEstudante(estudantes, nomeDoEstudante);
          break;
        case 3:
          System.out.println("Digite o nome do estudante: ");
          nomeDoEstudante = input.nextLine();
          estudante.consutraMatriculaEstudante(estudantes, nomeDoEstudante);
          break;
        case 4:
          System.out.println("Digite o nome do estudante: ");
          nomeDoEstudante = input.nextLine();
          estudante.consultarEnderecoEstudante(estudantes, nomeDoEstudante);
          break;
        case 5:
          System.out.println(
            "A média da turma é == " + estudante.mediaDaTurma(estudantes, i)
          );
          break;
        case 6:
          estudante.reprovados(estudantes);
          break;
        case 0:
          System.out.println("Você saiu!");
          break;
      }
    } while (op != 0);
  }

  public static void limparBuffer(Scanner sc) {
    if (sc.hasNextLine()) {
      sc.nextLine();
    }
  }
}
