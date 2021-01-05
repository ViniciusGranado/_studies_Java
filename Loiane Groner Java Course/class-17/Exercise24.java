import java.util.Scanner;

public class Exercise24 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("-------------------------");
    System.out.print("  PADARIA DO SR. MANOEL  ");
    System.out.print("-------------------------\n");
    
    System.out.print("\nDigite o valor do pão: R$");
    double value = scanner.nextDouble();

    for (int i = 1; i <= 50; i++) {
      System.out.println(i + " - R$" + (value * i));
    };
  }
}
