import java.util.Scanner;

public class Exercise23 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digite um número inteiro: ");
      numbers[i] = input.nextInt();

      if (numbers[i] % 2 != 0) {
        System.out.println("Número digitado foi ímpar.");
        break;
      };
    };

    input.close();
  }
}
