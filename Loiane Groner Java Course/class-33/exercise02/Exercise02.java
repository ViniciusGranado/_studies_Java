package exercise02;

import exercise02.BankAccount.BankAccount;

public class Exercise02 {
  public static void main (String[] args) {
    BankAccount account = new BankAccount();

    account.setAccountNumber("65748");
    account.setAgencyNumber("4322");
    account.setAccountBalance(1324.60);
    account.setIsSpecial(true);
    account.setAccountLimit(5000);

    System.out.println(account.getAccountNumber());
    System.out.println(account.getAgencyNumber());
    System.out.println(account.getAccountBalance());
    System.out.println(account.isIsSpecial());
    System.out.println(account.getAccountLimit());
    
    account.withdraw(500);
    account.deposit(140);
    account.checkBalance();
    account.checkIfIsSpecial();
  }
}