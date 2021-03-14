package exercise01;

public class ContaPoupanca extends ContaBancaria {
  private int diaRendimento;

  public ContaPoupanca (int diaRendimento) {
    this.diaRendimento = diaRendimento;
  }

  public ContaPoupanca (String nomeCliente, int numConta, double saldo, int diaRendimento) {
    super(nomeCliente, numConta, saldo);
    this.diaRendimento = diaRendimento;
  }

  public int getDiaRendimento () {
    return diaRendimento;
  }

  public void setDiaRendimento (int diaRendimento) {
    this.diaRendimento = diaRendimento;
  }

  public void calcularNovoSaldo (double taxa) {
    double novoSaldo = super.getSaldo() + (super.getSaldo() * taxa / 100);

    System.out.println("Novo saldo: R$" + novoSaldo);

    super.setSaldo(novoSaldo);
  }

  public String toString () {
    return super.toString() + ("\nDia de rendimento: " + diaRendimento);
  }
}
