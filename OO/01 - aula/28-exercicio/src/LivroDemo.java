public class LivroDemo {

  public static void main(String[] args) {
    Livro livro = new Livro("Augusto Santos", "A", "12345678-9", "Legal", 12);

    System.out.println(
      livro.getAutor() +
      livro.getEditora() +
      livro.getISBN() +
      livro.getTitulo() +
      livro.getAnoEdicao()
    );
  }
}
