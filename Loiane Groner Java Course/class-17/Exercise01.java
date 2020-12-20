import java.util.Scanner;

public class Exercise01 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    double grade;
    do {
      System.out.print("Digite uma nota entre 0 e 10: ");
      grade = input.nextDouble();
  
      if (grade < 0 || grade > 10) {
        System.out.println("\nValor inválido, tente novamente.\n");
      };
    } while (grade < 0 || grade > 10);

    System.out.println("\nValor informado: " + grade);
  }
}