import java.util.Scanner;

public class Exercise27 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("-------------------------");
    System.out.println("  SISTEMA METEOROLÓGICO  ");
    System.out.println("-------------------------\n");

    System.out.print("Quantas temperaturas serão analisadas? ");
    int numTemp = scanner.nextInt();
    System.out.println(); // Skip line

    double minTemp = 0;
    double maxTemp = 0;
    double sumTemp = 0;
    double currTemp;

    for (int i = 0; i < numTemp; i++) {
      System.out.print("Digite a " + (i + 1) + "ª temperatura: ");
      currTemp = scanner.nextDouble();
      sumTemp += currTemp;

      if (i == 0) {
        minTemp = currTemp;
        maxTemp = currTemp;
      } else {
        if (currTemp > maxTemp) {
          maxTemp = currTemp;
        } else if (currTemp < minTemp) {
          minTemp = currTemp;
        };
      };
    };

    double meanTemp = sumTemp / numTemp;
    
    System.out.println("\nA temperatura máxima registrada foi " + maxTemp + "°C.");
    System.out.println("A temperatura mínima registrada foi " + minTemp + "°C.");
    System.out.println("A média das temperaturas foi " + meanTemp + "°C.");
  }
}
