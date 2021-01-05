import java.util.Scanner;

public class Exercise26 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("------------");
    System.out.println("  FATORIAL  ");
    System.out.println("------------\n");

    System.out.print("Digite um número inteiro: ");
    int userNum = scanner.nextInt();
    long factorial = 1l;

    System.out.println("\nFatorial de: " + userNum);

    System.out.print(userNum + "! = ");
    for (int i = userNum; i > 1; i--) {
      System.out.print(i + " . ");

      factorial *= i;
    };

    System.out.print("1 = " + factorial);
  }
}