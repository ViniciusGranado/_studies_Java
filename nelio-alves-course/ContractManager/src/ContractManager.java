import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ContractManager {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.println("Enter contract data");

    System.out.print("Number: ");
    String number = scanner.nextLine();

    System.out.print("Date (dd/mm/yyyy): ");
    Date date = sdf.parse(scanner.nextLine());

    System.out.print("Contract value: ");
    double value = scanner.nextDouble();

    System.out.print("Enter number of installments: ");
    int installmentsNumber = scanner.nextInt();

    Contract contract = new Contract(number, date, value);

    ContractService cs = new ContractService(new PaypalService());

    cs.processContract(contract, installmentsNumber);

    System.out.println("\nInstallments:");
    System.out.println(contract.toString());
  }
}
