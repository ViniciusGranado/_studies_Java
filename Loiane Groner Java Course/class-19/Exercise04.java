import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercise04 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat format = new DecimalFormat("###,###.###");

    int[] a = new int[15];
    double[] b = new double[a.length];

    for (int i = 0; i < a.length; i++) {
      System.out.print("DIgite o " + (i + 1) + "º número: ");
      a[i] = scanner.nextInt();

      b[i] = Math.sqrt(a[i]);
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
    for (int i = 0; i < a.length; i++) {
      if (i == b.length - 1) {
        System.out.print(format.format(b[i]) + "]");
      } else {
        System.out.print(format.format(b[i]) + ", ");
      }
    };

    scanner.close();
  }
}