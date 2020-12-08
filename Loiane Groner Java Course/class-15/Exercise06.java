import java.util.Scanner;

public class Exercise06 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double maxNumber = input.nextDouble();

    System.out.print("Digite o segundo número: ");
    double secondNumber = input.nextDouble();
    if (secondNumber > maxNumber) {
      maxNumber = secondNumber;
    };

    System.out.print("Digite o terceiro número: ");
    double thirdNumber = input.nextDouble();
    if (thirdNumber > maxNumber) {
      maxNumber = thirdNumber;
    };

    System.out.print("O maior número digitado foi " + maxNumber);
  }
}
