# Projeto: Biblioteca (Console) — Checklist MVP + Upgrades

Este arquivo é um guia passo a passo para desenvolver um sistema simples de empréstimo de livros no console usando Java.
A ideia é começar pelo **MVP (mínimo que funciona)** e depois ir evoluindo com **Upgrades**.

---

## ✅ Checklist MVP (mínimo que funciona)

### 1) Estrutura básica
- [x] Criar o projeto Java
- [x] Criar um package (ex: `biblioteca`)
- [x] Criar `Main.java` com o método `main`

### 2) Modelos simples (classes)
- [x] Criar `Autor.java`
  - [x] Atributos: `id (int)`, `nome (String)`
  - [x] Construtor
  - [x] Getters (ou deixar público por enquanto, se ainda estiver aprendendo)
- [x] Criar `Livro.java`
  - [x] Atributos: `id (int)`, `titulo (String)`, `autor (Autor)`, `disponivel (boolean)`
  - [x] Construtor (já iniciar `disponivel = true`)
  - [ ] Método opcional: `toString()` para imprimir bonito

### 3) Biblioteca (dados + ações)
- [x] Criar `Biblioteca.java`
  - [ ] Atributo: `List<Livro> livros = new ArrayList<>();`
- [ ] Criar método `carregarLivros()`
  - [ ] Adicionar 3 a 5 livros hardcoded (fixos no código)
- [ ] Criar método `listarDisponiveis()`
  - [ ] Mostrar apenas livros com `disponivel == true`
  - [ ] Exibir pelo menos: `id - titulo - autor`
- [ ] Criar método `buscarPorId(int id)`
  - [ ] Retornar o `Livro` se encontrar
  - [ ] Retornar `null` se não encontrar

### 4) Interação no console (fluxo mínimo)
- [ ] No `Main.java`, criar `Scanner`
- [ ] Criar `Biblioteca` e chamar `carregarLivros()`
- [ ] Perguntar ao usuário: **"Deseja ver os livros disponíveis? (SIM/NÃO)"**
- [ ] Se a resposta for **NÃO**
  - [ ] Mostrar mensagem de despedida
  - [ ] Encerrar o programa
- [ ] Se a resposta for **SIM**
  - [ ] Chamar `listarDisponiveis()`
  - [ ] Pedir o `id` do livro para emprestar
  - [ ] Validar:
    - [ ] Se `buscarPorId()` retornar `null`: mostrar "ID inválido" e encerrar
    - [ ] Se `livro.disponivel == false`: mostrar "Livro indisponível" e encerrar
  - [ ] Pedir o nome do cliente
  - [ ] Marcar o livro como indisponível (`disponivel = false`)
  - [ ] Mostrar mensagem de sucesso confirmando o empréstimo

✅ Quando tudo isso funcionar, o MVP está pronto.

---

## 🚀 Upgrades (melhorias depois do MVP)

### A) Registrar empréstimos de verdade
- [ ] Criar `Emprestimo.java`
  - [ ] Atributos: `id`, `livro`, `nomeCliente`
- [ ] Na `Biblioteca`, adicionar:
  - [ ] `List<Emprestimo> emprestimos = new ArrayList<>();`
- [ ] Ao emprestar um livro:
  - [ ] Criar um `Emprestimo` e adicionar na lista
  - [ ] Exibir um "comprovante" no console (cliente + livro)

### B) Trabalhar com datas
- [ ] Usar `LocalDateTime`
  - [ ] `dataEmprestimo` no empréstimo
  - [ ] (Opcional) `dataCadastro` no livro
- [ ] Mostrar data no comprovante

### C) Menu interativo em loop
- [ ] Substituir SIM/NÃO por menu:
  - [ ] 1 - Listar livros disponíveis
  - [ ] 2 - Emprestar livro por id
  - [ ] 0 - Sair
- [ ] Validar entradas inválidas sem quebrar o programa

### D) Busca e filtros
- [ ] Buscar livro por título (contém)
- [ ] Buscar livro por autor
- [ ] Filtrar por “disponível / indisponível”

---

## 🧭 Ordem recomendada
1. MVP completo
2. Emprestimo
3. Datas
4. Menu em loop
5. Busca e filtros

---

## ✅ Critério de finalização
O projeto está OK quando:
- Lista apenas livros disponíveis
- Permite emprestar por id
- Marca como indisponível
- Confirma no console e encerra (MVP)

E fica excelente quando:
- Registra empréstimos
- Mostra datas
- Possui menu e validações melhores
- Permite buscar e filtrar
