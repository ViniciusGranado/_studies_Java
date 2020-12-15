import java.util.Scanner;

public class Exercise18 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro: ");
    int userNumber = input.nextInt();

    System.out.println("\nO número " + userNumber + " é " + (userNumber % 2 == 0 ? "par" : "ímpar"));
  }
}
