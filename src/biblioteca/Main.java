package biblioteca;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    biblioteca.carregarLivros();

    Scanner scanner = new Scanner(System.in);

    while (true) {
      Menu.mostrar();
      System.out.print("Escolha uma opção: ");

      int opcao = scanner.nextInt();
      scanner.nextLine(); 

      switch (opcao) {
        case 1:
          System.out.println("\n--- Livros disponíveis ---");
          biblioteca.listarDisponiveis();
          break;

        case 2:
          System.out.println("\n--- Buscar livro por ID ---");
          biblioteca.listarDisponiveis();
          System.out.print("Digite o ID do livro: ");
          int buscarId = scanner.nextInt();
          scanner.nextLine(); 

          Livro livro = biblioteca.buscarLivroPorId(buscarId);
          if (livro == null) {
            System.out.println("Não foi possível encontrar um livro com esse ID.");
          } else {
            System.out.println("Encontrado: " + livro);
          }
          break;

        case 3:
          System.out.println("\n--- Empréstimo ---");
          biblioteca.listarDisponiveis();
          System.out.print("Digite o ID do livro para empréstimo: ");
          int idLivro = scanner.nextInt();
          scanner.nextLine(); 

          System.out.print("Digite seu nome: ");
          String nomeCliente = scanner.nextLine();

          Emprestimo emprestimo = biblioteca.emprestarLivro(idLivro, nomeCliente);
          if (emprestimo != null) {
            System.out.println("Empréstimo #" + emprestimo.getIdEmprestimo()
                + " realizado para " + emprestimo.getNomeCliente() + ".");
          }
          break;

        case 4:
          System.out.println("Obrigado por visitar nossa biblioteca!");
          scanner.close();
          return;

        default:
          System.out.println("Opção inválida.");
          break;
      }
    }
  }

  static class Menu {
    public static void mostrar() {
      System.out.println("\n=== MENU BIBLIOTECA ===");
      System.out.println("1 - Listar disponíveis");
      System.out.println("2 - Buscar livro por ID");
      System.out.println("3 - Fazer empréstimo");
      System.out.println("4 - Sair");
    }
  }
}
