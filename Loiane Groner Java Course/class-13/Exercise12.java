import java.util.Scanner;

public class Exercise12 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("------------------");
    System.out.println("    PESO IDEAL    ");
    System.out.println("------------------\n");


    System.out.print("Digite a sua altura (exemplo: 1.70): ");
    double height = input.nextDouble();

    double idealWeight = (72.7 * height) - 58;

    System.out.println("\nO seu peso ideal é " + idealWeight + " Kg.");
  }
}
