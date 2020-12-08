import java.util.Scanner;

public class Exercise02 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int userNumber = input.nextInt();

    if (userNumber > 0) {
      System.out.print("\nO número digitado é positivo.");
    } else if (userNumber < 0) {
      System.out.print("\nO número digitado é negativo.");
    } else {
      System.out.print("\nO número digitado foi zero.");
    }
  }
}
