import java.util.Scanner;

public class Exercise15 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };
    
    double evenValues = 0;
    double oddValues = 0;
    for (int i = 0; i < arrayA.length; i++) {
      if (arrayA[i] % 2 == 0) {
        evenValues++;
      } else {
        oddValues++;
      };
    };

    double evenPercent = (100 * evenValues) / arrayA.length;
    double oddPercent = (100 * oddValues) / arrayA.length;

    System.out.println("A porcentagem de valores pares no array é " + evenPercent + "%");
    System.out.println("A porcentagem de valores ímpares no array é " + oddPercent + "%");

    input.close();
  }
}
