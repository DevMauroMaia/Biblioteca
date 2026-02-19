package biblioteca;
import java.util.Scanner;


  public class Main{
    public static void main(String[] args) {
      System.out.println("\n-- -- -- --");
      Biblioteca biblioteca = new Biblioteca();
      biblioteca.carregarLivros();
      Scanner scanner = new Scanner(System.in);
      while(true) {
        System.out.println("\n Digite a opção que deseja");
        Menu.mostrar();
        int opcao = scanner.nextInt();
        switch(opcao) {
          case 1:
            biblioteca.listarDisponiveis();

          break;
          
          case 2: 
            System.out.println("----------------------------");
            System.out.println("----------------------------");
            biblioteca.listarDisponiveis();
            System.out.println("Qual é o id?");
            int buscarId = scanner.nextInt();
            Livro idLivro = biblioteca.buscarLivroPorId(buscarId);
            if (idLivro == null) {
              System.out.println("Nao foi possível encontrar um livro com esse id.");
            } else {
              System.out.println(idLivro);
            }
          break;
            
          case 3:
            System.out.println("Obrigado por visitar nossa biblioteca!!!");
            scanner.close();
            return;
        
          default:
            System.out.println("Opção invalida");
            break;
        }
      }
    }
    class Menu {
      public static void mostrar() {
        System.out.println("Opções");
        System.out.println("1 - Listar disponíveis");
        System.out.println("2 - Buscar livro por id");
        System.out.println("3 - Sair do programa.");
      }
    }

  }