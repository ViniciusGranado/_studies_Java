import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise20 {
  public static void main (String[] args) {
    DecimalFormat format = new DecimalFormat("#,###.00");
    Scanner scanner = new Scanner(System.in);

    double dolarQuote;
    double[] arrayA = new double[20];

    System.out.print("Digite a cotação atual do dolar: R$");
    dolarQuote = scanner.nextDouble();

    for (int i = 0; i < arrayA.length; i++) {
      arrayA[i] = dolarQuote * (i + 1);
    };

    for (int i = 0; i < arrayA.length; i++) {
      System.out.println("US$" + (i + 1) + " = R$" + format.format(arrayA[i]));
    };
  }
}
