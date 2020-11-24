import java.util.Scanner;

public class Exercise03 {
  
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int firstNumber = scan.nextInt();

    System.out.print("Digite o segundo número: ");
    int secondNumber = scan.nextInt();

    System.out.print("A soma de " + firstNumber + " e " + secondNumber + " é " + (firstNumber + secondNumber));
  }
}
