package com.project.desafiodiobanco;

import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Banco {

  private List<Conta> contas; // Lista de contas do banco.
  private String nome; // Nome do banco.

  public List<Cliente> getClientes() {
    return contas // Retorna uma lista de clientes.
      .stream() // Transforma a lista de contas em um fluxo.
      .map(Conta::getCliente) // Transforma o fluxo em uma lista de clientes.
      .collect(Collectors.toList()); // Transforma a lista de clientes em uma lista.
  }

  public Banco addConta(Conta conta) {
    this.contas.add(conta); // Adiciona uma conta a lista de contas.
    return this; // Retorna o banco.
  }

  public List<Conta> getContas() {
    return contas; // Retorna a lista de contas.
  }

  public String getNome() {
    return nome; // Retorna o nome do banco.
  }
  
}
