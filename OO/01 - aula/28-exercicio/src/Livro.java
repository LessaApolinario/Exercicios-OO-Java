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
    return this.autor;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public String getEditora() {
    return this.editora;
  }

  public void setISBN(String ISBN) {
    if (ISBN.length() == 10) {
      this.ISBN = ISBN;
    }
  }

  public String getISBN() {
    return this.ISBN;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setAnoEdicao(int anoEdicao) {
    if (anoEdicao > 0) {
      this.anoEdicao = anoEdicao;
    }
  }

  public int getAnoEdicao() {
    return this.anoEdicao;
  }
}
