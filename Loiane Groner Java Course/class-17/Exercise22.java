import java.util.Scanner;

public class Exercise22 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos CDs possui na coleção: ");
    int numCds = scanner.nextInt();

    System.out.println(); // Skip line

    double sumValue = 0;
    for (int i = 0; i < numCds; i++) {
      System.out.print("Digite o valor do " + (i + 1) + "º CD: ");
      sumValue += scanner.nextDouble();
    };

    double mean = sumValue / numCds;

    System.out.println("\nO valor médio de cada CD é R$" + mean);
  }
}
