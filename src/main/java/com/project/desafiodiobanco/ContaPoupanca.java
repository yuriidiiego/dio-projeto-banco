package com.project.desafiodiobanco;
public class ContaPoupanca extends Conta {

  protected ContaPoupanca(Cliente cliente) {
    super(cliente);
  }

  @Override
  public void imprimirExtrato() {
    System.out.println("=== EXTRATO DE CONTA POUPANÇA ===");
    super.imprimirExtrato();
  }
}
