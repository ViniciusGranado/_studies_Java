import java.util.Scanner;

public class Exercise17 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("------------");
    System.out.println("  FATORIAL  ");
    System.out.println("------------\n");

    System.out.print("Digite um número inteiro: ");
    int userNum = scanner.nextInt();
    long factorial = 1l;

    for (int i = 2; i <= userNum; i++) {
      factorial *= i;
    };

    System.out.println("O fatorial de " + userNum + " é " + factorial);
  }
}