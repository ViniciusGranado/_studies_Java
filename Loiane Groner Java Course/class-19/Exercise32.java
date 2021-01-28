import java.util.Scanner;

public class Exercise32 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[5];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };

    for (int i = 0; i < arrayA.length; i++) {
      System.out.println("-----------------------");
      System.out.println("Tabuada do " + arrayA[i] + ": ");

      for (int j = 1; j <= 10; j++) {
        System.out.println(arrayA[i] + " X " + j + " = " + (arrayA[i] * j));
      }
    }
    System.out.println("-----------------------");

    input.close();
  } 
}
