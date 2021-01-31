import java.util.Scanner;

public class Exercise03 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    int[][] values = new int[3][3];
    int evenValues = 0;
    int oddValues = 0;

    // Insert random values on the array
    int counter = 1;
    for (int i = 0; i < values.length; i++) {
      for (int j = 0; j < values[i].length; j++) {
       System.out.print("Insira o " + counter + "º valor: ");
       values[i][j] = input.nextInt();

       counter++;
      };
    };


    // Print the array and get number of odds and evens
    System.out.println();
    for (int i = 0; i < values.length; i++) {
      for (int j = 0; j < values[i].length; j++) {
        System.out.print(values[i][j] + "     ");

        if (values[i][j] % 2 == 0) {
          evenValues++;
        } else {
          oddValues++;
        };
      }
      System.out.println("\n");
    }

    // Print the result
    System.out.println("Existem " + evenValues + " valores pares no array.");
    System.out.println("Existem " + oddValues + " valores ímpares no array.");

    input.close();
  }
}