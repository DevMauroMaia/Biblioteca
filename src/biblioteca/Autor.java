package biblioteca;
public class Autor {

  private int id;
  private String nome;

  public Autor(int id, String nome){
    this.id = id;
    this.nome = nome;
  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  @Override 
  public String toString() {
    return id + " - " + nome;
  }

}