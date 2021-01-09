import java.util.Scanner;

public class Exercise10 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    double[] a = new double[10];
    double[] b = new double[a.length];

    for (int i = 0; i < a.length; i++) {
      System.out.print("DIgite o " + (i + 1) + "º número do vetor A: ");
      a[i] = scanner.nextInt();
    };

    System.out.println();
    
    for (int i = 0; i < b.length; i++) {
      b[i] = a[i] % 2;
    };

    System.out.print("\nVETOR A: [");
    for (int i = 0; i < a.length; i++) {
      if (i == a.length - 1) {
        System.out.print(a[i] + "]");
      } else {
        System.out.print(a[i] + ", ");
      }
    };

    System.out.print("\nVETOR B: [");
    for (int i = 0; i < b.length; i++) {
      if (i == b.length - 1) {
        System.out.print(b[i] + "]");
      } else {
        System.out.print(b[i] + ", ");
      }
    };

    scanner.close();
  }
}