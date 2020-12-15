import java.util.Scanner;

public class Exercise16 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("---------------------");
    System.out.println("  RAÍZES DA EQUAÇÃO  ");
    System.out.println("---------------------\n");

    System.out.print("Digite o valor de A: ");
    double valueA = input.nextDouble();

    if (valueA == 0) {
      System.out.println("\nA equação não é de segundo grau.");
    } else {
      System.out.print("Digite o valor de B: ");
      double valueB = input.nextDouble();
  
      System.out.print("Digite o valor de C: ");
      double valueC = input.nextDouble();

      double delta = (Math.pow(valueB, 2) - (4 * valueA * valueC));
      
      if (delta < 0) {
        System.out.println("\nA equação não possui raízes.");
      } else if (delta == 0) {
        double root1 = (-valueB + Math.sqrt(delta)) / (2 * valueA);

        System.out.println("\nA equação possui uma raiz: " + root1);
      } else {
        double root1 = (-valueB + Math.sqrt(delta)) / (2 * valueA);
        double root2 = (-valueB - Math.sqrt(delta)) / (2 * valueA);

        System.out.println("\nA equação possui duas raízes: " + root1 + " e " + root2);
      }
    }
  }
}
