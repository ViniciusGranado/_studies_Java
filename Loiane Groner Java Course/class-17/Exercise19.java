import java.util.Scanner;

public class Exercise19 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantas notas deseja entrar? ");
    int numGrades = scanner.nextInt();

    System.out.println(); // Skip line

    double sumGrades = 0;
    for (int i = 0; i < numGrades; i++) {
      System.out.print("Digite a " + (i + 1) + "ª nota: ");
      sumGrades += scanner.nextDouble();
    };

    double mean = sumGrades / numGrades;

    System.out.println("\nA média das notas apresentadas é: " + mean);
  }
}
