package Exercise02;

public class BankAccount {
  String accountNumber;
  String agencyNumber;
  double accountBalance;
  boolean isSpecial;
  double accountLimit;

  void withdraw (double value) {
    if (value > accountBalance) {
      System.out.println("Valor superior ao saldo disponível.");
    } else {
      accountBalance = accountBalance -= value;
      System.out.println("Saque no valor de R$" + value + " realizado com sucesso.");
    };
  }
  
  void deposit (double value) {
    accountBalance += value;
    System.out.println("Depósito no valor de R$" + value + " realizado com sucesso.");
  }

  void checkBalance () {
    System.out.println("Saldo atual: R$" + accountBalance);
  }

  void checkIfIsSpecial () {
    if (isSpecial) {
      System.out.println("O usuário possui cheque especial no valor de R$" + accountLimit);
    } else {
      System.out.println("O usuário não possui cheque especial.");
    }
  }
}
