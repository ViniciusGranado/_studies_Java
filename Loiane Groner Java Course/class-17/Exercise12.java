import java.util.Scanner;

public class Exercise12 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
  
    int userNumber;
    boolean isNumberValid;
  
    do {
      isNumberValid = true;

      System.out.print("Digite um número inteiro entre 1 e 10: ");
      userNumber = input.nextInt();
  
      if (userNumber < 1 || userNumber > 10) {
        System.out.println("Valor inválido, tente novamente.\n");
        isNumberValid = false;
      }
    } while (!isNumberValid);
  
    System.out.println("\n-------------------");
    System.out.println("   Tabuada do " + userNumber);
    System.out.println("-------------------");

    for (int i = 1; i <= 10; i++) {
      System.out.println(userNumber + " X " + i + " = " + (userNumber * i));
    };
  }
}
