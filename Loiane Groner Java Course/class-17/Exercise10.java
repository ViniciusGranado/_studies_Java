import java.util.Scanner;

public class Exercise10 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o primeiro número inteiro: ");
    int num1 = input.nextInt();

    System.out.print("Digite o segundo número inteiro: ");
    int num2 = input.nextInt();
    
    System.out.print("\nOs números inteiros que estão entre os números digitados são: ");
    if (num1 < num2) {
      for (int i = num1 + 1; i < num2; i++) {
        System.out.print(i + " ");
      };
    } else {
      for (int i = num1 - 1; i > num2; i--) {
        System.out.print(i + " ");
      };
    };
  }
}