import java.util.Scanner;

public class Exercise24 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[10];
    
    for (int i = 0; i < numbers.length; i++) {
      System.out.print("Digite o " + (i + 1 ) + "º valor: ");
      numbers[i] = input.nextInt();
    };
    
    boolean isPalidrome = true;
    for (int i = 0; i < numbers.length / 2; i++) {
      if (numbers[i] != numbers[(numbers.length - 1) - i]) {
        isPalidrome = false;
        break;
      }
    };

    if (isPalidrome) {
      System.out.println("\nO vetor é um palíndromo.");
    } else {
      System.out.println("\nO vetor não é um palíndromo.");
    }

    input.close();
  }
}
