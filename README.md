# FinTrack

Sistema de controle financeiro desenvolvido em Java com foco na aplicação dos conceitos fundamentais de Programação Orientada a Objetos (POO).

##Sobre o Projeto

O FinTrack foi criado como projeto de estudo para praticar conceitos essenciais da linguagem Java e servir como base para projetos mais avançados no futuro.

A aplicação permite o gerenciamento de receitas e despesas através de uma interface de linha de comando (CLI), possibilitando o acompanhamento do saldo e a geração de resumos financeiros.

##Funcionalidades

* Adicionar receitas
* Adicionar despesas
* Listar todas as transações
* Listar transações por tipo
* Buscar transação por ID
* Remover transação
* Calcular saldo atual
* Gerar resumo financeiro

##Conceitos Aplicados

### Programação Orientada a Objetos

* Encapsulamento
* Herança
* Polimorfismo
* Abstração

### Recursos da Linguagem

* Classes abstratas
* Enum
* Collections (`ArrayList`)
* Tratamento de exceções
* Exceções personalizadas

### Arquitetura

O projeto foi organizado em camadas simples para melhor separação de responsabilidades:

```text
controller -> validações e fluxo da aplicação
service    -> regras de negócio
model      -> entidades do sistema
exceptions -> exceções personalizadas
```

## Estrutura do Projeto

```text
src/
├── fintrack
│
├── controller
│   └── TransacaoController.java
│
├── service
│   └── FinTrackService.java
│
├── model
│   ├── Transacao.java
│   ├── Receita.java
│   ├── Despesa.java
│   └── TipoTransacao.java
│
├── exceptions
│   ├── ValorInvalidoException.java
│   ├── DescricaoInvalidaException.java
│   └── TransacaoNaoEncontradaException.java
│
└── Main.java
```

## Tecnologias Utilizadas

* Java 17
* Eclipse IDE

## Objetivo

Este projeto representa uma etapa inicial no aprendizado de Java.

O objetivo principal é consolidar conhecimentos em Programação Orientada a Objetos antes de avançar para temas mais complexos como:

* Persistência de dados
* Banco de dados
* APIs REST
* Testes automatizados
* Interface gráfica
* Frameworks Java

## Status do Projeto

Versão funcional concluída

Melhorias futuras poderão ser implementadas conforme a evolução dos estudos.

