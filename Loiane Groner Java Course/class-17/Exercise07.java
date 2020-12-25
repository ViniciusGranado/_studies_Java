import java.util.Scanner;

public class Exercise07 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    double userNumber = 0;
    double maxNumber = 0;

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      userNumber = input.nextDouble();

      if (i == 0) {
        maxNumber = userNumber;
      } else {
        if (userNumber > maxNumber) {
          maxNumber = userNumber;
        };
      };
    };

    System.out.println("\nO maior número digitado foi: " + maxNumber);
  }
}
