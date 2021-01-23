import java.util.Scanner;

public class Exercise26 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];
    int[] arrayB = new int[arrayA.length];
    int[] arrayC = new int[arrayA.length];
    
    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor do vetor A: ");
      arrayA[i] = input.nextInt();
    }

    System.out.println("\n---------------------------------------\n");

    for (int i = 0; i < arrayB.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor do vetor B: ");
      arrayB[i] = input.nextInt();
    }

    System.out.println("\n---------------------------------------\n");
    
    for (int i = 0; i < arrayA.length; i++) {
      if (arrayA[i] < arrayB[i]) {
        arrayC[i] = 1;
      } else if (arrayA[i] == arrayB[i]) {
        arrayC[i] = 0;
      } else {
        arrayC[i] = -1;
      };
    }

    System.out.print("Array C : [");
    for (int i = 0; i < arrayC.length; i++) {
      if (i == arrayC.length - 1) {
        System.out.print(arrayC[i] + "]");
      } else {
        System.out.print(arrayC[i] + ", ");
      }
    }
  }
}