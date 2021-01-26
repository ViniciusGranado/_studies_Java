import java.util.Scanner;

public class Exercise29 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];
    int[] arrayB = new int[arrayA.length];
    int[] arrayC = new int[arrayA.length + arrayB.length];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor do vetor A: ");
      arrayA[i] = input.nextInt();
    };

    System.out.println("\n-----------------------\n");
    
    for (int i = 0; i < arrayB.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor do vetor B: ");
      arrayB[i] = input.nextInt();
    };

    for (int i = 0; i < arrayC.length; i++) {
      if (i < 10) {
        arrayC[i] = arrayA[i];
      } else {
        arrayC[i] = arrayB[i - arrayB.length];
      };
    };

    System.out.print("\nArray C : [");
    for (int i = 0; i < arrayC.length; i++) {
      if (i == arrayC.length - 1) {
        System.out.print(arrayC[i] + "]");
      } else {
        System.out.print(arrayC[i] + ", ");
      };
    };

    input.close();
  }
}
