import entities.Department;
import entities.HourContract;
import entities.Worker;
import entitities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class WorkerContracts {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Calendar calendar = Calendar.getInstance();

    System.out.println("");
    System.out.print("");

    System.out.print("Enter department's name: ");
    String dptmInpt = scanner.nextLine();

    System.out.println("\nEnter worker data:");

    System.out.print("Name: ");
    String name = scanner.nextLine();

    System.out.print("Level: ");
    String level = scanner.next();

    System.out.print("Base salary: ");
    Double baseSlr = scanner.nextDouble();

    System.out.print("How many contracts to this worker? ");
    int numberOfContracts = scanner.nextInt();

    Department department = new Department(dptmInpt);
    Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSlr, numberOfContracts);

    for (int i = 0; i < numberOfContracts; i++) {
      System.out.printf("\nEnter contract #%d data:", i + 1);

      System.out.print("Date (DD/MM/YYYY): ");
      String dateString = scanner.next();
      Date date = dateFormat.parse(dateString);


      System.out.print("Value per hour: ");
      Double valuePerHour = scanner.nextDouble();

      System.out.print("Duration (hours): ");
      Integer duration = scanner.nextInt();

      System.out.println(date);
      worker.addContract(new HourContract(date, valuePerHour, duration));
    }

    System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
    String incomeDateString = scanner.next();
    SimpleDateFormat incomeDateFormat = new SimpleDateFormat("MM/yyyy");
    Date incomeDate = incomeDateFormat.parse(incomeDateString);
    calendar.setTime(incomeDate);

    Double income = worker.income(calendar.get(Calendar.MONTH), calendar.get(Calendar.YEAR));

    System.out.printf("\nName: %s", worker.getName());
    System.out.printf("\nDepartment: %s", department.getName());
    System.out.printf("\nIncome for %s/%s: %.2f", calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR), income);

    scanner.close();
  }
}
