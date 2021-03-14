package exercise01;

public class ContaBancaria {
  private String nomeCliente;
  private int numConta;
  private double saldo;

  public ContaBancaria() {
  }

  public ContaBancaria(String nomeCliente, int numConta, double saldo) {
    this.nomeCliente = nomeCliente;
    this.numConta = numConta;
    this.saldo = saldo;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public int getNumConta() {
    return numConta;
  }

  public void setNumConta(int numConta) {
    this.numConta = numConta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void sacar (double value) {
    if (saldo > value) {
      saldo -= value;
      System.out.println("Saque no valor de R$" + value + " realizado com sucesso.");
    } else {
      System.out.println("Não há saldo suficiente para sacar o valor informado.");
    }
  }

  public void depositar (double value) {
    saldo += value;
    System.out.println("Depósito no valor de R$" + value + " realizado com sucesso.");
  }

  public String toString () {
    return "Nome do cliente: " + nomeCliente +
            "\nNúmero da conta: " + numConta +
            "\nSaldo: " + saldo;
  }
}
