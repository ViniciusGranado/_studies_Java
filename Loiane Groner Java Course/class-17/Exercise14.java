import java.util.Scanner;

public class Exercise14 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int userNum;
    int evenNums = 0;
    int oddNums = 0;

    for (int i = 0; i < 10; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      userNum = input.nextInt();

      if (userNum % 2 == 0) {
        evenNums++;
      } else {
        oddNums++;
      };
    };

    System.out.println("\nForam digitados " + evenNums + " números pares e " + oddNums + " números ímpares.");
  }
}
