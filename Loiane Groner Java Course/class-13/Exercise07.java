import java.util.Scanner;

public class Exercise07 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("---------------------------");
    System.out.println("O DOBRO DA ÁREA DO QUADRADO");
    System.out.println("---------------------------\n");

    System.out.print("Digite a altura do quadrado: ");
    double height = input.nextDouble();

    System.out.print("Digite a base do quadrado: ");
    double width = input.nextDouble();

    double doubleSquareArea = (height * width) * 2;

    System.out.print("\nO dobro da área do quadrado é: " + doubleSquareArea);
  }
}
