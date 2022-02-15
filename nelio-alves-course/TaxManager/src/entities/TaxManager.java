package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TaxManager {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    List<Payer> taxPayers;

    System.out.print("Enter the number if tax payers: ");
    int numberOfTaxPayers = scanner.nextInt();
    scanner.nextLine();

    taxPayers = new ArrayList<>(numberOfTaxPayers);

    for(int i = 0; i < numberOfTaxPayers; i++) {
      System.out.printf("\nTax payer #%d data:\n", i + 1);
      System.out.print("Individual or company (i/c)? ");
      char payer = scanner.next().charAt(0);
      scanner.nextLine();

      System.out.print("Name: ");
      String name = scanner.nextLine();

      System.out.print("Anual income: ");
      Double anualIncome = scanner.nextDouble();

      if (payer == 'i') {
        System.out.print("Health expendiures: ");
        Double healtExpenditures = scanner.nextDouble();

        taxPayers.add(new IndividualPayer(name, anualIncome, healtExpenditures));
      } else {
        System.out.print("Number of employees: ");
        Integer numberOfEmployees = scanner.nextInt();

        taxPayers.add(new CompanyPayer(name, anualIncome, numberOfEmployees));
      }
    }

    Double totalTaxPayed = 0d;

    System.out.println("\nTAXES PAID:");
    for(Payer taxPayer : taxPayers) {
      System.out.println(taxPayer);
      totalTaxPayed += taxPayer.total();
    }

    System.out.printf("\nTOTAL TAXES: $ %.2f", totalTaxPayed);
  }
}
