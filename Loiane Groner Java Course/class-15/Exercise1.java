import java.util.Scanner;

public class Exercise1 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int number1 = input.nextInt();

    System.out.print("Digite outro número inteiro: ");
    int number2 = input.nextInt();

    int greaterNumber = number1 > number2 ? number1 : number2;

    System.out.print("\nO maior número digitado foi: " + greaterNumber);
  }
}