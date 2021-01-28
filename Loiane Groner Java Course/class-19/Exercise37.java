import java.util.Scanner;

public class Exercise37 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[15];
    long[] arrayB = new long[arrayA.length];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };

    long factorial;
    for (int i = 0; i < arrayA.length; i++) {
      factorial = 1;

      for (int j = arrayA[i]; j > 1; j--) {
        factorial *= j;
      };

      arrayB[i] = factorial;
    };

    System.out.println("\n-----------------------");

    System.out.print("Array A : [");
    for (int i = 0; i < arrayA.length; i++) {
      if (i == arrayA.length - 1) {
        System.out.print(arrayA[i] + "]");
      } else {
        System.out.print(arrayA[i] + ", ");
      };
    };

    System.out.println("\n-----------------------");

    System.out.print("Array B : [");
    for (int i = 0; i < arrayB.length; i++) {
      if (i == arrayB.length - 1) {
        System.out.print(arrayB[i] + "]");
      } else {
        System.out.print(arrayB[i] + ", ");
      };
    };

    System.out.println("\n-----------------------");

    input.close();
  } 
}
