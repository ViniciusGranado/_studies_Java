import java.util.Scanner;

public class Exercise02 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] a = new int[8];
    int[] b = new int[a.length];

    for (int i = 0; i < a.length; i++) {
      System.out.print("DIgite o " + (i + 1) + "º número: ");
      a[i] = scanner.nextInt();

      b[i] = (a[i] * 2);
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
        System.out.print(b[i] + "]");
      } else {
        System.out.print(b[i] + ", ");
      }
    };

    scanner.close();
  }
}