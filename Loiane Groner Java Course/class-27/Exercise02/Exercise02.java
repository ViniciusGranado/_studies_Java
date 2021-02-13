package Exercise02;

public class Exercise02 {
  public static void main (String[] args) {
    BankAccount account = new BankAccount();

    account.accountNumber = "65748";
    account.agencyNumber = "4322";
    account.accountBalance = 1324.60;
    account.isSpecial = true;
    account.accountLimit = 5000;

    account.withdraw(500);
    account.deposit(140);
    account.checkBalance();
    account.checkIfIsSpecial();
  }
}