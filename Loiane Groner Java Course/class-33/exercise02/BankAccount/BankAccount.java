package exercise02.BankAccount;

public class BankAccount {
  private String accountNumber;
  private String agencyNumber;
  private double accountBalance;
  private boolean isSpecial;
  private double accountLimit;

  public BankAccount () {

  }

  public void setAccountNumber (String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountNumber () {
    return this.accountNumber;
  }

  public void setAgencyNumber (String agencyNumber) {
    this.agencyNumber = agencyNumber;
  }

  public String getAgencyNumber () {
    return this.agencyNumber;
  } 

  public void setAccountBalance (double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public double getAccountBalance () {
    return this.accountBalance;
  }

  public void setIsSpecial (boolean isSpecial) {
    this.isSpecial = isSpecial;
  }

  public boolean isIsSpecial () {
    return this.isSpecial;
  }

  public void setAccountLimit (double accountLimit) {
    this.accountLimit = accountLimit;
  }

  public double getAccountLimit () {
    return this.accountLimit;
  }

  public void withdraw (double value) {
    if (value > this.accountBalance) {
      System.out.println("Valor superior ao saldo disponível.");
    } else {
      this.setAccountBalance(this.accountBalance - value);
      System.out.println("Saque no valor de R$" + value + " realizado com sucesso.");
    };
  }
  
  public void deposit (double value) {
    this.setAccountBalance(this.accountBalance + value);
    System.out.println("Depósito no valor de R$" + value + " realizado com sucesso.");
  }

  public void checkBalance () {
    System.out.println("Saldo atual: R$" + this.getAccountBalance());
  }

  public void checkIfIsSpecial () {
    if (this.isIsSpecial()) {
      System.out.println("O usuário possui cheque especial no valor de R$" + this.getAccountLimit());
    } else {
      System.out.println("O usuário não possui cheque especial.");
    }
  }
}
