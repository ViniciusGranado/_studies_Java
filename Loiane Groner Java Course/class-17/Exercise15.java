import java.util.Scanner;

public class Exercise15 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("-----------------------");
    System.out.println("  SEQUENCIA FIBONACCI  ");
    System.out.println("-----------------------\n");

    System.out.print("Quantos números da sequencia deseja mostrar? ");
    int sequenceNum = input.nextInt();

    int num1 = 1;
    int num2 = 1;
    int aux;

    System.out.println();

    for (int i = 0; i < sequenceNum; i++) {
      if (i == sequenceNum - 1) {
        System.out.print(num2);
      } else if (i == 0) {
        System.out.print(num2 + ", ");
      } else {
        System.out.print(num2 + ", ");

        aux = num1 + num2;
        num1 = num2;
        num2 = aux;
      };
    }
  }
}