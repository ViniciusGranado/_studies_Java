import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ListExercise {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of employees: ");
    int numberOfEmployees = scanner.nextInt();

    List<Employee> employees = new ArrayList<>();

    for (int i = 0; i < numberOfEmployees; i++) {
      System.out.println("\nEmployee #" + (i + 1) + ":");
      System.out.print("Id: ");
      Integer id = scanner.nextInt();

      System.out.print("Name: ");
      String name = scanner.next();

      System.out.print("Salary: ");
      Double salary = scanner.nextDouble();

      employees.add(new Employee(id, name, salary));
    }

    System.out.print("Enter the employee ID that will have salary readjustment: ");
    Integer wantedId = scanner.nextInt();

    Employee employeeWithReadjustment = employees.stream()
      .filter(employee -> employee.getId()
      .equals(wantedId))
      .findFirst()
      .orElse(null);

    if (employeeWithReadjustment != null) {
      System.out.print("Enter the percentage: ");
      double percentage = scanner.nextDouble();

      employeeWithReadjustment.adjustSalary(percentage);
    } else {
      System.out.println("This ID does not exist!");
    }

    System.out.println("\nList of employees: ");
    for (Employee employee : employees) {
      System.out.println(employee);
    }

    scanner.close();
  }
}
