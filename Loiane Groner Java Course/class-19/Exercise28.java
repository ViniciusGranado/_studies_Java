import java.util.Scanner;


public class Exercise28 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];
    int[] arrayB = new int[arrayA.length];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor do vetor A: ");
      arrayA[i] = input.nextInt();
    };

    for (int i = 0; i < arrayB.length; i++) {
      arrayB[i] = arrayA[(arrayA.length - 1) - i];
    };

    System.out.print("\nArray B : [");
    for (int i = 0; i < arrayB.length; i++) {
      if (i == arrayB.length - 1) {
        System.out.print(arrayB[i] + "]");
      } else {
        System.out.print(arrayB[i] + ", ");
      };
    };

    input.close();
  }
}
