import java.util.Scanner;

public class Exercise09 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("-------------------------");
    System.out.println("CONVERSOR DE TEMPERATURAS");
    System.out.println("-------------------------\n");

    System.out.print("Digite a temperatura em Fahrenheit: ");
    double fahrenheit = input.nextDouble();

    double celsius = (5 * (fahrenheit - 32) / 9);

    System.out.println("\n" + fahrenheit + "°F equivale a " + celsius + "°C.");
  }
}