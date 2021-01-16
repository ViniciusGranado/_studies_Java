import java.util.Scanner;

public class Exercise17 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];
    int peopleWithMoreThan35 = 0;

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();

      peopleWithMoreThan35 += (arrayA[i] > 35 ? 1 : 0);
    };

    System.out.println("\n" + peopleWithMoreThan35 + " pessoas tem mais de 35 anos.");

    input.close();
  }
}