package biblioteca;

public class Livro {
  private Autor autor;
  private int id;
  private String titulo;
  private boolean disponivel;

  public  Livro(Autor autor, int id, String titulo) {
    this.autor = autor;
    this.id = id;
    this.titulo = titulo;
    this.disponivel = true;

  }

  public void marcarIndisponivel() {
    this.disponivel = false;
  }

  public Autor getAutor() {
    return autor;
  }
  public int getId() {
    return id;
  }
  public String getTitulo() {
    return titulo;
  }
  public boolean isDisponivel() {
    return disponivel;
  }

}