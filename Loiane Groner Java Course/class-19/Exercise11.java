import java.util.Scanner;

public class Exercise11 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };
    
    int evenValues = 0;
    for (int i = 0; i < arrayA.length; i++) {
      if (arrayA[i] % 2 == 0) {
        evenValues++;
      };
    }
    
    System.out.println("\nHá " + evenValues + " valores pares no array.");
  }
}
