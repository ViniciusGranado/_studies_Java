package exercise01;

public class ContaEspecial extends  ContaBancaria{
  private double limite;

  public ContaEspecial(double limite) {
    this.limite = limite;
  }

  public ContaEspecial(String nomeCliente, int numConta, double saldo, double limite) {
    super(nomeCliente, numConta, saldo);
    this.limite = limite;
  }

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

  public void sacar (double value) {
    if (super.getSaldo() > value) {
      System.out.println("Saque no valor de R$" + value + " realizado com sucesso.");
      super.setSaldo(super.getSaldo() - value);
    } else if ((super.getSaldo() + this.limite) > value) {
      double removidoLimiteEspecial = value - super.getSaldo();
      super.setSaldo(0);
      this.limite -= removidoLimiteEspecial;

      System.out.println("Saque no valor de R$" + value + " realizado com sucesso.");
      System.out.println("Foram retirados R$" + removidoLimiteEspecial + " do limite especial.");
    } else {
      System.out.println("Não há saldo suficiente para sacar o valor informado.");
    }
  }

  public String toString () {
    return super.toString() + ("\nLimite especial: " + limite);
  }
}
