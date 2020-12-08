import java.util.Scanner;

public class Exercise03 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite o seu gênero: [M/F] ");
    String gender = input.next();

    if (gender.equalsIgnoreCase("M")) {
      System.out.print("\nGênero masculino.");
    } else if (gender.equalsIgnoreCase("F")) {
      System.out.print("\nGênero feminino.");
    } else {
      System.out.print("\nGênero inválido.");
    }
  }
}
