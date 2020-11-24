import java.util.Scanner;

public class Exercise02 {
  
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int number = scan.nextInt();

    System.out.println("O número informado foi: " + number);
  }
}
