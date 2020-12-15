import java.util.Scanner;

public class Exercise17 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite um ano: ");
    int year = input.nextInt();

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
      System.out.print("\nO ano digitado é bissexto");
    } else {
      System.out.print("\nO ano digitado não é bissexto");
    };
  }
}
