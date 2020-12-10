import java.util.Scanner;

public class Exercise09 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    double number1, number2, number3;

    System.out.print("Digite o primeiro número: ");
    number1 = input.nextDouble();

    System.out.print("Digite o segundo número: ");
    number2 = input.nextDouble();

    System.out.print("Digite o terceiro número: ");
    number3 = input.nextDouble();

    if (number1 >= number2 && number1 >= number3) {
      if (number2 >= number3) {
        System.out.println("\nOs números em ordem decrescente são: " + number1 + ", " + number2 + " e " + number3);
      } else {
        System.out.println("\nOs números em ordem decrescente são: " + number1 + ", " + number3 + " e " + number2);
      };
    } else if (number2 >= number1 && number2 >= number3) {
      if (number1 >= number3) {
        System.out.println("\nOs números em ordem decrescente são: " + number2 + ", " + number1 + " e " + number3);
      } else {
        System.out.println("\nOs números em ordem decrescente são: " + number2 + ", " + number3 + " e " + number1);
      };
    } else {
      if (number1 >= number2) {
        System.out.println("\nOs números em ordem decrescente são: " + number3 + ", " + number1 + " e " + number2);
      } else {
        System.out.println("\nOs números em ordem decrescente são: " + number3 + ", " + number2 + " e " + number1);
      };
    };
  }
}
