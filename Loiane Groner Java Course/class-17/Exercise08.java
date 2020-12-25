import java.util.Scanner;

public class Exercise08 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    double numbersSum = 0;

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o " + (i + 1) + "º número: ");
      numbersSum += input.nextDouble(); 
    };

    double numbersMean = numbersSum / 5;

    System.out.println("A soma dos números digitados é: " + numbersSum);
    System.out.println("A média dos números digitados é: " + numbersMean);
  }
}