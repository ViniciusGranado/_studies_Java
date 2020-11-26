import java.util.Scanner;

public class Exercise08 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("----------------------");
    System.out.println("CALCULADORA DE SALÁRIO");
    System.out.println("----------------------\n");

    System.out.print("Quanto você ganha por hora: ");
    double hourPrice = input.nextDouble();

    System.out.print("\nQuantas horas você trabalhou nesse mês: ");
    int hoursWorked = input.nextInt();

    double salary = hourPrice * hoursWorked;

    System.out.println("\nO seu salário nesse mês será R$" + salary);
  }
}