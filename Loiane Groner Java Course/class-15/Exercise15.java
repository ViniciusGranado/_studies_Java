import java.util.Scanner;

public class Exercise15 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("-------------------------");
    System.out.println("  ANALISANDO TRIÂNGULOS  ");
    System.out.println("-------------------------\n");

    double sideA, sideB, sideC;

    System.out.print("Digite o valor do lado A: ");
    sideA = input.nextDouble();

    System.out.print("Digite o valor do lado B: ");
    sideB = input.nextDouble();

    System.out.print("Digite o valor do lado C: ");
    sideC = input.nextDouble();

    if ((sideA + sideB > sideC) && (sideB + sideC > sideA) && (sideA + sideC > sideB)) {
      System.out.println("\nOs lados formam um triângulo.");

      if ((sideA == sideB) && (sideB == sideC)) {
        System.out.print("O triãngulo é equilátero.");
      } else if ((sideA == sideB) || (sideB == sideC) || (sideA == sideC)) {
        System.out.print("O triângulo é isósceles.");
      } else {
        System.out.print("O triângulo é escaleno.");
      };
    } else {
      System.out.println("\nOs lados não formam um triângulo.");
    };
  }
}
