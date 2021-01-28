import java.util.Scanner;

public class Exercise31 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[20];
    int[] arrayB = new int[arrayA.length];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };

    int posB = 0;
  
    for (int i = 0; i < arrayA.length; i++) {
      if (arrayA[i] % 2 == 0) {
        arrayB[posB] = arrayA[i];
        posB++;
      }
    };

    for (int i = 0; i < arrayA.length; i++) {
      if (arrayA[i] % 2 != 0) {
        arrayB[posB] = arrayA[i];
        posB++;
      }
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
