# Sistema de Biblioteca em Java (Console)

Sistema simples de gerenciamento de biblioteca desenvolvido em **Java** para estudo de **Programação Orientada a Objetos** e estruturação de um projeto de console.

## Funcionalidades

- Listar livros disponíveis
- Buscar livro por ID
- Realizar empréstimo de livro
- Registrar empréstimos
- Menu interativo no console
- Validações de:
  - ID inexistente
  - Livro indisponível

## Estrutura do Projeto

- **Main.java**  
  Responsável pela interação com o usuário (menu e leitura de dados).

- **Biblioteca.java**  
  Contém as listas e as regras do sistema:
  - Livros
  - Autores
  - Empréstimos  
  Métodos para carregar dados, listar, buscar e emprestar livros.

- **Livro.java**  
  Modelo de livro (id, título, autor, disponibilidade) e comportamentos básicos.

- **Autor.java**  
  Modelo de autor (id, nome).

- **Emprestimo.java**  
  Modelo de empréstimo (id, livro, cliente, datas de empréstimo e devolução).

## Tecnologias Utilizadas

- Java
- `ArrayList`
- `Scanner`
- `LocalDateTime`

## Como Executar

1. Clone o repositório:
```bash
git clone <url-do-repositorio>
