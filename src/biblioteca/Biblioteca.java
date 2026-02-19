package biblioteca;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
  private List<Livro> livros = new ArrayList<>();
  private List<Autor> autores = new ArrayList<>();
  private List<Emprestimo> emprestimos = new ArrayList<>();
  private int proximoIdEmprestimo = 1;

public void carregarLivros() {

    Autor autor1 = new Autor(1, "Machado de Assis");
    Autor autor2 = new Autor(2, "George Orwell");

    autores.add(autor1);
    autores.add(autor2);

    Livro livro1 = new Livro(autor1, 1, "O Espelho");
    Livro livro2 = new Livro(autor1, 2, "Dom Casmurro");
    Livro livro3 = new Livro(autor2, 3, "1984");
    Livro livro4 = new Livro(autor2, 4, "A Revolução dos Bichos");

    livros.add(livro1);
    livros.add(livro2);
    livros.add(livro3);
    livros.add(livro4);

}

  public void listarDisponiveis() {
    for (Livro livro:livros) {
      if (livro.isDisponivel()) {
        System.out.println( 
          livro.getId() +  " - " +
          livro.getTitulo() + " - " +
          livro.getAutor().getNome());
      }
    }
  }


  public Livro buscarLivroPorId(int id) {
    for (Livro livro : livros) {
      if (livro.getId() == id) {
        System.out.println("----------------------------");
        if(!livro.isDisponivel()){
          System.out.println("Esse livro foi emprestado, volte depois.");
        } else {
          return livro;
        }
      } 
    }
    return null;
  }

  public void emprestarLivro(int idLivro, String nomeCliente) {
    Livro livro = buscarLivroPorId(idLivro);
    int id = proximoIdEmprestimo;
    proximoIdEmprestimo++;

    if(!livro.isDisponivel()){
      System.out.println("Esse livro ja foi emprestado, volte depois");
    }
    
    if (livro == null) {
      System.out.println("Nao possuímos um livro com esse id");
    }

  } 
}