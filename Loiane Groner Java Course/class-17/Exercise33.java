import java.util.Scanner;

public class Exercise33 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);


    System.out.print("Quantos termos da série deseja mostrar? ");
    int n = scanner.nextInt();
    
    System.out.print("S = ");
    for (int i = 1, m = 1; i <= n; i++, m += 2) {
      if (i == n) {
        System.out.print(i + "/" + m + ".");
      } else {
        System.out.print(i + "/" + m + " + ");
      }
    };
  }
}
