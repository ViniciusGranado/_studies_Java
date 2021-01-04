import java.util.Scanner;

public class Exercise20 {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantas pessoas serão cadastradas? ");
    int numUsers = scanner.nextInt();

    double ageSum = 0;

    for (int i = 0; i < numUsers; i++) {
      System.out.print("Digite a idade da " + (i + 1) + " pessoa: ");
      ageSum += scanner.nextInt();
    };

    double ageMean = ageSum / numUsers;

    String usersStatus;

    if (ageMean <= 25) {
      usersStatus = "jovem";
    } else if (ageMean <= 60) {
      usersStatus = "adulta";
    } else {
      usersStatus = "idosa";
    };

    System.out.println("\nDe acordo com a média de idade, a turma é " + usersStatus);
  }
}
