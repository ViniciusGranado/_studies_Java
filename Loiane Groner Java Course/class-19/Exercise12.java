import java.util.Scanner;

public class Exercise12 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[] arrayA = new int[10];

    for (int i = 0; i < arrayA.length; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      arrayA[i] = input.nextInt();
    };
    
    int sumArray = 0;
    for (int i = 0; i < arrayA.length; i++) {
      sumArray += arrayA[i];
    }

    System.out.println("A soma dos elementos no array é " + sumArrayf);

    input.close();
  }
}
