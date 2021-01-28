import java.util.Scanner;

public class Exercise36 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[11];
    
    for (int i = 0; i < arrayA.length; i++) {
      arrayA[i] = (int) Math.pow(2, i);
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

    input.close();
  } 
}
