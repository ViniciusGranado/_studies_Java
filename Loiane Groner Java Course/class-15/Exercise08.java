import java.util.Scanner;

public class Exercise08 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    double produto1, produto2, produto3;

    System.out.print("Digite o preço do primeiro produto: R$");
    produto1 = input.nextDouble();

    System.out.print("Digite o preço do primeiro produto: R$");
    produto2 = input.nextDouble();

    System.out.print("Digite o preço do primeiro produto: R$");
    produto3 = input.nextDouble();

    if (produto1 <= produto2 && produto1 <= produto3) {
      System.out.println("\nCompre o primeiro produto.");
    } else if (produto2 <= produto1 && produto2 <= produto3) {
      System.out.println("\nCompre o segundo produto.");
    } else {
      System.out.println("\nCompre o terceiro produto.");
    };
  }
}
