import java.util.ArrayList;
import java.util.Scanner;

public class Livro {

  private String autor;
  private String editora;
  private String ISBN; // length === 10
  private String titulo;
  private int anoEdicao;

  public Livro(
    String autor,
    String editora,
    String ISBN,
    String titulo,
    int anoEdicao
  ) {
    this.autor = autor;
    this.editora = editora;

    if (ISBN.length() == 10) {
      this.ISBN = ISBN;
    }

    this.titulo = titulo;

    if (anoEdicao > 0) {
      this.anoEdicao = anoEdicao;
    }
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAutor() {
    return autor;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public String getEditora() {
    return editora;
  }

  public void setISBN(String ISBN) {
    if (ISBN.length() == 10) {
      this.ISBN = ISBN;
    }
  }

  public String getISBN() {
    return ISBN;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAnoEdicao(int anoEdicao) {
    if (anoEdicao > 0) {
      this.anoEdicao = anoEdicao;
    }
  }

  public int getAnoEdicao() {
    return anoEdicao;
  }

  public void cadastrarLivro(ArrayList<Livro> livros) {
    Scanner input = new Scanner(System.in);

    System.out.println("Qual é o nome do autor? ");
    setAutor(input.nextLine());

    System.out.println("Qual é o nome da editora? ");
    setEditora(input.nextLine());

    System.out.println("Qual é o ISBN? ");
    setISBN(input.nextLine());

    System.out.println("Qual é o nome do título? ");
    setTitulo(input.nextLine());

    System.out.println("Qual é o ano de edição? ");
    setAnoEdicao(input.nextInt());

    Livro l = new Livro(
      getAutor(),
      getEditora(),
      getISBN(),
      getTitulo(),
      getAnoEdicao()
    );

    livros.add(l);

    System.out.println("Livro cadastrado com sucesso!");
  }

  public String buscarLivro(ArrayList<Livro> livros, String titulo) {
    for (int i = 0; i < livros.size(); i++) {
      if (titulo.equals(livros.get(i).getAutor())) {
        String livroEncontrado = livros.get(i).getTitulo();
        return "O livro " + livroEncontrado + " foi encontrado.";
      }
    }

    return "O livro " + titulo + " não existe.";
  }

  public static void menu() {
    System.out.println("\n--------------------");
    System.out.println("1. Cadastrar livro");
    System.out.println("2. Buscar livro por título");
    System.out.println(
      "3. Listar livros por autor (mostrar os livros de um autor)"
    );
    System.out.println("4. Listar todos os livros disponíveis");
    System.out.println("0. Sair");
    System.out.println("--------------------\n");
  }
}
