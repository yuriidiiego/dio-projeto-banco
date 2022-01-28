package com.project.desafiodiobanco;
public class App {

  public static void main(String[] args) {
    Cliente yuri = new Cliente(); // Cria um cliente. 
    yuri.setNome("Yuri Diego Oliveira do Nascimento"); // Seta o nome do cliente.

    Conta cc = new ContaCorrente(yuri); // Cria uma conta corrente para o cliente(yuri).
    Conta cp = new ContaPoupanca(yuri); // Cria uma conta poupança para o cliente(yuri).

    cc.depositar(1000); // Deposita 1000 na conta corrente.
    cc.transferir(100, cp); // Transfere 100 da conta corrente para a conta poupança.

    cc.imprimirExtrato(); // Imprime o extrato da conta corrente.
    cp.imprimirExtrato(); // Imprime o extrato da conta poupança.
  }
}
