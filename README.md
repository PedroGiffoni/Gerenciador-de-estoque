# Sistema de Gerenciamento de Estoque (FIFO com Controle de Validade)

## Descrição

Este projeto foi desenvolvido como atividade acadêmica da disciplina de Estrutura de Dados. O objetivo é implementar um sistema de gerenciamento de estoque utilizando o conceito de FIFO (First In, First Out) aliado ao controle de data de vencimento dos produtos.

O sistema organiza automaticamente os produtos de forma que os itens com menor data de validade sejam removidos primeiro, simulando um cenário real de controle de estoque.

---

## Objetivos

* Aplicar conceitos de estruturas de dados
* Implementar uma fila com ordenação por prioridade (data de vencimento)
* Simular um sistema de controle de estoque
* Trabalhar com manipulação de datas em Java

---

## Conceitos Utilizados

* Fila (Queue)
* FIFO (First In, First Out)
* Ordenação por prioridade
* Programação orientada a objetos (POO)
* Manipulação de datas com LocalDate
* Estruturas dinâmicas (ArrayList)

---

## Estrutura do Projeto

O sistema é composto por três classes principais:

### Produto

Responsável por representar um item do estoque.

Atributos:

* nome
* codigo
* quantidade
* dataVencimento

---

### FilaEstoque

Responsável por gerenciar os produtos no estoque.

Funções principais:

* adicionarProduto(): insere produtos mantendo a ordem por vencimento
* listarProdutos(): exibe os produtos ordenados
* removerProduto(): remove o primeiro produto (FIFO)
* removerVencidos(): remove produtos já vencidos
* produtosProximosDoVencimento(): identifica produtos próximos do vencimento

---

### Main

Responsável por executar o sistema e simular operações de estoque.

---

## Funcionalidades

* Cadastro de produtos com nome, código, quantidade e data de vencimento
* Ordenação automática por data de validade
* Listagem organizada de produtos
* Remoção de produtos por venda (FIFO)
* Remoção de produtos vencidos
* Identificação de produtos próximos do vencimento

---

## Como Executar

1. Abra o projeto no IntelliJ IDEA
2. Compile o projeto
3. Execute a classe Main
4. Observe as operações sendo realizadas no console

---

## Exemplo de Uso

O sistema permite:

* Inserir produtos com diferentes datas de vencimento
* Visualizar os produtos ordenados automaticamente
* Remover o produto mais prioritário (mais próximo do vencimento)
* Limpar produtos vencidos do estoque

---

## Possíveis Melhorias

* Implementação de interface com entrada de dados via usuário (Scanner)
* Persistência de dados em arquivo ou banco de dados
* Interface gráfica
* Relatórios de estoque
* Controle de vendas parciais

---

## Autor

Projeto desenvolvido como atividade acadêmica na área de Estrutura de Dados.

---

## Considerações Finais

Este projeto demonstra na prática como estruturas de dados, especialmente filas, podem ser utilizadas para resolver problemas reais, como o gerenciamento eficiente de estoque com controle de validade.
