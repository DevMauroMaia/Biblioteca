package biblioteca;

import java.time.LocalDateTime;

public class Emprestimo {
  private Livro livro;
  private String nomeCliente;
  public int idEmprestimo;
  private LocalDateTime dataEmprestimo;
  private LocalDateTime dataDevolucao;
  
  public Emprestimo(Livro livro, String nomeCliente, int idEmprestimo) {
    this.livro = livro;
    this.nomeCliente = nomeCliente;
    this.idEmprestimo = idEmprestimo;
  }
}
