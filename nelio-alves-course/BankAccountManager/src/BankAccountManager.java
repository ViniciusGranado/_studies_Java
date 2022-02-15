import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class BankAccountManager {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter account data:");

    System.out.print("Number: ");
    Integer number = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Holder: ");
    String holder = scanner.nextLine();

    System.out.print("Initial balance: ");
    Double initialBalance = scanner.nextDouble();

    System.out.print("Withdraw limit: ");
    Double withdrawLimit = scanner.nextDouble();

    Account account = new Account(number, holder, initialBalance, withdrawLimit);

    System.out.print("\nEnter amount for withdraw: ");
    Double withdrawAmount = scanner.nextDouble();

    try {
      account.withdraw(withdrawAmount);

      System.out.printf("New balance: $%.2f", account.getBalance());
    } catch (Exception e) {
      System.out.println("Withdraw error: " + e.getMessage());
    }

  }
}
