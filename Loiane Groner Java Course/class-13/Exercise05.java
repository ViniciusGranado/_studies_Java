import java.util.Scanner;

public class Exercise05 {

  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite uma medida em metros: ");
    double meters = scan.nextDouble();

    double centimeters = meters * 100;

    System.out.println(meters + " metros é igual a: " + centimeters + "cm");
  }
}
