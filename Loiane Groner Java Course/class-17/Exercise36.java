import java.util.Scanner;

public class Exercise36 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    double h = 0;
    double ind;

    System.out.print("Digite o valor de N: ");
    int n = scanner.nextInt();

    for (double i = 1; i <= n; i++) {
      ind = 1 / i;
      h += 1 / i;
    };

    System.out.println("\nO valor final de H é " + h);
  } 
}
