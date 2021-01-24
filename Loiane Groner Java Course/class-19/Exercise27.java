import java.util.Scanner;

public class Exercise27 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];
    char[] arrayB = new char[arrayA.length];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor do vetor A: ");
      arrayA[i] = input.nextInt();
    };

    for (int i = 0; i < arrayB.length; i++) {
      if (arrayA[i] < 7) {
        arrayB[i] = 'a';
      } else if (arrayA[i] == 7) {
        arrayB[i] = 'b';
      } else if (arrayA[i] < 10) {
        arrayB[i] = 'c';
      } else if (arrayA[i] == 10) {
        arrayB[i] = 'd';
      } else {
        arrayB[i] = 'e';
      };
    };

    System.out.print("Array B : [");
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