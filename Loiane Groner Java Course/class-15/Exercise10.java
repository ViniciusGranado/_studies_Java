import java.util.Scanner;

public class Exercise10 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Em que turno você estuda? [M/T/N] ");
    char shift = input.next().charAt(0);

    switch (Character.toUpperCase(shift)) {
      case 'M':
        System.out.println("\nBom dia!");
        break;

      case 'T':
        System.out.println("\nBoa tarde!");
        break;

      case 'N':
        System.out.println("\nBoa noite!");
        break;

      default:
        System.out.println("\nValor inválido.");
    };
  }
}
