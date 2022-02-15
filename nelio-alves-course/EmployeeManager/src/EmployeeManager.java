import entitties.Employee;
import entitties.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeManager {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    List<Employee> employees;

    System.out.print("Enter the number of employees: ");
    int numberOfEmployees = scanner.nextInt();
    scanner.nextLine();

    employees = new ArrayList<>(numberOfEmployees);

    for(int i = 0; i < numberOfEmployees; i++) {
      System.out.printf("\nEmployee #%d data:\n", i + 1);

      System.out.print("Outsorced? (y/n)? ");
      String isOutsourced = scanner.nextLine();

      System.out.print("Name: ");
      String name = scanner.nextLine();

      System.out.print("Hours: ");
      Integer hours = scanner.nextInt();

      System.out.print("Value per hour: ");
      Double valuePerHour = scanner.nextDouble();
      scanner.nextLine();

      if (isOutsourced.equals("y")) {
        System.out.print("Additional charge: ");
        Double additionalCharge = scanner.nextDouble();
        scanner.nextLine();

        employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
      } else {
        employees.add(new Employee(name, hours, valuePerHour));
      }
    }

    System.out.println("\nPAYMENTS:");
    for(Employee employee : employees) {
      System.out.println(employee);
    }
  }
}
