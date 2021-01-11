import java.util.Scanner;

public class Exercise14 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };
    
    double oddSumArray = 0;
    double oddValues = 0;
    for (int i = 0; i < arrayA.length; i++) {
      if (arrayA[i] % 2 != 0) {
        oddSumArray += arrayA[i];
        oddValues++;
      };
    };

    double oddValuesMean = oddSumArray / oddValues;

    System.out.println("\nA soma dos elementos múltiplos de 5 no array é " + oddValuesMean);

    input.close();
  }
}
