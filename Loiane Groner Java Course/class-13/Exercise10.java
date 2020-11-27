import java.util.Scanner;

public class Exercise10 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("-------------------------");
    System.out.println("CONVERSOR DE TEMPERATURAS");
    System.out.println("-------------------------\n");

    System.out.print("Digite a temperatura em Celsius: ");
    double celsius = input.nextDouble();

    double fahrenheit =  celsius * 1.8 + 32;

    System.out.println("\n" + celsius + "°C equivale a " + fahrenheit + "°F.");
  }
}