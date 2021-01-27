import java.util.Scanner;

public class Exercise30 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[20];
    int[] arrayB = new int[arrayA.length];
    int[] arrayC = new int[arrayA.length];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };

    byte posB = 0;
    byte posC = 0;
    
    for (int i = 0; i < arrayA.length; i++) {
      if (arrayA[i] % 2 == 0) {
        arrayB[posB] = arrayA[i];
        posB++;
      } else {
        arrayC[posC] = arrayA[i];
        posC++;
      };
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
    for (int i = 0; i < posB; i++) {
      if (i == posB - 1) {
        System.out.print(arrayB[i] + "]");
      } else {
        System.out.print(arrayB[i] + ", ");
      };
    };

    System.out.println("\n-----------------------");

    System.out.print("Array C : [");
    for (int i = 0; i < posC; i++) {
      if (i == posC - 1) {
        System.out.print(arrayC[i] + "]");
      } else {
        System.out.print(arrayC[i] + ", ");
      };
    };

    System.out.println("\n-----------------------");

    input.close();
  } 
}
