package com.project.desafiodiobanco;
public interface IConta {
  // Interface é um contrato que define um conjunto de métodos.
  void sacar(double valor);

  void depositar(double valor);

  void transferir(double valor, Conta contaDestino);

  void imprimirExtrato();
}
