package com.project.desafiodiobanco;
// A classe ContaCorrente e ContaPoupanca são subclasses de Conta.
// A classe ContaCorrente extende Conta e podemos usar o método sacar() e depositar() da interface IConta.
public class ContaCorrente extends Conta {

  protected ContaCorrente(Cliente cliente) {
        super(cliente);
    }

@Override
  public void imprimirExtrato() {
    System.out.println("=== EXTRATO DE CONTA CORRENTE ===");
    super.imprimirExtrato();
  }
}
