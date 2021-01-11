import java.util.Scanner;

public class Exercise13 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };
    
    int sumArray = 0;
    for (int i = 0; i < arrayA.length; i++) {
      if (arrayA[i] % 5 == 0) {
        sumArray += arrayA[i];
      }
    }

    System.out.println("A soma dos elementos múltiplos de 5 no array é " + sumArray);

    input.close();
  }
}
