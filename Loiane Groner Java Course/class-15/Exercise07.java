import java.util.Scanner;

public class Exercise07 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double number1 = input.nextDouble();

    double minNumber = number1;
    double maxNumber = number1;

    System.out.print("Digite o segundo número: ");
    double number2 = input.nextDouble();

    maxNumber = number2 > maxNumber ? number2 : maxNumber;
    minNumber = number2 < minNumber ? number2 : maxNumber;

    System.out.print("Digite o terceiro número: ");
    double number3 = input.nextDouble();

    maxNumber = number3 > maxNumber ? number3 : maxNumber;
    minNumber = number3 < minNumber ? number3 : maxNumber;

    System.out.println("\nO maior número digitado foi " + maxNumber);
    System.out.println("O menor número digitado foi " + minNumber);
  }
}
