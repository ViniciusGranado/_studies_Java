import java.util.Scanner;

public class Exercise35 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };

    System.out.println("\n-----------------------");

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Divisores do número " + arrayA[i] + ": ");

      for (int j = 1; j < arrayA[i]; j++) {
        if (arrayA[i] % j == 0) {
          System.out.print(j + " ");
        }
      };

      System.out.println("\n-----------------------");
    };


    input.close();
  } 
}
