package com.project.desafiodiobanco;

import lombok.Getter;

// A classe Conta é abstrata, ou seja, não pode ser instanciada.
// A classe ContaCorrente e ContaPoupanca são subclasses de Conta.
// A classe Conta implementa a interface IConta. Sendo assim, podemos usar o método sacar() e depositar() da interface IConta.

@Getter // Deixamos apenas os getters para que o usuário não possa alterar os valores usando o setters.
public abstract class Conta implements IConta {

  private static final int AGENCIA_PADRAO = 1; // Número da agência padrão.
  private static int contaSequencial = 1; // Número sequencial da conta.

  protected int agencia; // Número da agência.
  protected int numero; // Número da conta.
  protected double saldo; // Saldo da conta.
  protected Cliente cliente; // Cliente da conta.

  protected Conta(Cliente cliente) { // Construtor protected para que não seja possível instanciar a classe Conta.
    this.agencia = Conta.AGENCIA_PADRAO; // Atribui o número da agência padrão.
    this.numero = Conta.contaSequencial++; // Atribui o número sequencial da conta.(Número sequencial incrementado.)
    this.cliente = cliente; // Atribui o cliente da conta.
  }

  @Override
  public void sacar(double valor) {
    saldo -= valor; // Subtrai o valor do saldo.
  }

  @Override
  public void depositar(double valor) {
    saldo += valor; // Soma o valor ao saldo.
  }

  @Override
  public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor); // Subtrai o valor desta conta.(this.saldo -= valor)
    contaDestino.depositar(valor); //
  }

  public void imprimirExtrato() {
    System.out.println(String.format("Agência: %d", this.agencia));
    System.out.println(String.format("Conta: %d", this.numero));
    System.out.println(String.format("Saldo: %.2f", this.saldo));
  }
}
