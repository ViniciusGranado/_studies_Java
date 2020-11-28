import java.util.Scanner;

public class Exercise13 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("--------------------------");
    System.out.println("  CALCULADORA DE SALÁRIO  ");
    System.out.println("--------------------------\n");

    System.out.print("Quanto você ganha por hora: R$");
    double hourPrice = input.nextDouble();

    System.out.print("Quantas horas você trabalhou esse mês: ");
    double hoursWorked = input.nextDouble();

    double salary = hourPrice * hoursWorked;

    double ir = salary * 11 / 100;
    double inss = salary * 8 / 100;
    double syndicate = salary * 5 / 100;
    double totalDiscounts = ir + inss + syndicate;
    double finalSalary = salary - totalDiscounts;

    System.out.println("\nO salário bruto será R$" + salary);
    System.out.println("Você irá pagar R$" + ir + " de Imposto de Renda.");
    System.out.println("Você irá pagar R$" + inss + " de INSS.");
    System.out.println("Você irá pagar R$" + syndicate + " para o sindicato.");
    System.out.println("O total de descontos será: R$" + totalDiscounts);
    System.out.println("O salário liquido será R$" + finalSalary);
  }
}
