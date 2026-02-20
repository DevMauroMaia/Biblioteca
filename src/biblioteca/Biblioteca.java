package biblioteca;

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
    for (Livro livro : livros) {
      if (livro.isDisponivel()) {
        System.out.println(
          livro.getId() + " - " +
          livro.getTitulo() + " - " +
          livro.getAutor().getNome()
        );
      }
    }
  }

  public Livro buscarLivroPorId(int id) {
    for (Livro livro : livros) {
      if (livro.getId() == id) {
        return livro;
      }
    }
    return null;
  }

  public Emprestimo emprestarLivro(int idLivro, String nomeCliente) {
    Livro livro = buscarLivroPorId(idLivro);

    if (livro == null) {
      System.out.println("Esse livro não foi encontrado.");
      return null;
    }

    if (!livro.isDisponivel()) {
      System.out.println("Esse livro já foi emprestado, volte depois.");
      return null;
    }

    int idEmprestimo = proximoIdEmprestimo;
    proximoIdEmprestimo++;

    livro.marcarIndisponivel();

    Emprestimo novoEmprestimo = new Emprestimo(idEmprestimo, livro, nomeCliente);
    emprestimos.add(novoEmprestimo);

    return novoEmprestimo;
  }


  public Emprestimo devolverLivro(int idLivro, String nomeCliente) {
    Livro livro = buscarLivroPorId(idLivro);

    if (livro == null) {
      System.out.println("Esse livro nao existe.");
      return null;
    }

    if (livro.isDisponivel()) {
      System.out.println("Esse livro nao esta emprestado.");
      return null;
    }

    for (Emprestimo e : emprestimos) {
      boolean mesmoLivro = e.getLivro().getId() == idLivro;
      boolean emAberto = !e.isDevolvido();
      boolean mesmoCliente = e.getNomeCliente().equalsIgnoreCase(nomeCliente.trim());

      if (mesmoLivro && emAberto && mesmoCliente) {
       e.registrarDevolucao();
       livro.marcarDisponivel();
        return e;
      }
   }
    System.out.println("Nao existe emprestimo em aberto para esse livro nesse nome.");
    return null;
  }


  public void listarEmprestimos() {
    if (emprestimos.isEmpty()) {
      System.out.println("Nenhum empréstimo registrado.");
      return;
    }

    for (Emprestimo e : emprestimos) {
      System.out.println(e);
    }
  }
}
