import java.util.Scanner;

public class Exercise09 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    double[] a = new double[10];
    double[] b = new double[a.length];
    double[] c = new double[a.length];

    for (int i = 0; i < a.length; i++) {
      System.out.print("DIgite o " + (i + 1) + "º número do vetor A: ");
      a[i] = scanner.nextInt();
    };

    System.out.println();
    
    for (int i = 0; i < b.length; i++) {
      System.out.print("DIgite o " + (i + 1) + "º número do vetor B: ");
      b[i] = scanner.nextInt();
    };

    for (int i = 0; i < c.length; i++) {
      c[i] = a[i] / b[i];
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

    System.out.print("\nVETOR C: [");
    for (int i = 0; i < c.length; i++) {
      if (i == c.length - 1) {
        System.out.print(c[i] + "]");
      } else {
        System.out.print(c[i] + ", ");
      }
    };

    scanner.close();
  }
}