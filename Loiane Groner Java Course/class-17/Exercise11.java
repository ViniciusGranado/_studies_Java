import java.util.Scanner;

public class Exercise11 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o primeiro número inteiro: ");
    int num1 = input.nextInt();

    System.out.print("Digite o segundo número inteiro: ");
    int num2 = input.nextInt();
    
    System.out.print("\nOs números inteiros que estão entre os números digitados são: ");

    int forLoopIncrement = num1 < num2 ? 1 : -1;
    
    int sum = 0;
    for (int i = num1 + forLoopIncrement; i != num2; i += forLoopIncrement) {
      System.out.print(i + " ");
      sum += i;
    };

    System.out.println("\nA soma dos números é: " + sum);
  }
}