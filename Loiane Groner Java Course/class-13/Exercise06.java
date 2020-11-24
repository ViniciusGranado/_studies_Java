import java.util.Scanner;

public class Exercise06 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("------------------------------");
    System.out.println("CALCULADORA DE ÁREA DE CÍRCULO");
    System.out.println("------------------------------\n");

    System.out.print("Digite o raio do círculo: ");
    double radius = input.nextDouble();

    double circleArea = Math.PI * (Math.pow(radius, 2));

    System.out.print("\nA área do círculo é: " + circleArea);
  }
}
