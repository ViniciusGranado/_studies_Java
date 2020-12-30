import java.util.Scanner;

public class Exercise13 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int base;
    int exponent;
    int product = 1;

    System.out.print("Entre com a base: ");
    base = input.nextInt();

    System.out.print("Entre com o expoente: ");
    exponent = input.nextInt();

    for (int i = 0; i < exponent; i++) {
      product *= base;
    };

    System.out.println("\n" + base + " elevado à " + exponent + " é igual a " + product);
  }
}