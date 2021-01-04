import java.util.Scanner;

public class Exercise18 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int userNumber = scanner.nextInt();
    
    boolean isPrimeNumber = true;

    for (int i = 2; i < userNumber; i++) {
      if (userNumber % i == 0) {
        isPrimeNumber = false;
        break;
      };
    };

    if (isPrimeNumber) {
      System.out.println("\nO número " + userNumber + " é primo.");
    } else {
      System.out.println("\nO número " + userNumber + " não é primo.");
    };
  }
}
