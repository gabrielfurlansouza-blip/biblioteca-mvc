# Sistema de Controle de Biblioteca (MVC)

## Descrição
Sistema de biblioteca utilizando padrão MVC.

## Tabelas

### Livro
- titulo
- autor
- quantidadeDisponivel

### Aluno
- nome

### Emprestimo
- aluno
- livro
- dataEmprestimo
- dataDevolucao

## Regras de Negócio

- Não permitir título vazio
- Não permitir quantidade negativa
- Não permitir empréstimo sem estoque
- Registrar devolução
- Consultar empréstimos em aberto

## Arquitetura MVC

### Model
- Livro
- Aluno
- Emprestimo

### Controller
- EmprestimoController

### View
- EmprestimoView

## Execução

Executar Main
