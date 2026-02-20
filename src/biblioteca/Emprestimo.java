package biblioteca;

import java.time.LocalDateTime;

public class Emprestimo {
  private int idEmprestimo;
  private Livro livro;
  private String nomeCliente;
  private LocalDateTime dataEmprestimo;
  private LocalDateTime dataDevolucao;

  public Emprestimo(int idEmprestimo, Livro livro, String nomeCliente) {
    this.idEmprestimo = idEmprestimo;
    this.livro = livro;
    this.nomeCliente = nomeCliente;
    this.dataEmprestimo = LocalDateTime.now();
    this.dataDevolucao = null;
  }

  public int getIdEmprestimo() {
    return idEmprestimo;
  }

  public Livro getLivro() {
    return livro;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public LocalDateTime getDataEmprestimo() {
    return dataEmprestimo;
  }

  public LocalDateTime getDataDevolucao() {
    return dataDevolucao;
  }

  public boolean isDevolvido() {
    return dataDevolucao != null;
  }

  public void registrarDevolucao() {
    this.dataDevolucao = LocalDateTime.now();
  }

  @Override
  public String toString() {
    String status = isDevolvido() ? "DEVOLVIDO" : "EM ABERTO";
    return "Empréstimo #" + idEmprestimo +
      " | Livro: " + livro.getTitulo() +
      " | Cliente: " + nomeCliente +
      " | Status: " + status;
  }
}