import java.util.Scanner;

public class Exercise18 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];
    int maxAge = 0;
    int maxInd = 0;
    int minAge = 0;
    int minInd = 0;

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };

    for (int i = 0; i < arrayA.length; i++) {
      if (i == 0) {
        maxAge = arrayA[i];
        minAge = arrayA[i];
        maxInd = i;
        minInd = i;
      } else {
        if (arrayA[i] < minAge) {
          minAge = arrayA[i];
          minInd = i;
        }
        if (arrayA[i] > maxAge) {
          maxAge = arrayA[i];
          maxInd = i;
        }
      }
    }

    System.out.println("\nA menor idade registrada foi " + minAge + " na posição " + minInd);
    System.out.println("A maior idade registrada foi " + maxAge + " na posição " + maxInd);
    input.close();
  }
}
