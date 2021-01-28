import java.util.Scanner;

public class Exercise33 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };

    System.out.println();

    boolean isPrime;
    for (int i = 0; i < arrayA.length; i++) {
      isPrime = true;

      if (arrayA[i] <= 1) {
        isPrime = false;
      } else {
        for (int j = 2; j < arrayA[i]; j++) {
          if ((arrayA[i] <= 1) || (arrayA[i] % j == 0)) {
            isPrime = false;
            break;
          };
        };
      };

      System.out.println("Número " + arrayA[i] + ": " + (isPrime ? "É um número primo." : "Não é um número primo."));
    }

    input.close();
  } 
}
