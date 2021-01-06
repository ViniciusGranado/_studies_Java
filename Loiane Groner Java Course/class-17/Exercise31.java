import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exercise31 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o salário inicial: R$");
    double startSalary = scanner.nextDouble();

    int startYear = 1995;
    int curYear = Calendar.getInstance().get(Calendar.YEAR);
    double raiseInd = 1.5;
    double newSalary = startSalary;

    DecimalFormat format = new DecimalFormat("###,###.##");

    for (int i = startYear + 1; i <= curYear; i++) {
      newSalary += newSalary * raiseInd / 100;

      raiseInd *= 2;
    };

    System.out.println("\nO salário inicial em " + startYear + " era: R$" + startSalary);
    System.out.println("O salário atua é R$" + format.format(newSalary));
  }
}
