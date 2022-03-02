import model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeSalary {
  public static void main(String[] args) {
    URL url = EmployeeSalary.class.getResource("in.csv");
    Scanner scanner = new Scanner(System.in);
    List<Employee> employees = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(url.getPath()))) {
      String line = br.readLine();

      if (line == null) {
        throw new FileNotFoundException("Error: Source file is empty");
      }

      String[] employeeFields;

      while (line != null) {
        employeeFields = line.split(",");

        String employeeName = employeeFields[0];
        String employeeEmail = employeeFields[1];
        Double employeeSalary = Double.parseDouble(employeeFields[2]);

        employees.add(new Employee(employeeName, employeeEmail, employeeSalary));

        line = br.readLine();
      }
    } catch (FileNotFoundException e) {
      System.out.println(e.getMessage());
      System.exit(1);
    } catch (IOException e) {
      e.printStackTrace();
    } catch (NullPointerException e) {
      System.out.println("Error: File not found");
      System.exit(1);
    }

    System.out.print("Enter salary: ");
    Double salary = scanner.nextDouble();

    List<String> emailsWithSalaryAbove = employees.stream()
      .filter(employee -> employee.getSalary() > salary)
      .map(Employee::getEmail)
      .toList();

    Double sumSalaryEmployeeStartsWithM = employees.stream()
      .filter(employee -> employee.getName().toUpperCase().charAt(0) == 'M')
      .reduce(0d, (acc, cur) -> cur.getSalary() + acc, Double::sum);


    System.out.printf("\nEmail of people whose salary is more than %.2f:\n", salary);
    emailsWithSalaryAbove.forEach(System.out::println);

    System.out.printf("\nSum of salary of people whose name starts with 'M': %.2f", sumSalaryEmployeeStartsWithM);

  }
}
